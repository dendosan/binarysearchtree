package fun.with.trees;

public class BinarySearchTree {

   /**
    * 
    * @param args
    */
   public static void main(String[] args) {
      Integer[] test1 = { 3, 5, 2, 1, 4, 6, 7 };
      
      Tree<Integer> tree1 = new EmptyBST<Integer>();

      for ( Integer i : test1 ) {
         tree1 = tree1.add(i);
      }
      
      System.out.println("tree1 contains " + tree1.cardinality() + " members.");
      
   }
}