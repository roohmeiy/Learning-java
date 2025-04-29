package stringPackage;

public class Palindrome {
    void isPalindrome(String word){
        if(checkPalindrome(word))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
    boolean checkPalindrome(String word) {
        for (int start = 0, end = word.length() - 1; start <= end; start++, end--) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}
