package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            System.out.printf("*** %d단 ***", i);
            System.out.println();

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
