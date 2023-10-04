import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Baitap5 {
    public static boolean isPalindrome(String input) {

        String  inputText = input.trim().toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for (int i = 0; i < inputText.length(); i++) {
            char c = inputText.charAt(i);
            stack.push(c);
            queue.offer(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop().equals(queue.poll())) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";
        if (isPalindrome(input)) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải là Palindrome");
        }
    }
}
