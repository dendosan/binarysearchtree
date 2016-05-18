package fun.with.trees;

public class EmptyBST<T extends Comparable<T>> implements Tree<T> {

   public EmptyBST() {
      
   }

   @Override
   public boolean isEmpty() {
      return true;
   }

   @Override
   public int cardinality() {
      return 0;
   }

   @Override
   public boolean member(T elt) {
      return false;
   }

   @Override
   public NonEmptyBST<T> add(T elt) {
      return new NonEmptyBST<T>(elt);
   }
   
}