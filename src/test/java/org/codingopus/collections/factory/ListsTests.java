package org.codingopus.collections.factory;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.codingopus.collections.factory.Lists;

public class ListsTests {

	@Test
	public void listOf0() {
		Assert.assertEquals(Lists.of(), Collections.emptyList());
	}

	@Test
	public void listOf1() {
		Assert.assertEquals(Lists.of(1), Collections.singletonList(1));
	}
	
	@Test(expected=NullPointerException.class)
	public void listOf1Null() {
		Assert.assertEquals(Lists.of(null), Collections.singletonList(null));
	}

	@Test
	public void listOf2() {
		List<Integer> list = Lists.of(1, 2);
		Assert.assertEquals(2, list.size());
	}
	
	@Test(expected=NullPointerException.class)
	public void listOf2Null(){
		Lists.of(1, null);
	}

}
