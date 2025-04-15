package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;
        boolean run = true;

        do {
            System.out.println("------------------------------");
            System.out.println("1. 종속 | 2. 감속 | 3. 중지");
            System.out.println("------------------------------");

            System.out.println("선택: ");
            int x = sc.nextInt();

            switch (x) {
                case 1:
                    speed += 1;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case 2:
                    speed -= 1;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case 3:
                    run = false;
                    break;
            }
        } while (run);
        System.out.println("프로그램 종료");
    }
}
