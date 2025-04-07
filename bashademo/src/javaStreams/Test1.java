package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	// @Test
	/*
	 * public void regular() { ArrayList<String> names=new ArrayList<String>();
	 * names.add("Basha"); names.add("Darling"); names.add("Bashu");
	 * names.add("Shammu"); names.add("Bashi");
	 * 
	 * int count=0;
	 * 
	 * for(int i=0;i<names.size();i++) { String actual=names.get(i);
	 * 
	 * if(actual.startsWith("B")) { count++; } }
	 * 
	 * System.out.println(count); }
	 */

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Basha");
		names.add("Darling");
		names.add("Bashu");
		names.add("Shammu");
		names.add("Bashi");

		Long c = names.stream().filter(s -> s.startsWith("B")).count();

		// System.out.println(c);

		Long d = Stream.of("Basha", "Darling", "Bashu", "Shammu", "Bashi").filter(s -> {
			s.startsWith("S");
			return true;
		}).count();
		System.out.println(d);
		// print names with length of more than four letters
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		// print names with length of more than four letters and limiting the only one
		// word
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));

	}

	@Test
	public void stremMap() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Don");
		names.add("Raju");
		names.add("Rama");
		names.add("Lakky");
		names.add("Durga");

		// print names with which have last letter 'u' in to upper case
		Stream.of("Basha", "Darling", "Bashu", "Shammu", "Bashi").filter(s -> s.endsWith("u")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names which have 1st letter 'D' to upper case and sorting order
		List<String> names1 = Arrays.asList("Basha", "Dzarling", "Bashu", "Db", "Bashi");
		names1.stream().filter(s -> s.startsWith("D")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
		// Concatenating the two ArrayLists into a One Stream
		Stream<String> newStream=Stream.concat(names.stream(),names1.stream());
		newStream.forEach(s->System.out.println(s));
		
		// Concatenating the two different ArrayLists into a One Stream and printing  sorted order
				Stream<String> newStream1=Stream.concat(names.stream(),names1.stream());
				//newStream1.sorted().forEach(s->System.out.println(s));
				
				boolean flag=newStream1.anyMatch(s->s.equalsIgnoreCase("Don"));
				System.out.println(flag);
				Assert.assertTrue(flag);
		}
	
	
	
	@Test

	public void StreamCollections()
	{
		List<String> ls=Stream.of("Basha", "Darling", "Bashu", "Shammu", "Bashi").filter(s -> s.endsWith("u")).map(s -> s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		List<Integer> values = Arrays.asList(2,6,2,3,5,6,4,7,9);
		//printing unique numbers
		values.stream().distinct().forEach(s->System.out.println(s));
		//sorting the array list and print the 3rd index
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(3));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
