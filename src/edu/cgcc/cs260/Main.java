package edu.cgcc.cs260;

public class Main {

	public static void main(String[] args) {
		int[] iArr = new int[] {10,8,7,9,15,12,17,16,18}; //add (Left-Left): 6,4; b < a < c
		int[] iArr1 = new int[] {10,8,7,9,15,14,17};//add (Right-Right): 18,19; c < a < b
		int[] iArr2 = new int[] {10,7,4,9,15,14,16,2,3}; //add (Left-Right): 2, 3; a < b < c
		AVLTree avl = new AVLTree();
		//create tree
		for(int i = 0; i < iArr2.length; i++) {
			avl.insert(iArr2[i]);
		}
		//avl.preOrder();
		System.out.println("Pre Order w/ Balance Factor:");
		avl.preOrder();
		System.out.println();
		avl.printBalancePreOrder();
		
		System.out.println();
		System.out.println("Pre Order w/ Balance Factor:");
		avl.preOrder();
		System.out.println();
		avl.printBalancePreOrder();
		
//		//duplicate insert
//		System.out.println();
//		avl.insert(1);
//		System.out.println();
//		
//		//delete person
//		System.out.println();
//		avl.delete(1);
//		System.out.println();
//		avl.preOrder();
//		System.out.println();
//		
//		
	}
	
}
	
	
		/**
		 * RECURSION DRIVER PROGRAM
		 */
		//recurse through file system
		/*
		 * System.out.println("\n\n\nRecursion Get:\n"); Recursion.q.clear();
		 * Recursion.recursionGet(Recursion.root);
		 * 
		 * while(!Recursion.q.isEmpty()) { System.out.println(Recursion.q.remove()); }
		 */
		
		
		//iterate through file system
		/*
		 * System.out.println("\n\n\nIterative Get:\n");
		 * Recursion.iterativeGet(Recursion.root);
		 * 
		 * while(!Recursion.q.isEmpty()) { System.out.println(Recursion.q.remove()); }
		 */
		
		
		/**
		 * BINARY TREE & BINARY SEARCH TREE DRIVER PROGRAM
		 */
		/*
		 * //Create tree nodes BSTNode a = new BSTNode("A"); BSTNode b = new
		 * BSTNode("B"); BSTNode c = new BSTNode("C"); BSTNode d = new BSTNode("D");
		 * BSTNode e = new BSTNode("E"); BSTNode f = new BSTNode("F"); BSTNode g = new
		 * BSTNode("G"); BSTNode h = new BSTNode("H"); BSTNode i = new BSTNode("I");
		 * BSTNode j = new BSTNode("J"); BSTNode k = new BSTNode("K");
		 * 
		 * //build tree manually BSTNode root = a; root.left = b; root.right = c; b.left
		 * = d; b.right = e; d.left = h; d.right = i; e.left = j; c.left = f; c.right =
		 * g; g.left = k;
		 * 
		 * BinarySearchTree bt = new BinarySearchTree(root);
		 * 
		 * System.out.print("Pre Order Traverse: "); bt.preOrder();
		 * System.out.println(); System.out.print("In Order Traverse: "); bt.inOrder();
		 * System.out.println(); System.out.print("Post Order Traverse: ");
		 * bt.postOrder();
		 * int[] iArray = new int[] {8,10,14,3,6,7,1,4,13};
		 * int[] iArraySorted = new int[] {1,3,4,6,7,8,10,13,14};
		 * BinarySearchTree bt = new BinarySearchTree();
		 * bt.insert(11);
		 * bt.insert(6);
		 * bt.insert(8);
		 * bt.insert(19);
		 * bt.insert(4);
		 * bt.insert(10);
		 * bt.insert(5);
		 * bt.insert(17);
		 * bt.insert(43);
		 * bt.insert(49);
		 * bt.insert(31);
		 * for(int i : iArray) {
		 * 	bt.insert(i);
		 * }
		 * //System.out.println(bt.search(31).getKey());
		*/
		
		
		/**
		 * BST Traversal, Insertion, & Deletion driver program
		 */
		/*
		 * bt.inOrder();
		 * System.out.println();
		 * bt.delete(13);
		 * System.out.println();
		 * bt.inOrder();
		 * System.out.println();
		 * bt.delete(14);
		 * System.out.println();
		 * bt.inOrder();
		 * System.out.println();
		 * System.out.println();
		 * Person p = bt.search(8);
		 * if(p != null) {
		 * 	p.printPerson();
		 * }
		 * 
		 * BinarySearchTree bt2 = new BinarySearchTree();
		 * bt2.insertSortedArray(iArraySorted);
		 * bt2.inOrder();
		 */