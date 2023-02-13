import java.util.*;

	

public class a2p2 {
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
		Node head1=new Node(0);
		Node t1=head1;
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			t1.next=new Node(k);
			t1=t1.next;
		}
		head=head.next;
		head1=head1.next;
		Node res=new Node(0);
		ArrayList<Integer> ar=new ArrayList<>();
		t=head;
		t1=head1;
		while(t!=null) {
			ar.add(t.data);
			t=t.next;
		}
		while(t1!=null) {
			ar.add(t1.data);
			t1=t1.next;
		}
		Collections.sort(ar);
//		System.out.println(ar);
		t=res;
		
		for(int i=0;i<ar.size();i++) {
			t.next=new Node(ar.get(i));
			t=t.next;
		}
		res=res.next;
		t=res;
		while(t!=null) {
			System.out.print(t.data+" ");
			t=t.next;
		}
		
	}
}



