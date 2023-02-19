package linkedlist;

import java.util.*;

public class doublel {
    static class Node{
        Node prev, next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
    	Node start = new Node(0);
        Scanner sc=new Scanner(System.in);
        int ele,ele1;
        while(true)
        {
        	System.out.println();
           System.out.println("1.Add Node at End\n2.Add Node at Start \n 3. Delete At End\n4. Add After Node \n5.Delete After Node\n6.Delete Particular Node \n7. Print Linked List \n8. exit");
           int ch=sc.nextInt();
           switch(ch)
           {
           case 1:
        	   System.out.println("Enter Element to Add at End");
        	   ele=sc.nextInt();
        	   start=addToEnd(start, ele);
        	   break;
             case 2:
            	 System.out.println("Enter Element to Add at Start");
            	 ele=sc.nextInt();
            	 start = addToStart(start, ele);
                 break;   	 	
             case 3:
            	 start = deleteFromEnd(start);
                 break;
             case 4:
            	 System.out.println("Enter the first node and the second Node that add after first Node");
            	 ele=sc.nextInt();
            	 ele1=sc.nextInt();
            	 start = addAfter(ele, ele1, start);
                 break;
             case 5:
            	 System.out.println("Enter the node that delete after Node");
            	 ele=sc.nextInt();
            	start =  deleteAfter(ele, start);
                 break;
             case 6:
            	 System.out.println("Enter the node to delete ");
            	 ele=sc.nextInt();
            	 start = deleteNode(ele, start);
                 break;
             case 7:
            	 System.out.println("Your List is..:");
                 print(start);
                 break;
             case 8:
                 System.exit(0);
             
           }
        }
    }

    public static void print(Node start) {
    	Node t=start;
    	System.out.println("-----------------------------");
    	while(t!=null) {
    		System.out.print(t.data+" ");
    		t=t.next;
    	}
    	System.out.println();
    	System.out.println("-----------------------------");
    }
    public static Node addAfter(int val1 , int val2 , Node start){
        Node temp  = start;

        while(temp.data != val1){
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = new Node(val2);
        temp.next.next = temp2;


        return start;
        }
    


    public static  Node deleteFromEnd(Node start){
        Node temp = start;
        
        
        if(start == null){
            System.out.print("nothing to delete");
        }else if(temp.next == null){
            temp = null;
        }
        else
        {
            while(temp.next.next !=null){
                temp = temp.next;
            }
            temp.next = null;
        }
        
        
        
        return start;
    }
    
    public static Node deleteFromStart(Node start){
        if(start == null){
            System.out.println("nothing to delete");
        }else{
            start = start.next;
            start.prev = null;
        }

        return start;
    }

    public static Node addToStart(Node start , int val){
        Node temp = start;
        if(temp == null){
            temp = new Node(val);
           
        }else{
            temp.prev = new Node(val);
            temp.prev.next = start;
            temp = start.prev;
        	}
        start=temp;


        return start;
        }
    
    public static Node deleteNode(int val,Node start) {
    	Node t=start;
    	if(t==null) 
    		{
    		System.out.println("No node to delete");
    		return t;
    		}
    	while(t.next.data!=val) {
    		t=t.next;
    		if(t.next==null) break;
    	}
    	if(t.next!=null) t.next=t.next.next;
    	
    	return t;
    }
    public static Node deleteAfter(int val1 , Node start){
        Node temp  = start;
        if(temp==null) {
        	System.out.println("Nothing to delete");
        	return temp;
        }

        while(temp.data != val1){
            temp = temp.next;
        }
        if(temp.next!=null)
        {
        temp.next=temp.next.next;
        }
        

        return start;
    }


    public static Node addToEnd(Node start , int val){
        Node temp = start;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        temp.next.prev = temp;
        
        return start;
    }
    
}
