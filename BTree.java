// Let's Start Learning Binary Tree..!
// Types of Tree
// 	1- Full Binary Tree
// 	2 - Complete Binary tree
// 	3 - Perfect Binary Tree
// 	4 - Balanced Binary Tree
// 	5 - Degenerated Tree


// 	Traversals:
// 		DFS : inorder , preorder , postorder 
// 		BFS :	level order

	





package Tree;
import java.util.*;
public class BinaryTree {
	private Node root;
	
// 	Creating A tree 
	private class Node
	{
		private Node left;
		private Node right;
		private int data;
		public Node(int data)
		{
			this.data=data;
	
		}
	}
	
	 public void create()
	 {
// 		 tree nodes insertion
		Node first=new Node(10);
		Node second =new Node(8);
		Node third = new Node(12);
		Node fourth = new Node(7);
		Node fifth=new Node(9);
		Node sixth=new Node(11);
		Node seventh=new Node(13);
		
		root=first;   // root ---> first
		first.left=second;
		first.right=third; // second <----first--->third
		
		second.left=fourth;
		second.right=fifth;
		
		third.left=sixth;
		third.right=seventh;
	}
	
// 	Inorder Traversal
	 void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
// 	Postorder traversal
	public void postorder(Node root) {
		if(root==null) {
			return;
		}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+ " ");
		
	}
// 	pre-order Traversal
	
	public void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BinaryTree b=new BinaryTree();
			b.create();
			b.inorder(b.root);
			System.out.println();
			b.preorder(b.root);
			System.out.println();
			b.postorder(b.root);
}

}
