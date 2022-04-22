package loops;

public class SummationUsingWhile {
    public static void main(String[] args) {
        int counter = 0;
        int result = 0;

        while (counter <= 10) {
            result += counter;
            counter++;
        }

        System.out.println(result);
    }
}
