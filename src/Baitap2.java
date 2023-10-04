import java.util.Stack;

public class Baitap2 {

    public static boolean kiemTraDauNgoac(String chuoi) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (kyTu == '(' || kyTu == '{' || kyTu == '[') {
                stack.push(kyTu);
            } else if (kyTu == ')' || kyTu == '}' || kyTu == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char dauNgoacMo = stack.pop();

                if ((dauNgoacMo == '(' && kyTu != ')') ||
                        (dauNgoacMo == '{' && kyTu != '}') ||
                        (dauNgoacMo == '[' && kyTu != ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String chuoi1 = "((()))";
        String chuoi2 = "({[()]})";
        String chuoi3 = "(()))";

        System.out.println("Chuoi 1: " + (kiemTraDauNgoac(chuoi1) ? "Dung" : "Sai"));
        System.out.println("Chuoi 2: " + (kiemTraDauNgoac(chuoi2) ? "Dung" : "Sai"));
        System.out.println("Chuoi 3: " + (kiemTraDauNgoac(chuoi3) ? "Dung" : "Sai"));
    }
}
