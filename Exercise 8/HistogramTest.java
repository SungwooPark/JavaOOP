package net.sung.huffman;

import static org.junit.Assert.*;

import org.junit.Test;

public class HistogramTest {

	@Test
	public void testToString() {
		Histogram h = new Histogram();
		h.count("Hello World");
		assertEquals(h.toString()," : 1 H: 1 W: 1 d: 1 e: 1 l: 3 o: 2 r: 1 ");
	}

	@Test
	public void testCountCharacter() {
		Histogram h = new Histogram();
		h.count('h');
		assertEquals((int)h.getHashMap().get('h'),1);
	}

	@Test
	public void testCountString() {
		Histogram h = new Histogram();
		h.count("hello");
		assertEquals((int)h.getHashMap().get('h'),1);
		assertEquals((int)h.getHashMap().get('e'),1);
		assertEquals((int)h.getHashMap().get('l'),2);
		assertEquals((int)h.getHashMap().get('o'),1);
	}

	@Test
	public void testFreq() {
		Histogram h = new Histogram();
		h.count("Programming");
		assertEquals(h.freq('m'),2);
		assertEquals(h.freq('i'),1);
	}

}
