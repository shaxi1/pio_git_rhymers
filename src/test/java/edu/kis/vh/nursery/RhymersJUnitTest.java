package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

// dotycz. podpunkt 14. Testy po zmianach przeszly pomyslnie

public class RhymersJUnitTest {
	final int COUNTIN_PARAMETER = 888;
	final int TEST_VALUE = 4;
	final int EMPTY_STACK_VALUE = -1;
	final int STACK_CAPACITY = 12;

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		rhymer.countIn(TEST_VALUE);

		int result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(COUNTIN_PARAMETER);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(COUNTIN_PARAMETER);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(TEST_VALUE);

		result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(TEST_VALUE);

		result = rhymer.countOut();
		Assert.assertEquals(TEST_VALUE, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testPush_Top() {
		IntLinkedList list = new IntLinkedList();

		list.push(TEST_VALUE);
		int result = list.top();

		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testPop() {
		IntLinkedList list = new IntLinkedList();

		list.push(TEST_VALUE);
		int result = list.pop();

		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testIsEmpty_List() {
		IntLinkedList list = new IntLinkedList();

		Assert.assertTrue(list.isEmpty());
	}

	@Test
	public void testIsFull_List() {
		IntLinkedList list = new IntLinkedList();

		Assert.assertFalse(list.isFull());
	}

	@Test
	public void testCountOut_FIFORhymer() {
		FIFORhymer rhymer = new FIFORhymer();

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		rhymer.countIn(TEST_VALUE);

		result = rhymer.countOut();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testCountIn_HanoiRhymer() {
		HanoiRhymer rhymer = new HanoiRhymer();

		rhymer.countIn(TEST_VALUE);

		int result = rhymer.peekaboo();
		Assert.assertEquals(TEST_VALUE, result);
	}



}
