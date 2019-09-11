package W1L4.prob4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	public void test() {
		Palindrome pd = new Palindrome();
		boolean Ooutput = pd.checkPal("racecar");
		boolean Eoutput = true;
		assertEquals(Ooutput, Eoutput);
	}

}
