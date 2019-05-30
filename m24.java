package basics;
import java.io.FileReader;
import java.util.*;

/*class Student implements Comparable<Student> {  
    public String name;  
  public Student(String name) {  
    this.name = name;  
  }  
  public int compareTo(Student person) {  
    return name.compareTo(person.name);  
      
  }   
}
enum days{
	sunday,monday,tuesday,wednesday,thursday,friday,saturday
}
class Student implements Comparable<Student>
{
int rollno;
String name;
int age;
public Student(int i, String string, int j) {
	// TODO Auto-generated constructor stub
	this.rollno=i;
	this.name=string;
	this.age=j;
}
@Override
public int compareTo(Student st) {
	// TODO Auto-generated method stub
	if(age==st.age) {
		return 0;
	}
	else if(age<st.age)
	{
		return 1;
	}
	else
	{
		return -1;	
	}
	
}
}
class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
}  
class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  
class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}
class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  */
public class m24 {
public static void main(String args[])
{
	/*Set<days> set=EnumSet.of(days.monday,days.sunday);
	Iterator<days> itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	Set<days> set=EnumSet.allOf(days.class);
	System.out.println("week days"+set);
	Set<days> set1=EnumSet.noneOf(days.class);
	System.out.println("week days"+set1);
	EnumMap<days, String> map = new EnumMap<days, String>(days.class);
	map.put(days.monday,"1");
	map.put(days.tuesday, "2");
	map.put(days.wednesday,"3");
	map.put(days.thursday,"4");
	map.put(days.friday,"5");
	map.put(days.saturday,"6");
	map.put(days.sunday,"7");
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	List<String> list = new ArrayList<String>();  
    list.add("C");  
    list.add("Core Java");  
    list.add("Advance Java"); 
    System.out.println("initial list"+list);
    System.out.println("..........................................................");
    Collections.addAll(list, "Servlet","JSP");
    System.out.println("after adding value"+list);
    System.out.println("...........................................................");
    String[] arr= {"c#","c++"};
    Collections.addAll(list, arr);
    System.out.println("affer adding sring"+list);
	List<Integer> list=new ArrayList<Integer>();
	list.add(12);
	list.add(32);
	list.add(434);
	list.add(34673);
	list.add(438);
	list.add(965);
	list.add(6345);
	System.out.println("Value of maximum element from the collection: "+Collections.max(list));
	System.out.println("Value of maximum element from the collection: "+Collections.min(list));  
	ArrayList<String> list=new ArrayList<String>();
	list.add("puneet");
	list.add("adi");
	list.add("vasu");
	list.add("raju");
	list.add("amar");
	list.add("mani");
	list.add("naveen");
	System.out.println("before sorting");
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Collections.sort(list);
	System.out.println("after sorting........................");
	Iterator itr1=list.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	Collections.sort(list,Collections.reverseOrder());
	System.out.println("after sorting in reverse order........................");
	Iterator itr2=list.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}
	ArrayList<Student> al=new ArrayList<Student>();  
    al.add(new Student("puni"));  
    al.add(new Student("puju"));  
    al.add(new Student("shanthi"));  
    al.add(new Student("ananthu"));  
    
  Collections.sort(al);  
  for (Student s : al) {  
    System.out.println(s.name);   
  }
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(101,"kaka",23));  
	al.add(new Student(106,"ronaldo",27));  
	al.add(new Student(105,"messi",21));  
	for(Student s1:al)
	{
		System.out.println(s1.rollno+" "+s1.name+" "+s1.age);
		
	}
	Collections.sort(al);
	System.out.println("after sorting");
	for(Student s:al)
	{
		System.out.println(s.rollno+" "+s.name+" "+s.age);
		
	}
	ArrayList al=new ArrayList();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));
	System.out.println("before sorting");
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	Student st=(Student)itr.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	System.out.println("......................Sorting by Name.......................");  
	  
	Collections.sort(al,new NameComparator());  
	Iterator itr1=al.iterator();  
	while(itr1.hasNext()){  
	Student st=(Student)itr1.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	System.out.println("..........................sorting using name..................");
	Collections.sort(al,new AgeComparator());
	Iterator itr2=al.iterator();  
	while(itr2.hasNext()){  
	Student st=(Student)itr2.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	} 
	
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
	  
	System.out.println("Sorting by Name");  
	  
	Collections.sort(al,new NameComparator());  
	for(Student st: al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	  
	System.out.println("Sorting by age");  
	  
	Collections.sort(al,new AgeComparator());  
	for(Student st: al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}
	
	 Vector<String> v=new Vector<String>();//creating vector  
	  v.add("umesh");//method of Collection  
	  v.addElement("irfan");//method of Vector  
	  v.addElement("kumar");  
	  //traversing elements using Enumeration  
	  Enumeration e=v.elements();  
	  while(e.hasMoreElements()){  
	   System.out.println(e.nextElement());  
	  } */
	
	
}
}

