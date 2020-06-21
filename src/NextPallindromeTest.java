/*created by Sushant Adhikari*/
import org.junit.Assert;
import org.junit.Test;

public class NextPallindromeTest {

	
	@Test
	public void testNextPalindrome() {
		Assert.assertEquals("3", NextPalindrome.findNext("2"));
		Assert.assertEquals("11", NextPalindrome.findNext("10"));
		Assert.assertEquals("818", NextPalindrome.findNext("809"));
		Assert.assertEquals("2222", NextPalindrome.findNext("2136"));
		Assert.assertEquals("1000001", NextPalindrome.findNext("1000000"));
	}
	
	@Test
	public void testLeadingZeroes() {
		Assert.assertEquals("1", NextPalindrome.findNext("0"));
		Assert.assertEquals("1", NextPalindrome.findNext("00000"));
		Assert.assertEquals("2", NextPalindrome.findNext("000001"));
		Assert.assertEquals("11", NextPalindrome.findNext("00010"));
		Assert.assertEquals("818", NextPalindrome.findNext("00809"));
		Assert.assertEquals("2222", NextPalindrome.findNext("00002136"));
	}
	
	@Test
	public void testNegativeNumbers() {
		Assert.assertEquals("2", NextPalindrome.findNext("-1"));
		Assert.assertEquals("2", NextPalindrome.findNext("-000001"));
		Assert.assertEquals("222", NextPalindrome.findNext("-212"));
	}
	
	@Test
	public void testFloatingPointNumbers() {
		Assert.assertEquals("3", NextPalindrome.findNext("2.2"));
		Assert.assertEquals("131", NextPalindrome.findNext("123.456"));
		Assert.assertEquals("10001", NextPalindrome.findNext("9999.9999"));
	}
	
	@Test
	public void testEmptySpaces() {
		Assert.assertEquals("131", NextPalindrome.findNext("12 1"));
		Assert.assertEquals("2442", NextPalindrome.findNext("23  68"));
		Assert.assertEquals("1331", NextPalindrome.findNext("12 0 5"));
	}
	
	
	@Test
	public void testString() {
		try {
			NextPalindrome.findNext("abc");
		} catch (NumberFormatException nfe) {
		}
		}

}
