public class Main {
    public static void main(String[] args) {

        String string = "TACOCAT";
        Palindrome test = new Palindrome();

        boolean isPalindrome = test.isPalindrome(string);

        if(isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}