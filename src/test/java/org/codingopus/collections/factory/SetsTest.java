package org.codingopus.collections.factory;

import java.util.Collections;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.codingopus.collections.factory.Sets;

public class SetsTest {
	
	@Test
	public void setOf0() {
		Assert.assertEquals(Sets.of(), Collections.emptySet());
	}

	@Test
	public void setOf1() {
		Assert.assertEquals(Sets.of(1), Collections.singleton(1));
	}

	@Test(expected = NullPointerException.class)
	public void setOf1Null() {
		Assert.assertEquals(Sets.of(null), Collections.singleton(null));
	}

	@Test
	public void setOf2() {
		Set<Integer> list = Sets.of(1, 2);
		Assert.assertEquals(2, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf2Null() {
		Sets.of(1, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf2Change() {
		Sets.of(1, 2).remove(3);
	}

	@Test
	public void setOf3() {
		Set<Integer> list = Sets.of(1, 2, 3);
		Assert.assertEquals(3, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf3Null() {
		Sets.of(1, 2, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf3Change() {
		Sets.of(1, 2, 3).remove(3);
	}

	@Test
	public void setOf4() {
		Set<Integer> list = Sets.of(1, 2, 3, 4);
		Assert.assertEquals(4, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf4Null() {
		Sets.of(1, 2, 3, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf4Change() {
		Sets.of(1, 2, 3, 4).remove(3);
	}

	@Test
	public void setOf5() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5);
		Assert.assertEquals(5, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf5Null() {
		Sets.of(1, 2, 3, 4, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf5Change() {
		Sets.of(1, 2, 3, 4, 5).remove(3);
	}

	@Test
	public void setOf6() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6);
		Assert.assertEquals(6, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf6Null() {
		Sets.of(1, 2, 3, 4, 5, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf6Change() {
		Sets.of(1, 2, 3, 4, 5, 6).remove(3);
	}

	@Test
	public void setOf7() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6, 7);
		Assert.assertEquals(7, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf7Null() {
		Sets.of(1, 2, 3, 4, 5, 6, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf7Change() {
		Sets.of(1, 2, 3, 4, 5, 6, 7).remove(3);
	}

	@Test
	public void setOf8() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6, 7, 8);
		Assert.assertEquals(8, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf8Null() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf8Change() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8).remove(3);
	}

	@Test
	public void setOf9() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Assert.assertEquals(9, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf9Null() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf9Change() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9).remove(3);
	}

	@Test
	public void setOf10() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Assert.assertEquals(10, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf10Null() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf10Change() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).remove(3);
	}

	@Test
	public void setOf11() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		Assert.assertEquals(11, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf11Null() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf11Change() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).remove(3);
	}

	@Test
	public void setOf12WithoutVarArgs() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Assert.assertEquals(12, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf12NullWithoutVarArgs() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf12ChangeWithoutVarArgs() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).remove(3);
	}

	@Test
	public void setOf12WithVarArgs() {
		Set<Integer> list = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		Assert.assertEquals(14, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOf12NullWithVarArgsNullArgument() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOf12ChangeWithVarArgsChange() {
		Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).remove(3);
	}

	@Test
	public void setOfOrdered0() {
		Assert.assertEquals(Sets.ofOrdered(), Collections.emptySet());
	}

	@Test
	public void setOfOrdered1() {
		Assert.assertEquals(Sets.ofOrdered(1), Collections.singleton(1));
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered1Null() {
		Assert.assertEquals(Sets.ofOrdered(null), Collections.singleton(null));
	}

	@Test
	public void setOfOrdered2() {
		Set<Integer> list = Sets.ofOrdered(1, 2);
		Assert.assertEquals(2, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered2Null() {
		Sets.ofOrdered(1, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered2Change() {
		Sets.ofOrdered(1, 2).remove(3);
	}

	@Test
	public void setOfOrdered3() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3);
		Assert.assertEquals(3, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered3Null() {
		Sets.ofOrdered(1, 2, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered3Change() {
		Sets.ofOrdered(1, 2, 3).remove(3);
	}

	@Test
	public void setOfOrdered4() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4);
		Assert.assertEquals(4, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered4Null() {
		Sets.ofOrdered(1, 2, 3, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered4Change() {
		Sets.ofOrdered(1, 2, 3, 4).remove(3);
	}

	@Test
	public void setOfOrdered5() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5);
		Assert.assertEquals(5, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered5Null() {
		Sets.ofOrdered(1, 2, 3, 4, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered5Change() {
		Sets.ofOrdered(1, 2, 3, 4, 5).remove(3);
	}

	@Test
	public void setOfOrdered6() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6);
		Assert.assertEquals(6, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered6Null() {
		Sets.ofOrdered(1, 2, 3, 4, 5, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered6Change() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6).remove(3);
	}

	@Test
	public void setOfOrdered7() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7);
		Assert.assertEquals(7, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered7Null() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered7Change() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7).remove(3);
	}

	@Test
	public void setOfOrdered8() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8);
		Assert.assertEquals(8, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered8Null() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered8Change() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8).remove(3);
	}

	@Test
	public void setOfOrdered9() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Assert.assertEquals(9, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered9Null() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered9Change() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9).remove(3);
	}

	@Test
	public void setOfOrdered10() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Assert.assertEquals(10, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered10Null() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered10Change() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).remove(3);
	}

	@Test
	public void setOfOrdered11() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		Assert.assertEquals(11, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered11Null() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered11Change() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).remove(3);
	}

	@Test
	public void setOfOrdered12WithoutVarArgs() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Assert.assertEquals(12, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered12NullWithoutVarArgs() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered12ChangeWithoutVarArgs() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).remove(3);
	}

	@Test
	public void setOfOrdered12WithVarArgs() {
		Set<Integer> list = Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		Assert.assertEquals(14, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfOrdered12NullWithVarArgsNullArgument() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfOrdered12ChangeWithVarArgsChange() {
		Sets.ofOrdered(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).remove(3);
	}

	@Test
	public void setOfSorted0() {
		Assert.assertEquals(Sets.ofSorted(), Collections.emptySet());
	}

	@Test
	public void setOfSorted1() {
		Assert.assertEquals(Sets.ofSorted(1), Collections.singleton(1));
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted1Null() {
		Assert.assertEquals(Sets.ofSorted(null), Collections.singleton(null));
	}

	@Test
	public void setOfSorted2() {
		Set<Integer> list = Sets.ofSorted(1, 2);
		Assert.assertEquals(2, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted2Null() {
		Sets.ofSorted(1, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted2Change() {
		Sets.ofSorted(1, 2).remove(3);
	}

	@Test
	public void setOfSorted3() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3);
		Assert.assertEquals(3, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted3Null() {
		Sets.ofSorted(1, 2, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted3Change() {
		Sets.ofSorted(1, 2, 3).remove(3);
	}

	@Test
	public void setOfSorted4() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4);
		Assert.assertEquals(4, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted4Null() {
		Sets.ofSorted(1, 2, 3, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted4Change() {
		Sets.ofSorted(1, 2, 3, 4).remove(3);
	}

	@Test
	public void setOfSorted5() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5);
		Assert.assertEquals(5, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted5Null() {
		Sets.ofSorted(1, 2, 3, 4, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted5Change() {
		Sets.ofSorted(1, 2, 3, 4, 5).remove(3);
	}

	@Test
	public void setOfSorted6() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6);
		Assert.assertEquals(6, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted6Null() {
		Sets.ofSorted(1, 2, 3, 4, 5, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted6Change() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6).remove(3);
	}

	@Test
	public void setOfSorted7() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6, 7);
		Assert.assertEquals(7, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted7Null() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted7Change() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7).remove(3);
	}

	@Test
	public void setOfSorted8() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8);
		Assert.assertEquals(8, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted8Null() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted8Change() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8).remove(3);
	}

	@Test
	public void setOfSorted9() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Assert.assertEquals(9, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted9Null() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted9Change() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9).remove(3);
	}

	@Test
	public void setOfSorted10() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Assert.assertEquals(10, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted10Null() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted10Change() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).remove(3);
	}

	@Test
	public void setOfSorted11() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		Assert.assertEquals(11, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted11Null() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted11Change() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).remove(3);
	}

	@Test
	public void setOfSorted12WithoutVarArgs() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Assert.assertEquals(12, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted12NullWithoutVarArgs() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted12ChangeWithoutVarArgs() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).remove(3);
	}

	@Test
	public void setOfSorted12WithVarArgs() {
		Set<Integer> list = Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		Assert.assertEquals(14, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void setOfSorted12NullWithVarArgsNullArgument() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void setOfSorted12ChangeWithVarArgsChange() {
		Sets.ofSorted(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).remove(3);
	}

}
