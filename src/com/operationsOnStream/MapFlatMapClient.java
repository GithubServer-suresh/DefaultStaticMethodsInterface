package com.operationsOnStream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapFlatMapClient {

	public static void main(String[] args) {
		/*List<String> uris = new ArrayList<>();
		uris.add("C:\\Myfile1.txt");
		uris.add("D:\\Myfile2.txt");
		uris.add("C:\\Myfile3.txt");
		Stream<Path> map = uris.stream().map(uri ->Paths.get(uri));
		map.forEach(System.out::println);*/
		
		System.out.println("----------------------");
		
		List<Detail> details = new ArrayList<>();
		List<String> parts1 = new ArrayList<>();
		parts1.add("part_1");
		parts1.add("part_2");
		parts1.add("part_3");
		
		List<String> parts2 = new ArrayList<>();
		parts2.add("part_1");
		parts2.add("part_2");
		parts2.add("part_3");
		parts2.add("part_4");
		
		Detail detail1 = new Detail(1001,parts1);
		Detail detail2 = new Detail(1002,parts2);
		details.add(detail1);
		details.add(detail2);
		
		//extract all parts information from Detail object 
		
		Stream<String> flatMap = details.stream().flatMap(detail->detail.getParts().stream());
		flatMap.forEach(System.out::println);
		
	}
}
