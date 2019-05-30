package basics;

import java.util.*;

public class m23 {
	public static void main(String args[])
	{
		/*LinkedHashSet<String> set=new LinkedHashSet<String>();
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
		TreeSet<String> set=new TreeSet<String>();
		set.add("puneet");
		set.add("shabbi");
		set.add("ranjit");
		set.add("vivek");
		set.add("abi");
		set.add("karthik");
		set.add("amar");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("desending order");
		 Iterator<String> i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }
         System.out.println("...............................................................................................");
         System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  
         System.out.println("................................................................................................");  
         System.out.println("normal set="+set);
         System.out.println("...............................................................................................");
         System.out.println("revrese set="+set.descendingSet());
         System.out.println("...............................................................................................");
         System.out.println("head set="+set.headSet("p", true));
         System.out.println("...............................................................................................");
         System.out.println("SubSet: "+set.subSet("a", false, "e", true));
         System.out.println("...............................................................................................");
         System.out.println("tail set="+set.tailSet("c", false));
         System.out.println("...............................................................................................");
         
		PriorityQueue<String>q=new PriorityQueue<String>();
		q.add("puneet");
		q.add("adi");
		q.add("shabbi");
		q.add("karthik");
		q.add("abhi");
		q.add("amar");
		q.add("ranjith");
		System.out.println("head:"+q.element());
		System.out.println("...............................................................................................");
        System.out.println("head:"+q.peek());
        System.out.println("...............................................................................................");
        System.out.println("queue element:");
        Iterator<String>itr=q.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("aftre removing the head");
        q.remove();
        System.out.println(q);
        System.out.println("removing puneet");
        q.remove("puneet");
        System.out.println(q);
        System.out.println("...............................................................................................");
       
		Deque<String>d=new ArrayDeque<String>();
		d.add("puneet");
		d.add("adi");
		d.add("shabbi");
		d.add("karthik");
		d.add("abhi");
		d.add("amar");
		d.add("ranjith");
		for(String str:d)
		{
			System.out.println(str);
		}
		System.out.println("affter offer first");
		d.pollFirst();
		for(String str1:d)
		{
			System.out.println(str1);
		}
		d.pollLast();
		System.out.println("affter pool last ");
		for(String str2:d)
		{
			System.out.println(str2);
		}
		Map map=new HashMap();
		map.put(1,"puneet");
		map.put(2,"adi");
		map.put(3,"shabbi");
		Set set=map.entrySet();
		System.out.println("old type");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("new type");
		for(Map.Entry m:map.entrySet())
		 {  
			   System.out.println(m.getKey()+" "+m.getValue()); 
		 }
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"puneet");
		map.put(202,"adi");
		map.put(303,"shabbi");
		System.out.println(map);
		map.entrySet()
		.stream()
		System.out.println(map);
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	       .stream()  
	       .sorted(Map.Entry.comparingByKey())  
	      .forEach(System.out::println);
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	       .stream()  
	       .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      .forEach(System.out::println);
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	       .stream()  
	       .sorted(Map.Entry.comparingByValue())  
	      .forEach(System.out::println);
	      Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      //Returns a Set view of the mappings contained in this map        
	      map.entrySet()  
	       .stream()  
	       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
	      .forEach(System.out::println);
		HashMap<Integer,String> map=new HashMap<Integer,String>();
	    System.out.println("entring the elements");  
	      map.put(101,"pp");
	      map.put(102,"harry");
	      map.put(103,"ron");
	      map.put(104,"vasu");
	      map.put(105, "raju");
	      for(Map.Entry m:map.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println("...........................................");
	      map.putIfAbsent(106, "emme");
	      for(Map.Entry m:map.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println("......................................");
	      HashMap<Integer,String> map1=new HashMap<Integer,String>();
	      map1.put(109,"ranjith");
	      map1.put(107, "rajani");
	      map1.put(108, "raja");
	      map1.putAll(map);
	      for(Map.Entry m:map1.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println("...........................................");
	      map1.remove(108);
	      for(Map.Entry m:map1.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println(".....................................");
	      map1.remove(103);
	      for(Map.Entry m:map1.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println("........................................");
	      map1.remove(104, "vasu");
	      for(Map.Entry m:map1.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println("............................................");
	      map1.replace(101, "puneet");
	      for(Map.Entry m:map1.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println("............................................");
	      map1.replace(105, "raju", "newValue");
	      for(Map.Entry m:map1.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      System.out.println("............................................");
	      map1.replaceAll((k,v)->"ambaaaaaa");
	      for(Map.Entry m:map1.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"dsdasdft");  
		  hm.put(101,"asdaae");  
		  hm.put(102,"Rfesfefe");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		}
		System.out.println(".............................................");
		
		System.out.println("keys:"+hm.keySet());
		System.out.println(".............................................");
		System.out.println("values:"+hm.values());
		System.out.println(".............................................");
		System.out.println("entity set:"+hm.entrySet());
		System.out.println(".............................................");
		hm.remove(101);
		System.out.println(hm);
		System.out.println(".............................................");
		hm.put(105,"hey");
		hm.put(104,"hi");
		hm.put(106,"dfsdfs");
		System.out.println(hm);
		System.out.println(".............................................");
		hm.remove(100, "dsdasdft");
		hm.remove(105);
		System.out.println(hm);
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
		map.put(1,"rajith");
		map.put(2,"raja");
		map.put(3,"rama");
		map.put(4,"lakki");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		map.remove(2);
		System.out.println("after removing");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(".....................................");
		map.put(2,"fdfedfs");
		map.put(10,"djfdjfh");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("elements in decending"+map.descendingMap());
		System.out.println(".....................................");
		System.out.println("head map="+map.headMap(1,true));
		System.out.println(".....................................");
		System.out.println("tail map="+map.tailMap(4, true));
		System.out.println(".....................................");
		System.out.println("sub map="+map.subMap(1, true, 3, false));
		System.out.println(".....................................");
		System.out.println("map head="+map.headMap(4));
		System.out.println(".....................................");
		System.out.println("tailmap="+map.tailMap(2));
		System.out.println(".....................................");
		System.out.println("sub map="+map.subMap(2, 4));
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(5,"Amit");  
		  hm.put(6,"Ravi");  
		  hm.put(7,"Vijay");  
		  hm.put(8,"Rahul");
		  hm.put(1,"rajith");
		  hm.put(2,"raja");
		  hm.put(3,"rama");
		  hm.put(4,"lakki");
			
		  for(Map.Entry m:hm.entrySet())
		  {
			  System.out.println(m.getKey()+"="+m.getValue());
		  }
		  hm.remove(8);
		 System.out.println("...............................................");
		 System.out.println(hm);
		 System.out.println("...............................................");
		 System.out.println(hm.getOrDefault(4, "Not Found"));
		 System.out.println(hm.getOrDefault(5, "Not Found"));  
		 System.out.println(hm.getOrDefault(101, "Not Found"));
		 System.out.println("...............................................");
		 hm.putIfAbsent(6, "puneet");
		 for(Map.Entry m:hm.entrySet())
		  {
			  System.out.println(m.getKey()+"="+m.getValue());
		  }
		 hm.putIfAbsent(7, "ppt");
		 System.out.println("...............................................");
		 hm.putIfAbsent(5, "koti");*/
		 
		 
	}
}
