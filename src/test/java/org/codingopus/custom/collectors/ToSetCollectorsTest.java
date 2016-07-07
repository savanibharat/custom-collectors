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

import com.codingopus.collection.custom.collectors.ToSetCollectors;

public class ToSetCollectorsTest {
	
	final List<String> list = Arrays.asList("John", "Jane", "Markus", "Tim");
	
	final Set<String> hashSet = new HashSet<>(list);

	final NavigableSet<String> treeSet = new TreeSet<>(list);
	
	final Set<String> linkedHashSet = new LinkedHashSet<>(list);
	
	
	@Test
	public void testHashSetNotNull() {
		
		Set<String> setWithInitialCapacity = hashSet.stream()
				.collect(ToSetCollectors.toHashSet(20, Characteristics.IDENTITY_FINISH));
		Assert.assertEquals(hashSet, setWithInitialCapacity);
	}
	
	@Test
	public void testLinkedHashSetNotNull(){
		Set<String> setWithInitialCapacity = linkedHashSet.stream()
				.collect(ToSetCollectors.toLinkedHashSet(20, Characteristics.IDENTITY_FINISH));
		Assert.assertEquals(linkedHashSet, setWithInitialCapacity);
	}
	
	@Test
	public void testTreeSetNotNull(){
		NavigableSet<String> navigableSet = treeSet.stream()
				.collect(ToSetCollectors.toTreeSet(Characteristics.IDENTITY_FINISH));
		Assert.assertEquals(treeSet, navigableSet);
	}
	
	@Test
	public void testTreeSetWithComparatorNotNull(){
		NavigableSet<String> navigableSet = treeSet.stream()
				.collect(ToSetCollectors.toTreeSet(String::compareTo, Characteristics.IDENTITY_FINISH));
		Assert.assertEquals(treeSet, navigableSet);
	}
	
	@Test
	public void testToSetCollectorImmutable(){
		MutabilityAssert.assertImmutable(ToSetCollectors.class);
	}

}
