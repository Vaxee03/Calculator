package Task.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, result = 0;

        for(;;) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            a = sc.nextInt();
            if(a<0){
                System.out.println("양수를 입력하여 주십시오.");
                continue;
            }
            break;
        }
        for(;;) {
            System.out.print("두 번째 숫자를 입력하세요 : ");
            b = sc.nextInt();
            if(b<0){
                System.out.println("양수를 입력하여 주십시오.");
                continue;
            }
            break;
        }
        System.out.println("사칙연산 기호를 입력하세요 : ");
        char oper = sc.next().charAt(0);

        switch (oper) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b!=0) {
                    result = a / b;
                    break;
                }else {
                    System.out.println("나눗셈 연산에서 두번째 숫자에 0이 들어갈 수 없습니다.");
                    break;
                }
            default:
                result = 0;
                System.out.println("올바른 연산기호를 입력하여 주십시오.");
                break;

        }
        System.out.println("결과 : "+ result);
    }
}
