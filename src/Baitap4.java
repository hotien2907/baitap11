import java.util.Scanner;
import java.util.Stack;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wordStack = new Stack<>();

        System.out.print("Nhập số lượng từ: ");
        int numberOfWords = scanner.nextInt();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.next();
            wordStack.push(word);
        }

        System.out.println("Các từ theo thứ tự đảo ngược:");

        while (!wordStack.empty()) {
            System.out.println(wordStack.pop());
        }
    }
}
