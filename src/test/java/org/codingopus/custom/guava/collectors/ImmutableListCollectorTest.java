package org.codingopus.custom.guava.collectors;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.codingopus.collectors.CustomCollectors;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;

public class ImmutableListCollectorTest {

	List<String> names = new ArrayList<>();//.asList("name1", "name2", "name3");
	
	@Test
	public void testImmutableListInstance(){
		
		for (int i = 0; i < 20; i++) {
			names.add(i+"");
		}
		
		ImmutableList<String> str = 
				names.parallelStream()
					 .collect(CustomCollectors.toImmutableList());
		
		Assert.assertTrue(str instanceof ImmutableCollection);
		Assert.assertTrue(str instanceof ImmutableList);
	}
	
	
}
