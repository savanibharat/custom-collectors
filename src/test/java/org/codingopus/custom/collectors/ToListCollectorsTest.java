package org.codingopus.custom.collectors;

import static com.codingopus.collectors.CustomCollectors.toArrayList;
import static com.codingopus.collectors.CustomCollectors.toVector;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ToListCollectorsTest {

	final List<String> names = Arrays.asList("John", "Jane", "Markus", "Tim");
	final String listAsString = names.toString();
 
	@Test
	public void testArrayListWithInitialCapacity() {
		List<String> listWithInitialCapacity = names.stream().collect(toArrayList(10));
		Assert.assertEquals(listWithInitialCapacity, names);
	}
	
	@Test
	public void testVectorWithInitialCapacity() {
		List<String> listWithInitialCapacity = names.stream().collect(toVector(10));
		Assert.assertEquals(listWithInitialCapacity, names);
	}
}
