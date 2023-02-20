import java.util.*;	
class Node
{
	int data;
	Node next;
	public Node(int data) {
    	this.data=data;
    	next=null;
    }
}
public class CircularLinkedList {
	public static Node tocircular(ArrayList<Integer> ar) {
		Node res=new Node(ar.get(0));
		Node t=res;
		for(int i=1;i<ar.size();i++) {
			t.next=new Node(ar.get(i));
			t=t.next;
		}
		t.next=res;
		return res;
	}
	public static void print(Node node) {
		Node fast=node;
    	Node slow=node;
    	System.out.print(fast.data+" ");
		fast=fast.next;
    	while(fast!=slow) {
    		System.out.print(fast.data+" ");
    		fast=fast.next;
    	}
    	System.out.println();
	}
	public static Node addend(Node node,int val) {
		Node fast=node;
		Node slow=node;
		while(fast.next!=slow) {
			fast=fast.next;
		}
		fast.next=new Node(val);
		fast.next.next=slow;
		node=fast;
		return node;
	}
	public static Node addstart(Node node,int val) {
		Node newnode=new Node(val);
		Node fast=node;
		Node slow=node;
		newnode.next=slow;
		while(fast.next!=slow) {
			fast=fast.next;
		}
		fast.next=newnode;
		
		
		
		return node;
	}
	public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	ArrayList<Integer> ar=new ArrayList<>();
    	for(int i=0;i<n;i++) {
    		ar.add(sc.nextInt());
    	}
    	Node node=tocircular(ar);
    	print(node);
    	addstart(node,5);
    	print(node);
    }   
}
