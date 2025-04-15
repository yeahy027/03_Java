package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 20 + 81);
        System.out.println("점수: " + score);

        String grade;
        if (score >= 81 & score < 85) {
            grade = "B";
        } else if (score < 89) {
            grade = "B+";
        } else if (score < 95) {
            grade = "A";
        } else {
            grade = "A+";
        }

        System.out.println("점수: " + grade);
    }
}
