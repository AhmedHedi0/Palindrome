public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        int i = 0;
        int j = s.length() - 1;

        boolean HasLetterorDigit = false;  

        while (i <= j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
            } else if (!Character.isLetterOrDigit(right)) {
                j--;
            } else {
                HasLetterorDigit = true; 

                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }

                i++;
                j--;
            }
        }

        return HasLetterorDigit; 
    }
}
