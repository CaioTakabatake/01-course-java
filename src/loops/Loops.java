package loops;

public class Loops {
    public static void main(String[] args) {
        for (int multiplicator = 1; multiplicator <= 10; multiplicator++) {
            for (int counter = 0; counter <= 10; counter++) {
                System.out.print(multiplicator * counter + " ");
            }
            System.out.println();
        }
    }
}
