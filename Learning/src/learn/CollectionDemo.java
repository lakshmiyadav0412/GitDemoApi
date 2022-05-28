package learn;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo {
	
	public static void main(String[] args) {
		Stack<String> s= new Stack<>();
		s.push("L");
		s.push("A");
		s.push("W");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	//pop is for removing
		s.pop();
		System.out.println(s);
	
		
		//vector
	Vector<String> vc= new Vector<>();
	vc.add("12");
	vc.add("31");
	vc.add("121 ");
	System.out.println(vc);
	vc.remove(2);
	vc.indexOf("31");
	System.out.println(vc+""+vc.indexOf("yadav")+""+vc.size()+""+vc.isEmpty());
	
//PriorityQueue
	
	PriorityQueue<Integer> p= new PriorityQueue<>();
	p.add(23);
	p.add(34);
	p.add(72);
	p.add(122);
	System.out.println("queue operation"+p);
	p.hashCode();
	
    System.out.println(p.poll());//remove the first element and retrieves the first element
    System.out.println("queue operation"+p);
    System.out.println(p.peek());// Retrieve the first element and doesnot removes it
    System.out.println("queue operation"+p);
    System.out.println(p.hashCode());
	
    
    
    String str[]= {"java","python","R","python","python"};
    
    Set<String>el1= new HashSet<>();
    el1.add("h");
    el1.add("e");
    el1.add("l");
    el1.add("h");
    
    
    Set<String>el= new HashSet<>();
    
    
    int count=0;
    
   for(int i=0;i<str.length;i++)
   {  count = count+1;
	   if(el.add(str[i])!=true)
		   
	   { 
		   System.out.println("dup element==  "+str[i]+count);
	   
	   }
	   
	   
   }
    
    
    
    
    
    
    		
    		
    		
    
	
		
		
		
	}

}
