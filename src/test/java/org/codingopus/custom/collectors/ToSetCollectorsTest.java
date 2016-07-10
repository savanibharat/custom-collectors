package org.codingopus.custom.collectors;

import static com.codingopus.collectors.CustomCollectors.toHashSet;
import static com.codingopus.collectors.CustomCollectors.toLinkedHashSet;
import static com.codingopus.collectors.CustomCollectors.toTreeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import com.codingopus.collection.custom.collectors.ToSetCollectors;

public class ToSetCollectorsTest {
	
	final List<String> list = Arrays.asList("John", "Jane", "Markus", "Tim");
	
	final Set<String> hashSet = new HashSet<>(list);

	final NavigableSet<String> treeSet = new TreeSet<>(list);
	
	final Set<String> linkedHashSet = new LinkedHashSet<>(list);
	
	@Test
	public void testHashSetWithInitialCapacity() {
		 
		Set<String> setWithInitialCapacity = hashSet.stream()
				.collect(toHashSet(20));
		Assert.assertEquals(setWithInitialCapacity, hashSet);
	}
	
	@Test
	public void testLinkedHashSetNotNull(){
		Set<String> setWithInitialCapacity = linkedHashSet.stream()
				.collect(toLinkedHashSet(20));
		Assert.assertEquals(linkedHashSet, setWithInitialCapacity);
	}
	
	@Test
	public void testTreeSetNotNull(){
		NavigableSet<String> navigableSet = treeSet.stream()
				.collect(toTreeSet());
		Assert.assertEquals(treeSet, navigableSet);
	}
	
	@Test
	public void testTreeSetWithComparatorNotNull(){
		NavigableSet<String> navigableSet = treeSet.stream()
				.collect(ToSetCollectors.toTreeSet(String::compareTo));
		Assert.assertEquals(treeSet, navigableSet);
	}
}
