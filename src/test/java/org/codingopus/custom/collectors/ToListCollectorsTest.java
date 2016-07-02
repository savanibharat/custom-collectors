package org.codingopus.custom.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collector.Characteristics;

import org.junit.Assert;
import org.junit.Test;
import org.mutabilitydetector.unittesting.MutabilityAssert;

import com.codingopus.custom.collectors.ToListCollectors;

public class ToListCollectorsTest {

	List<String> names = Arrays.asList("John", "Jane", "Markus", "Tim");

	@Test
	public void testArrayListNotNull() {
		List<String> listWithInitialCapacity = names.stream()
				.collect(ToListCollectors.toArrayList(10, Characteristics.IDENTITY_FINISH));
		Assert.assertNotNull(listWithInitialCapacity);
	}

	@Test
	public void testReturnsArrayList() {
		List<String> listWithInitialCapacity = names.stream()
				.collect(ToListCollectors.toArrayList(10, Characteristics.IDENTITY_FINISH));
		Assert.assertTrue(listWithInitialCapacity instanceof ArrayList);
	}

	@Test
	public void testLinkedListNotNull() {
		List<String> listWithInitialCapacity = names.stream()
				.collect(ToListCollectors.toVector(10, Characteristics.IDENTITY_FINISH));
		Assert.assertNotNull(listWithInitialCapacity);
	}

	@Test
	public void testReturnsVector() {
		List<String> listWithInitialCapacity = names.stream()
				.collect(ToListCollectors.toVector(10, Characteristics.IDENTITY_FINISH));
		Assert.assertTrue(listWithInitialCapacity instanceof Vector);
	}
	
	@Test
	public void testToListCollectorImmutable(){
		MutabilityAssert.assertImmutable(ToListCollectors.class);
	}

}
