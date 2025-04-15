package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("x값 입력 : ");
//        int x = sc.nextInt();
//
//        System.out.println("y값 입력 : ");
//        int y = sc.nextInt();
//
//        System.out.println("x+y : " + (x + y));

        while(true) {
            System.out.println("입력 문자열: ");
            String str = sc.nextLine();
            if (str.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + str);
            System.out.println();
        }
        System.out.println("종료");
    }
}
