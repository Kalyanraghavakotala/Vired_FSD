import java.util.*;
public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=1;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				k++;
			}
			else {
				System.out.print(k+" ");
				k++;
				i--;
			
			}
		}


	}

}
