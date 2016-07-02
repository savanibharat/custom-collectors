package org.codingopus.custom.guava.collectors;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.codingopus.custom.guava.collectors.ImmutableListCollector;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

public class ImmutableListCollectorTest {

	List<String> names = new ArrayList<>();//.asList("name1", "name2", "name3");
	
	@Test
	public void testImmutableListInstance(){
		
		for (int i = 0; i < 20; i++) {
			names.add(i+"");
		}
		
		ImmutableCollection<String> str = 
				names.parallelStream()
					 .collect(new ImmutableListCollector<>());
		
		System.out.println(str instanceof ImmutableCollection);
		System.out.println(str instanceof ImmutableList);
	}
	
	
}
