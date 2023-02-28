import java.util.*;
public class priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q=new PriorityQueue<>();
		q.add(1);
		q.add(7);
		q.add(-90);
		q.add(20);
		q.add(-10);
		q.add(-5);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		
		PriorityQueue<String> q1=new PriorityQueue<>();
		q1.add("a");
		q1.add("b");
		q1.add("c");
		q1.add("d");
		q1.add("z");
		q1.add("f");



		System.out.println(q1.offer(q1.poll()));
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		System.out.println(q1.poll());
		System.out.println(q1.poll());

	}

}
