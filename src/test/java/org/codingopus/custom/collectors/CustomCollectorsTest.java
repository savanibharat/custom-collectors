package org.codingopus.custom.collectors;

import static com.codingopus.collectors.CustomCollectors.toArrayList;
import static com.codingopus.collectors.CustomCollectors.toHashSet;
import static com.codingopus.collectors.CustomCollectors.toLinkedHashSet;
import static com.codingopus.collectors.CustomCollectors.toTreeSet;
import static com.codingopus.collectors.CustomCollectors.toVector;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class CustomCollectorsTest {

	final List<String> names = Arrays.asList("John", "Jane", "Markus", "Tim");
	final String namesAsString = names.toString();
	final Set<String> hashSet = new HashSet<>(names);
	final NavigableSet<String> treeSet = new TreeSet<>(names);
	final Set<String> linkedHashSet = new LinkedHashSet<>(names);

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

	@Test
	public void testHashSetWithInitialCapacity() {

		Set<String> setWithInitialCapacity = hashSet.stream().collect(toHashSet(20));
		Assert.assertEquals(setWithInitialCapacity, hashSet);
	}

	@Test
	public void testLinkedHashSetNotNull() {
		Set<String> setWithInitialCapacity = linkedHashSet.stream().collect(toLinkedHashSet(20));
		Assert.assertEquals(setWithInitialCapacity, linkedHashSet);
	}

	@Test
	public void testTreeSetNotNull() {
		NavigableSet<String> navigableSet = treeSet.stream().collect(toTreeSet());
		Assert.assertEquals(navigableSet, treeSet);
	}

	@Test
	public void testTreeSetWithComparatorNotNull() {
		NavigableSet<String> navigableSet = treeSet.stream().collect(toTreeSet(String::compareTo));
		Assert.assertEquals(navigableSet, treeSet);
	}

}