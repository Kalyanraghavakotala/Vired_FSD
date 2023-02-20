package Tree;
import java.util.*;
public class BinaryTree {
	private Node root;
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
	
	public void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	
	public void postorder(Node root) {
		if(root==null) {
			return;
		}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+ " ");
		
	}
	
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
