package W1L4.prob1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import W1L4.prob4.Palindrome;

class MergeStrTest {

	@Test
	public void test() {
		MergeStr pd = new MergeStr();
		String Ooutput = pd.merge("aceg", "bdfh");
		String Eoutput = "abcdefgh";
		assertEquals(Ooutput, Eoutput);
	}
	
	@Test
	public void test2() {
		MergeStr pd = new MergeStr();
		String Ooutput = pd.merge("ace", "bde");
		String Eoutput = "abcda";
		assertEquals(Ooutput, Eoutput);
	}

}
