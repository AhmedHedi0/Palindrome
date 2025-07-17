public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "";
        String test4 = ".>,!@#$%^&*)_+";

        System.out.println("Test 1: " + solution.isPalindrome(test1));  // Should print true
        System.out.println("Test 2: " + solution.isPalindrome(test2));  // Should print false
        System.out.println("Test 3: " + solution.isPalindrome(test3));  // Should print false
        System.out.println("Test 4: " + solution.isPalindrome(test4));  // Should print false
    }
}
