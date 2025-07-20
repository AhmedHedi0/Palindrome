import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testEmptyString() {
        assertFalse(solution.isPalindrome(""), "Empty string should return false");
    }

    @Test
    void testNullInput() {
        assertFalse(solution.isPalindrome(null), "null input should return false");
    }

    @Test
    void testOnlySpecialCharacters() {
        assertFalse(solution.isPalindrome("!!!??"), "String with only special characters should return false");
    }

    @Test   
    void testSingleCharacter() {
        assertTrue(solution.isPalindrome("a"), "Single character should return true");
    }

    @Test
    void testSimplePalindrome() {
        assertTrue(solution.isPalindrome("madam"), "'madam' is a palindrome");
    }

    @Test
    void testCaseInsensitivePalindrome() {
        assertTrue(solution.isPalindrome("RaceCar"), "'RaceCar' is a case-insensitive palindrome");
    }

    @Test
    void testWithSpacesAndPunctuation() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"), "Classic palindrome with punctuation");
    }

    @Test
    void testInvalidPalindrome() {
        assertFalse(solution.isPalindrome("race a car"), "'race a car' is not a palindrome");
    }

    @Test
    void testOnlyWhitespace() {
        assertFalse(solution.isPalindrome("   "), "Only whitespace should return false");
    }

    @Test
    void testNumericPalindrome() {
        assertTrue(solution.isPalindrome("12321"), "Numeric palindrome");
    }

    @Test
    void testNumericNonPalindrome() {
        assertFalse(solution.isPalindrome("1231"), "Not a numeric palindrome");
    }

    @Test
    void testMixedAlphaNumeric() {
        assertTrue(solution.isPalindrome("1a1"), "'1a1' is a valid alphanumeric palindrome");
        assertFalse(solution.isPalindrome("1a2"), "'1a2' is not a palindrome");
    }

    @Test
    void testPunctuationAroundPalindrome() {
        assertTrue(solution.isPalindrome("!!a!!"), "'!!a!!' should be considered a palindrome");
    }
    @Test
    public void testPalindromeCyrillic() {
        assertTrue(solution.isPalindrome("А роза упала на лапу Азора")); // Russian
    }

    @Test
    public void testPalindromeGreek() {
        assertTrue(solution.isPalindrome("ΑΒΓΔΔΓΒΑ")); // Greek
    }

    @Test
    public void testPalindromeJapanese() {
        assertTrue(solution.isPalindrome("あいいあ")); // Japanese
    }

    @Test
    public void testNonPalindromeChinese() {
        assertFalse(solution.isPalindrome("你好世界")); // Chinese, not a palindrome
    }

    // === 2. Very Long String ===

    @Test
    public void testVeryLongPalindrome() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            sb.append('a');
        }
        String longPalindrome = sb.toString();

        assertTrue(solution.isPalindrome(longPalindrome));
    }

    @Test
    public void testVeryLongNonPalindrome() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            sb.append('a');
        }
        sb.append('b'); // Break the symmetry

        String notPalindrome = sb.toString();
        assertFalse(solution.isPalindrome(notPalindrome));
    }

    // === 3. Emojis and Symbols ===

    @Test
    public void testEmojisOnly() {
        assertFalse(solution.isPalindrome("😊😊")); // No letters or digits
    }

    @Test
    public void testEmojisMixedWithTextPalindrome() {
        assertTrue(solution.isPalindrome("😊a😊")); // Alphanumeric = "a"
    }

    @Test
    public void testEmojiWithTextNonPalindrome() {
        assertFalse(solution.isPalindrome("😊abc😊")); // Alphanumeric = "abc"
    }
}
