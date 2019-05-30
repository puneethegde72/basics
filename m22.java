package basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

import java.util.List;


/*class Student
{
	int rollno;
	int age;
	String name;
	Student(int rollno,int age,String name)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
		
	}
}*/

public class m22 {
public static void main(String args[])
{
	/*ArrayList<String> list=new ArrayList<String>();
	list.add("a");
	//System.out.println(list);
	list.add("b");
	//System.out.println(list);
	list.add("c");
	//System.out.println(list);
	list.add("r");
	//System.out.println(list);
	list.add("g");
	//System.out.println(list);
	list.add("f");
	//System.out.println(list);
	list.add("d");
	//System.out.println(list);
	list.add("g");
	//System.out.println(list);
	list.add("hey");
	//System.out.println(list);
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());	
	}
	LinkedList<String>list=new LinkedList<String>();
	list.add("puneet");
	list.add("hegde");
	list.add("vivek");
	list.add("anant");
	Iterator<String>itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Vector<String>v=new Vector<String>();
	v.add("ca");
	v.add("fd");
	v.add("sd");
	v.add("dsf");
	System.out.println(v);
	Iterator<String>itr=v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Stack<String>s=new Stack<String>();
	s.push("hi");
	s.push("hello");
	s.push("hey");
	s.push("bye");
	s.push("bye bye");
	System.out.println(s);
	Iterator<String>itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	s.pop();
	System.out.println(s);
	s.pop();
	System.out.println(s);
	s.pop();
	System.out.println(s);
	s.pop();
	System.out.println(s);
	ArrayList<String>v=new ArrayList<String>();
	v.add("ca");
	v.add("fd");
	v.add("sd");
	v.add("dsf");
	System.out.println(v);
	Iterator<String>itr=v.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	ArrayList<String>v=new ArrayList<String>();
	v.add("ca");
	v.add("fd");
	v.add("sd");
	v.add("dsf");
	System.out.println(v);
	for(String obj:v)
	{
		System.out.println(obj);
	}
	ArrayList<String>v=new ArrayList<String>();
	v.add("ca");
	v.add("fd");
	v.add("sd");
	v.add("dsf");
	System.out.println(v);
	ListIterator<String>list=v.listIterator(v.size());
	while(list.hasPrevious())
	{
		String str=list.previous();
		System.out.println(str);
	}
	System.out.println("for loop");
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i));
	}
	System.out.println("for each ");
	v.forEach(a->{
		System.out.println(a);
	});
	System.out.println("for each remember");
	Iterator<String> itr=v.iterator();  
	itr.forEachRemaining(a->
	{System.out.println(a);
	});
	Student s1=new Student(01,21,"puneet");
	Student s2=new Student(02,22,"vivek");
	Student s3=new Student(03,22,"Shabbi");
	ArrayList<Student>list=new ArrayList<Student>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.name+" "+st.rollno+" "+st.age);
	}
	ArrayList<String>list=new ArrayList<String>();
	list.add("Ravi");    
    list.add("Vijay");    
    list.add("Ajay");
    System.out.println(list);
    System.out.println("using add(e,l)");
    list.add(1,"puneet");
    System.out.println(list);
    System.out.println("adding a another list");
    ArrayList<String> list2=new ArrayList<String>();  
    list2.add("Sonoo");  
    list2.add("Hanumat");  
    list.addAll(list2);
    System.out.println(list);
    System.out.println("adding another list with specific position");
    ArrayList<String> list3=new ArrayList<String>();  
    list3.add("John");  
    list3.add("Rahul");
    list.addAll(1,list3);
    System.out.println(list);
	ArrayList<String> al=new ArrayList<String>();  
    al.add("Ravi");    
    al.add("Vijay");    
    al.add("Ajay");   
    al.add("Anuj");  
    al.add("Gaurav"); 
    System.out.println(al);
    al.remove(1);
    System.out.println("after removing index 1"+al);
    al.remove("gaurav");
    System.out.println("after removing gaurav "+al);
    ArrayList<String> al2=new ArrayList<String>();    
    al2.add("Ravi");    
    al2.add("Hanumat"); 
    al.addAll(al2);
    System.out.println("updated list "+al);
    al.removeAll(al2);
    System.out.println("after removing al2 list "+al);
    al.removeIf(str->str.contains("ajay"));
    System.out.println("using removeIf "+al);
    al.clear();
    System.out.println("using clear() "+al);
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("before adding to list");
    System.out.println("Is ArrayList Empty: "+al.isEmpty());   
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ajay");  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Ravi");  
	  al2.add("Hanumat");  
	  al.retainAll(al2);  
	  System.out.println("elements after retaining al2");  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }
	System.out.println("aftercompleting all the actions");
    System.out.println("Is ArrayList Empty: "+al.isEmpty());
	ArrayList<String> al=new ArrayList<String>();
	al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ajay");
	  System.out.println("before"+al.get(1));
	  System.out.println(al);
	  al.set(1,"puneet");
	  System.out.println("before"+al.get(1));
	  System.out.println(al);
	  LinkedList<String>list=new LinkedList<String>();
	  list.add("adarash");
	  list.add("raju");
	  list.add("vasanth");
	  Iterator itr=list.descendingIterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  System.out.println("...............................");
	  Iterator itr1=list.iterator();
	  while(itr1.hasNext())
	  {
		  System.out.println(itr1.next());
	  }
	LinkedList<String>list=new LinkedList<String>();
	  list.add("adarash");
	  list.add("raju");
	  list.add("vasanth");
	  System.out.println(list);
	  System.out.println("...............................");
	  list.add(2,"puni");
	  System.out.println(list);
	  System.out.println("...............................");
	  LinkedList<String> list2=new LinkedList<String>();  
      list2.add("Sonoo");  
      list2.add("Hanumat");
      list.addAll(list2);
      System.out.println(list);
      System.out.println("...............................");
      LinkedList<String> list3=new LinkedList<String>();  
      list3.add("John");  
      list3.add("Rahul");
      list.addAll(1,list3);
      System.out.println(list);
      System.out.println("...............................");
      list.addFirst("anant");
      System.out.println(list);
      System.out.println("...............................");
      list.addLast("shantha");
      System.out.println(list);
      System.out.println("...............................");
      list.remove("puni");
      System.out.println(list);
      System.out.println("...............................");
      list.remove(2);
      System.out.println(list);
      System.out.println("...............................");
      list.removeAll(list2);
      System.out.println(list);
      System.out.println("...............................");
      list.removeFirst();
      System.out.println(list);
      System.out.println("...............................");
      list.removeLast();
      System.out.println(list);
      System.out.println("...............................");
      list.removeFirstOccurrence("adarash");
      System.out.println(list);
      System.out.println("...............................");
      list.removeLastOccurrence("raju");
      System.out.println(list);
      System.out.println("...............................");
      list.clear();
      System.out.println(list);
      System.out.println("...............................");
	List<String> al=new ArrayList<String>();  
	al.add("puneet");  
	al.add("adarsh");  
	al.add("vasanth");  
	al.add(1,"shabbi");  
	for(String s:al){  
	 System.out.println(s);
	}
	System.out.println("An element at 2nd position: "+al.get(2));
	List<String> al=new ArrayList<String>();  
	al.add("puneet");  
	al.add("adarsh");  
	al.add("vasanth");  
	al.add("shabbi");
	ListIterator<String>itr=al.listIterator();
	while(itr.hasNext())
	{
		System.out.println("index: "+itr.nextIndex()+"           valve: "+itr.next());
		
	}
	System.out.println("..................................");
	while(itr.hasPrevious())
	{
		System.out.println("index: "+itr.previousIndex()+"         value: "+itr.previous());
	}
	HashSet<String>set=new HashSet<String>();
	set.add("adi");
	set.add("puni");
	set.add("raju");
	set.add("vasu");
	Iterator<String>itr=set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("entering element with duplicates");
	set.add("shabbi");
	set.add("puni");
	set.add("madumaga");
	 set.add("Ravi");  
     set.add("Vijay");  
     set.add("Arun");  
     set.add("Sumit"); 
	Iterator<String>itr1=set.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	System.out.println("removing ravi");
	set.remove("Ravi");
	Iterator<String>itr2=set.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}
	HashSet<String> set1=new HashSet<String>();  
    set1.add("Ajay");  
    set1.add("Gaurav");
    set.addAll(set1);
    System.out.println("added set1 with set"+set);
	set.removeAll(set1);
	System.out.println("set1 has been removed from set "+set);
	set.removeIf(str->str.contains("Vijay"));
System.out.println(set);
set.clear();
System.out.println(set);*/
LinkedHashSet<String> set=new LinkedHashSet<String>();
set.add("puneet");
set.add("shabbi");
set.add("ranjit");
set.add("vivek");
System.out.println(set);
Iterator<String>itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

System.out.println("adding duplicates to current set");
set.add("adi");
set.add("shabbi");
System.out.println(set);


}
}
