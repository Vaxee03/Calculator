package Task.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int a = sc.nextInt();
            if(a<0){
                System.out.println("양수를 입력하여 주십시오.");
                continue;
            }
            break;
        }
        for(;;) {
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int b = sc.nextInt();
            if(b<0){
                System.out.println("양수를 입력하여 주십시오.");
                continue;
            }
            break;
        }
        System.out.println("사칙연산 기호를 입력하세요 : ");
        char oper = sc.next().charAt(0);
    }
}
