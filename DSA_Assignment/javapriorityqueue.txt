import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    
    public int compareTo(Student s){
        if(cgpa==s.getCgpa() && name.compareTo(s.getName())==0){
             
        return id-s.getId();
        }
        if(cgpa==s.getCgpa()) {
        return name.compareTo(s.getName());
        }
        if(cgpa>s.getCgpa()){ 
        return -1;
        }
         else{
             return 1;  
        } 
    }    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getCgpa(){
        return cgpa;
    } 
    
    
    
    
}
class Priorities{
   
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        for (String str : events) {
            String[] event =str.split(" ");
            
            switch(event[0]){
                case "ENTER":{
                                       
                    String name= event[1];
                    int id= Integer.valueOf(event[3]);
                    double cgpa= Double.valueOf(event[2]); 
                    Student student = new Student(id,name,cgpa );
                    pq.add(student);
                    break;                  
                }
                case "SERVED":{
                    pq.poll();
                    break;
                }
            }
        }
        ArrayList<Student> temp = new ArrayList<>();
        while (!pq.isEmpty()) {
            temp.add(pq.poll());
         }
        return temp;
}
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}