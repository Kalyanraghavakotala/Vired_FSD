import java.util.ArrayList;
import java.util.Scanner;
class problem3
{
    static Scanner inp=new Scanner(System.in);
    static void addproducts(ArrayList<String> pl,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter product name");
        String pn=inp.next();
        pl.add(pn);
        System.out.println("Enter product quantity");
        int pq=inp.nextInt();
        System.out.println("Enter Specifications");
        inp.nextLine();
        String sp=inp.nextLine();
        System.out.println("Enter Cost");
        String c=inp.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        pd.add(a);
        pc.add(pq);
    }
    static void viewproductdetails(ArrayList<String> pl,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        for(int i=0;i<pl.size();i++)
        {
            System.out.print(pl.get(i)+"  ");
            String d="";
            for(int j=0;j<pd.get(i).size();j++)
            d+=pd.get(i).get(j)+" ";
            System.out.print(d);
            System.out.println();
        }
    }
    static void productlist(ArrayList<String> pl,ArrayList<Integer> pc)
    {
        System.out.println("Enter productname to get count");
        String name=inp.next();
        int k=pl.indexOf(name);
        System.out.println(pl.get(k)+" "+pc.get(k));
    }
    static void editproduct(ArrayList<String> pl,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter productname to edit details");
        String p=inp.next();
        int k=pl.indexOf(p);
        System.out.println("Enter product quantity");
        int pq=inp.nextInt();
        System.out.println("Enter Specifications");
        inp.nextLine();
        String sp=inp.nextLine();
        System.out.println("Enter Cost");
        String c=inp.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(sp);
        a.add(c);
        a.add(Integer.toString(pq));
        pd.set(k, a);
        pc.set(k,pq);
    }
    static void productcount(ArrayList<String> pl,ArrayList<Integer> pc)
    {
        System.out.println("Enter productname to get count");
        String pn=inp.next();
        int i=pl.indexOf(pn);
        System.out.println(pl.get(i)+"    "+pc.get(i));
    }
    static void updateinventory(ArrayList<String> pl,ArrayList<ArrayList<String>> pd,ArrayList<Integer> pc)
    {
        System.out.println("Enter 1 to add and 2 to delete product quantity");
        int choice=inp.nextInt();
        if(choice==1)
        {
            System.out.println("Enter product name");
            String pn=inp.next();
            System.out.println("Enter no of items to add");
            int n=inp.nextInt();
            int i=pl.indexOf(pn);
            pc.set(i,pc.get(i)+n);
            int m=pc.get(i);
            pd.get(i).set(2,Integer.toString(m));
        }
        else
        {
            System.out.println("Enter product name");
            String pn=inp.next();
            System.out.println("Enter no of items to add");
            int n=inp.nextInt();
            int i=pl.indexOf(pn);
            pc.set(i,pc.get(i)-n);
            int m=pc.get(i);
            pd.get(i).set(2,Integer.toString(m));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> pl=new ArrayList<>();
        ArrayList<ArrayList<String>> pd=new ArrayList<>();
        ArrayList<Integer> pc=new ArrayList<>();
        System.out.println("Enter Number of items to be added");
        int n=inp.nextInt();
        for(int i=0;i<n;i++)
        addproducts(pl,pd,pc);
        viewproductdetails(pl, pd, pc);
}
}