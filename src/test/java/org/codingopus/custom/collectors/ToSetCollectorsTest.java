package org.codingopus.custom.collectors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector.Characteristics;

import org.junit.Assert;
import org.junit.Test;
import org.mutabilitydetector.unittesting.MutabilityAssert;

import com.codingopus.custom.collectors.ToSetCollectors;

public class ToSetCollectorsTest {
	List<String> names = Arrays.asList("John", "Jane", "Markus", "Tim");

	@Test
	public void testHashSetNotNull() {
		Set<String> setWithInitialCapacity = names.stream()
				.collect(ToSetCollectors.toHashSet(20, Characteristics.UNORDERED));
		Assert.assertNotNull(setWithInitialCapacity);
	}
	
	@Test
	public void testReturnsHashSet() {
		Set<String> setWithInitialCapacity = names.stream()
				.collect(ToSetCollectors.toHashSet(20, Characteristics.UNORDERED));
		Assert.assertTrue(setWithInitialCapacity instanceof HashSet);
	}
	
	@Test
	public void testLinkedHashSetNotNull(){
		Set<String> setWithInitialCapacity = names.stream()
				.collect(ToSetCollectors.toLinkedHashSet(20, Characteristics.IDENTITY_FINISH));
		Assert.assertNotNull(setWithInitialCapacity);
	}
	
	@Test
	public void testReturnsLinkedHashSet(){
		Set<String> setWithInitialCapacity = names.stream()
				.collect(ToSetCollectors.toLinkedHashSet(20, Characteristics.IDENTITY_FINISH));
		Assert.assertNotNull(setWithInitialCapacity instanceof LinkedHashSet);
	}
	
	@Test
	public void testTreeSetNotNull(){
		NavigableSet<String> treeSet = names.stream()
				.collect(ToSetCollectors.toTreeSet(Characteristics.IDENTITY_FINISH));
		Assert.assertNotNull(treeSet);
	}
	
	@Test
	public void testReturnsTreeSet(){
		NavigableSet<String> treeSet = names.stream()
				.collect(ToSetCollectors.toTreeSet(Characteristics.IDENTITY_FINISH));
		Assert.assertTrue(treeSet instanceof TreeSet);
	}
	
	@Test
	public void testTreeSetWithComparatorNotNull(){
		NavigableSet<String> treeSet = names.stream()
				.collect(ToSetCollectors.toTreeSet(String::compareTo, Characteristics.IDENTITY_FINISH));
		Assert.assertNotNull(treeSet);
	}
	
	@Test
	public void testReturnsTreeSetWithComparator(){
		NavigableSet<String> treeSet = names.stream()
				.collect(ToSetCollectors.toTreeSet(Characteristics.IDENTITY_FINISH));
		Assert.assertTrue(treeSet instanceof TreeSet);
	}
	
	@Test
	public void testToSetCollectorImmutable(){
		MutabilityAssert.assertImmutable(ToSetCollectors.class);
	}

}
