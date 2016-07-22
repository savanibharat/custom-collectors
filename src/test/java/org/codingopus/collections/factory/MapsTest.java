package org.codingopus.collections.factory;

import java.util.Collections;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.codingopus.collections.factory.Maps;

public class MapsTest {

	@Test
	public void mapsOf0() {
		Assert.assertEquals(Maps.of(), Collections.emptyMap());
	}

	@Test
	public void mapsOf1() {
		Assert.assertEquals(Maps.of(1, 1).size(), 1);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf1Null() {
		Maps.of(null, 1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf1Change() {
		Maps.of(1, 1).put(2, 2);
	}

	@Test
	public void mapsOf2() {
		Assert.assertEquals(Maps.of(1, 1, 2, 2).size(), 2);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf2Null() {
		Maps.of(1, 1, 2, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf2Change() {
		Maps.of(1, 1, 2, 2).put(3, 3);
	}

	@Test
	public void mapsOf3() {
		Assert.assertEquals(Maps.of(1, 1, 2, 2, 3, 3).size(), 3);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf3Null() {
		Maps.of(1, 1, 2, 2, 3, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf3Change() {
		Maps.of(1, 1, 2, 2, 3, 3).put(4, 4);
	}

	@Test
	public void mapsOf4() {
		Assert.assertEquals(Maps.of(1, 1, 2, 2, 3, 3, 4, 4).size(), 4);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf4Null() {
		Maps.of(1, 1, 2, 2, 3, 3, 4, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf4Change() {
		Maps.of(1, 1, 2, 2, 3, 3, 4, 4).put(400, 400);
	}

	@Test
	public void mapsOf5() {
		Assert.assertEquals(Maps.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).size(), 5);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf5Null() {
		Maps.of(1, 1, 2, 2, 3, 3, 4, 4, null, 5);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf5Change() {
		Maps.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).put(400, 400);
	}
	
	@Test
	public void mapsOf6() {
		Assert.assertEquals(Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6).size(), 6);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf6Null() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				null, 6);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf6Change() {
		Maps.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6).put(400, 400);
	}
	
	@Test
	public void mapsOf7() {
		Assert.assertEquals(Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7).size(), 7);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf7Null() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, null, 7);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf7Change() {
		Maps.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7).put(400, 400);
	}
	
	@Test
	public void mapsOf8() {
		Assert.assertEquals(Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8).size(), 8);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf8Null() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf8Change() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8).put(400, 400);
	}
	
	@Test
	public void mapsOf9() {
		Assert.assertEquals(Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9).size(), 9);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf9Null() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, null, 9);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf9Change() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9).put(400, 400);
	}
	
	@Test
	public void mapsOf10() {
		Assert.assertEquals(Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10).size(), 10);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf10Null() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, null, 10);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf10Change() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10).put(400, 400);
	}
	
