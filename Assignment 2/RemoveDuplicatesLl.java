import java.util.*;

public class a2p3 {
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node head=new Node(0);
		Node t=head;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			t.next=new Node(k);
			t=t.next;
		}
		head=head.next;
		ArrayList<Integer> ar=new ArrayList<>();
		Node res=new Node(0);
		t=head;
		while(t!=null) {
			if(!ar.contains(t.data)) {
				ar.add(t.data);
			}
			t=t.next;
		}
		System.out.println(ar);
		t=res;
		for(int i=0;i<ar.size();i++) {
			t.next=new Node(ar.get(i));
			t=t.next;
		}
		res=res.next;
		t=res;
		
		for(int i=0;i<ar.size();i++) {
			System.out.print(t.data + " ");
			t=t.next;
		}
	}

}
