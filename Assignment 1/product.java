import java.util.*;
class aboutproduct
{
  private int id;
  private String name;
  private int count;
  private int cost;
  public aboutproduct(int id,String name,int count,int cost) {
	  this.id=id;
	  this.name=name;
	  this.count=count;
	  this.cost=cost;
  }
  public int getid() {
	  return id;
  }
  public String getName()
   {
     return name;
   }
  public int getcount()
  {
    return count;
  }
  public int getcost()
  {
    return cost;
  }
  public void setcost(int cost) {
	  this.cost=cost;
  }
  public void setcount(int count) {
	  this.count=count;
  }
 }
class prod
{
   final int no_pro=10;
   aboutproduct p[]=new aboutproduct[no_pro];
   int i=0;
   public void addproduct(aboutproduct a)
    {
       p[i]=a;
       i++;
    }     
   public void viewallproduct()
   {
       System.out.println("Product No \t Name ");
       for(int j=0;j<i;j++)
       {
          System.out.println(j+1+"\t\t"+p[j].getName());

       }
   }
   public void viewproductcount()
   {
	   System.out.println("Product id \t Name \t\t count");
       for(int j=0;j<i;j++)
       {
          System.out.println(p[j].getid()+"\t\t"+p[j].getName()+"\t\t"+p[j].getcount());
       }
   }
   public void viewallproductdetails()
   {
       System.out.println("Product id \t Name\t\t cost ");
       for(int j=0;j<i;j++)
       {
          System.out.println(p[j].getid()+"\t\t"+p[j].getName()+"\t\t"+p[j].getcost());
       }
   }
   public void editproduct(int id,int cost) {
	   
	   	for(int j=0;j<i;j++) {
	   		if(p[j].getid()==id) {
	   			p[j].setcost(cost);
	   			return ;
	   		}
	   	}
	   	System.out.println("No product Found");
   }
   public void updateproduct(int id,int count) {
	   
	   	for(int j=0;j<i;j++) {
	   		if(p[j].getid()==id) {
	   			p[j].setcount(p[j].getcount()+count);
	   			return ;
	   		}
	   	}
	   	System.out.println("No product Found");
  }
}
public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prod p=new prod();
		aboutproduct a;
        int acno,ch;
        String name;
        float amt;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
           System.out.println("0.Add Products with Details \n1. Product List\n2.Product Count\n3.Product Details\n4.Edit Product\n5.Update Inventory\n6.Exit");
           ch=sc.nextInt();
           switch(ch)
           {
           case 0:
        	   System.out.println("Enter id, name, count, cost");
        	   int id=sc.nextInt();
        	   String name1=sc.nextLine();
        	   sc.next();
        	   int count=sc.nextInt();
        	   int cost=sc.nextInt();
        	   a=new aboutproduct(id,name1,count,cost);
        	   p.addproduct(a);
             case 1:
            	 p.viewallproduct();
                 break;   	 	
             case 2:
            	 p.viewproductcount();
                 break;
             case 3:
            	 p.viewallproductdetails();
                 break;
             case 4:
            	 System.out.println("Enter id, cost that you want to change");
            	 int id1=sc.nextInt();
            	 int cost1=sc.nextInt();
            	 p.editproduct(id1,cost1);
            	 break; 
             case 5:
            	 System.out.println("Enter the id and count");
            	 int id11=sc.nextInt();
            	 int count1=sc.nextInt();
            	 p.updateproduct(id11,count1);
            	 break;
             case 6:
                 System.exit(0);
           }
         }
	}

}
