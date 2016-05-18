package fun.with.trees;

public interface Tree<T extends Comparable<T>> {

   public boolean isEmpty();
   public int cardinality();
   public boolean member(T elt);
   public NonEmptyBST<T> add(T elt);
}