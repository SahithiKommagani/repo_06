package Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//type not known in advance
//if type parameter appears only once in the method declaration,we should consider replacing with wildcard
public class WildCard{
	//unbounded list represents any type
	public static void Display2(List<?> li)
	{
		for(Object i:li)
		{
			System.out.println(i);
		}
	}
	//upperBounded Wildcard represents list of numbers or its subtypes(integer,double etc)
	public static void Display(List<? extends Number> li)
	{
		for(Object i:li)
		{
			System.out.println(i);
		}
	}
	//lowerBound Wildcard represents list of numbers or its supertypes(Number ,object)
	public static void Display1(List<? super Integer> li)
	{
		for(Object i:li)
		{
			System.out.println(i);
		}
		System.out.println();
	}
	//using mutliple bounds
	public static double averageScore(Map<String, ? extends Number>studentsMap){
	       double totalScore=0;
	       int count=0;
	       for(Map.Entry<String,? extends Number>entry:studentsMap.entrySet()){
	        totalScore+=entry.getValue().doubleValue();
	        count++;
	       }
	       return totalScore/count;
	    }
	public static void main(String[] args)
	{
		WildCard w=new WildCard();
		//for unbounded
		List<String> s=new ArrayList<String>();
		s.add("Hi");
		s.add("Hello");
		s.add("Welcome");
		Display2(s);
		//for upperbound
		List<Double> li=new ArrayList<Double>();
		li.add(10.9);
		li.add(20.5);
		li.add(70.3);
		Display(li);
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(70);
		Display(l);
		//lower bound
		List<Float> li1=new ArrayList<Float>();
		li1.add((float) 10.7);
		li1.add((float) 20.6);
		li1.add((float) 70.5);
		//Display1(li1);//throws error //because only integer is accepted 
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(70);
		Display(al);//prints correctly because we are passing integer
		//multibound
	    Map<String,Float> studentsMap=new HashMap<>();
        studentsMap.put("tom",56.6f);
        studentsMap.put("jerry", 65.f);
        studentsMap.put("cat", 34.8f);
        System.out.println("Average score of students : " +w.averageScore(studentsMap));
        Map<String,Integer> studentsMap1=new HashMap<>();
        studentsMap1.put("tom",56);
        studentsMap1.put("jerry", 65);
        studentsMap1.put("cat", 34);
        System.out.println("Average score of students : " +w.averageScore(studentsMap1));

}
}
