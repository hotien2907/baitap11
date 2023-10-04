import java.util.LinkedList;
import java.util.Queue;

public class Baitap1 {
    public static void main(String[] args) {


            LinkedList<Integer> inputList = new LinkedList<>();
            inputList.add(1);
            inputList.add(6);
            inputList.add(3);
            inputList.add(10);
            inputList.add(5);

            Queue<Integer> queue = new LinkedList<>(inputList);

            System.out.println("Cac phan tu cua danh sach:");

            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }

}