	@Test
	public void mapsOf11() {
		Assert.assertEquals(Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11).size(), 11);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf11Null() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				null, 11);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf11Change() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11).put(400, 400);
	}
	
	@Test
	public void mapsOf12() {
		Assert.assertEquals(Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, 12, 12).size(), 12);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOf12Null() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, null, 12);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOf12Change() {
		Maps.of(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, 12, 12).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered0() {
		Assert.assertEquals(Maps.ofOrdered(), Collections.emptyMap());
	}

	@Test
	public void mapsOfOrdered1() {
		Assert.assertEquals(Maps.ofOrdered(1, 2).size(), 1);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered1Null() {
		Maps.ofOrdered(null, 1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered1Change() {
		Maps.ofOrdered(1, 1).put(2, 2);
	}

	@Test
	public void mapsOfOrdered2() {
		Assert.assertEquals(Maps.ofOrdered(1, 1, 2, 2).size(), 2);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered2Null() {
		Maps.ofOrdered(1, 1, 2, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered2Change() {
		Maps.ofOrdered(1, 1, 2, 2).put(3, 3);
	}

	@Test
	public void mapsOfOrdered3() {
		Assert.assertEquals(Maps.ofOrdered(1, 1, 2, 2, 3, 3).size(), 3);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered3Null() {
		Maps.ofOrdered(1, 1, 2, 2, 3, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered3Change() {
		Maps.ofOrdered(1, 1, 2, 2, 3, 3).put(4, 4);
	}

	@Test
	public void mapsOfOrdered4() {
		Assert.assertEquals(Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, 4).size(), 4);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered4Null() {
		Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered4Change() {
		Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, 4).put(400, 400);
	}

	@Test
	public void mapsOfOrdered5() {
		Assert.assertEquals(Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).size(), 5);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered5Null() {
		Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, 4, null, 5);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered5Change() {
		Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered6() {
		Assert.assertEquals(Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6).size(), 6);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered6Null() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				null, 6);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered6Change() {
		Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered7() {
		Assert.assertEquals(Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7).size(), 7);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered7Null() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, null, 7);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered7Change() {
		Maps.ofOrdered(1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered8() {
		Assert.assertEquals(Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8).size(), 8);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered8Null() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered8Change() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered9() {
		Assert.assertEquals(Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9).size(), 9);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered9Null() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, null, 9);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered9Change() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered10() {
		Assert.assertEquals(Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10).size(), 10);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered10Null() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, null, 10);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered10Change() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered11() {
		Assert.assertEquals(Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11).size(), 11);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered11Null() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				null, 11);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered11Change() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11).put(400, 400);
	}
	
	@Test
	public void mapsOfOrdered12() {
		Assert.assertEquals(Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, 12, 12).size(), 12);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfOrdered12Null() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, null, 12);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfOrdered12Change() {
		Maps.ofOrdered(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, 12, 12).put(400, 400);
	}

	@Test
	public void mapsOfSorted0() {
		Assert.assertEquals(Maps.ofSorted(), Collections.emptyMap());
	}

	@Test
	public void mapsOfSorted1() {
		Assert.assertEquals(Maps.ofSorted(1, 2).size(), 1);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted1Null() {
		Maps.ofSorted(null, 1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted1Change() {
		Maps.ofSorted(1, 1).put(2, 2);
	}

	@Test
	public void mapsOfSorted2() {
		Assert.assertEquals(Maps.ofSorted(1, 1, 2, 2).size(), 2);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted2Null() {
		Maps.ofSorted(1, 1, 2, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted2Change() {
		Maps.ofSorted(1, 1, 2, 2).put(3, 3);
	}

	@Test
	public void mapsOfSorted3() {
		Assert.assertEquals(Maps.ofSorted(1, 1, 2, 2, 3, 3).size(), 3);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted3Null() {
		Maps.ofSorted(1, 1, 2, 2, 3, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted3Change() {
		Maps.ofSorted(1, 1, 2, 2, 3, 3).put(4, 4);
	}

	@Test
	public void mapsOfSorted4() {
		Assert.assertEquals(Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, 4).size(), 4);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted4Null() {
		Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted4Change() {
		Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, 4).put(400, 400);
	}

	@Test
	public void mapsOfSorted5() {
		Assert.assertEquals(Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).size(), 5);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted5Null() {
		Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, 4, null, 5);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted5Change() {
		Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).put(400, 400);
	}
	
	@Test
	public void mapsOfSorted6() {
		Assert.assertEquals(Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6).size(), 6);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted6Null() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				null, 6);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted6Change() {
		Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6).put(400, 400);
	}
	
	@Test
	public void mapsOfSorted7() {
		Assert.assertEquals(Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7).size(), 7);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted7Null() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, null, 7);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted7Change() {
		Maps.ofSorted(1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7).put(400, 400);
	}
	
	@Test
	public void mapsOfSorted8() {
		Assert.assertEquals(Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8).size(), 8);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted8Null() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, null);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted8Change() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8).put(400, 400);
	}
	
	@Test
	public void mapsOfSorted9() {
		Assert.assertEquals(Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9).size(), 9);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted9Null() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, null, 9);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted9Change() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9).put(400, 400);
	}
	
	@Test
	public void mapsOfSorted10() {
		Assert.assertEquals(Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10).size(), 10);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted10Null() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, null, 10);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted10Change() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10).put(400, 400);
	}
	
	@Test
	public void mapsOfSorted11() {
		Assert.assertEquals(Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11).size(), 11);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted11Null() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				null, 11);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted11Change() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11).put(400, 400);
	}
	
	@Test
	public void mapsOfSorted12() {
		Assert.assertEquals(Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, 12, 12).size(), 12);
	}

	@Test(expected = NullPointerException.class)
	public void mapsOfSorted12Null() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, null, 12);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void mapsOfSorted12Change() {
		Maps.ofSorted(
				1, 1, 2, 2, 3, 3, 4, 4, 5, 5,
				6, 6, 7, 7, 8, 8, 9, 9, 10, 10,
				11, 11, 12, 12).put(400, 400);
	}

	@Test
	public void mapsOfEntries(){
		
		Map<Character, Integer> map = Maps.ofEntries(
												Maps.entry('A', 65),
												Maps.entry('B', 66),
												Maps.entry('C', 67));
		Assert.assertNotNull(map);
	}
	
}
