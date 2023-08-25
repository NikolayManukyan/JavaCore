package classwork.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x is less than y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x is equal y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x is more than y");
        }
    }

}
