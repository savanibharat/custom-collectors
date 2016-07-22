package org.codingopus.collections.factory;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.codingopus.collections.factory.Lists;

public class ListsTest {

	@Test
	public void listOf0() {
		Assert.assertEquals(Lists.of(), Collections.emptyList());
	}

	@Test
	public void listOf1() {
		Assert.assertEquals(Lists.of(1), Collections.singletonList(1));
	}

	@Test(expected = NullPointerException.class)
	public void listOf1Null() {
		Assert.assertEquals(Lists.of(null), Collections.singletonList(null));
	}

	@Test
	public void listOf2() {
		List<Integer> list = Lists.of(1, 2);
		Assert.assertEquals(2, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf2Null() {
		Lists.of(1, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf2Change() {
		Lists.of(1, 2).set(0, 5);
	}

	@Test
	public void listOf3() {
		List<Integer> list = Lists.of(1, 2, 3);
		Assert.assertEquals(3, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf3Null() {
		Lists.of(1, 2, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf3Change() {
		Lists.of(1, 2, 3).set(0, 5);
	}

	@Test
	public void listOf4() {
		List<Integer> list = Lists.of(1, 2, 3, 4);
		Assert.assertEquals(4, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf4Null() {
		Lists.of(1, 2, 3, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf4Change() {
		Lists.of(1, 2, 3, 4).set(0, 5);
	}

	@Test
	public void listOf5() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5);
		Assert.assertEquals(5, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf5Null() {
		Lists.of(1, 2, 3, 4, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf5Change() {
		Lists.of(1, 2, 3, 4, 5).set(0, 5);
	}

	@Test
	public void listOf6() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6);
		Assert.assertEquals(6, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf6Null() {
		Lists.of(1, 2, 3, 4, 5, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf6Change() {
		Lists.of(1, 2, 3, 4, 5, 6).set(0, 5);
	}

	@Test
	public void listOf7() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7);
		Assert.assertEquals(7, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf7Null() {
		Lists.of(1, 2, 3, 4, 5, 6, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf7Change() {
		Lists.of(1, 2, 3, 4, 5, 6, 7).set(0, 5);
	}

	@Test
	public void listOf8() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8);
		Assert.assertEquals(8, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf8Null() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf8Change() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8).set(0, 5);
	}

	@Test
	public void listOf9() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Assert.assertEquals(9, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf9Null() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf9Change() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9).set(0, 5);
	}

	@Test
	public void listOf10() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Assert.assertEquals(10, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf10Null() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf10Change() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).set(0, 5);
	}

	@Test
	public void listOf11() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		Assert.assertEquals(11, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf11Null() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf11Change() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).set(0, 5);
	}

	@Test
	public void listOf12WithoutVarArgs() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Assert.assertEquals(12, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf12NullWithoutVarArgs() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf12ChangeWithoutVarArgs() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).set(0, 5);
	}

	@Test
	public void listOf12WithVarArgs() {
		List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		Assert.assertEquals(14, list.size());
	}

	@Test(expected = NullPointerException.class)
	public void listOf12NullWithVarArgsNullArgument() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void listOf12ChangeWithVarArgsChange() {
		Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).set(0, 5);
	}

}
