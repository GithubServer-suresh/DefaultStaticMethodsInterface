package com.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import com.biconsumer.Student;
public class BiConsumerTest {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		//behavior we defined as a statement
		//In a traditional way,define 1 seperate class and implement this interface and override method.
		//for map, it asks for BiConsumer as an argument
		BiConsumer<Integer, String> biConsumer = (k,v)->System.out.println("Key " +k +"\t" + "Value " +v);
		//BiConsumer is getting called for every entry in this map 
		map.forEach(biConsumer);
		
		
		//writing Custom type
		Map<Integer,Student> studentMap = new HashMap<>();
		studentMap.put(101, new Student("Suri",9090908765L));
		studentMap.put(103, new Student("Hari",8125062434L));
		studentMap.forEach((k,v)->System.out.println("Key "+k+"\t" +"Value " + v));
		
	}

}
