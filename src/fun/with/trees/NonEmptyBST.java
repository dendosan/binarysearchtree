package fun.with.trees;

public class NonEmptyBST<T extends Comparable<T>> implements Tree<T> {

   T data;
   Tree<T> left;
   Tree<T> right;
   
   public NonEmptyBST(T elt) {
      data = elt;
      left = new EmptyBST<T>();
      right = new EmptyBST<T>();
   }

   public NonEmptyBST(T elt, Tree<T> leftTree, Tree<T> rightTree) {
      data = elt;
      left = leftTree;
      right = rightTree;
   }

   @Override
   public boolean isEmpty() {
      return false;
   }

   @Override
   public int cardinality() {
      return 1 + left.cardinality() + right.cardinality();
   }

   @Override
   public boolean member(T elt) {
      if ( elt.compareTo(data) == 0 ) {
         return true;
      } else {
         if ( elt.compareTo(data) < 0 ) {
            return left.member(elt);
         } else {
            return right.member(elt);
         }
      }
   }

   @Override
   public NonEmptyBST<T> add(T elt) {
      if ( elt.compareTo(data) == 0 ) {
         return this;
      } else {
         if ( elt.compareTo(data) < 0 ) {
            return new NonEmptyBST<T>(data, left.add(elt), right);
         } else {
            return new NonEmptyBST<T>(data, left, right.add(elt));
         }
      }
   }

}
