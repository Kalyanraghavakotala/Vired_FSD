import java.util.*;
public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<Integer> t=new TreeSet<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			t.add(sc.nextInt());
		}
		System.out.println(t);

	}

}
