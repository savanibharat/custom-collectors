package org.codingopus.custom.guava.collectors;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.codingopus.custom.guava.collectors.ImmutableSetCollector;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;

public class ImmutableSetCollectorTest {

	List<String> names = new ArrayList<>();//.asList("name1", "name2", "name3");
	
	@Test
	public void testImmutableSetInstance(){
		
		for (int i = 0; i < 20; i++) {
			names.add(i+"");
		}
		
		ImmutableCollection<String> str = 
				names.parallelStream()
					 .collect(new ImmutableSetCollector<>());
		
		System.out.println(str instanceof ImmutableCollection);
		System.out.println(str instanceof ImmutableSet);
	}
	
	
}
