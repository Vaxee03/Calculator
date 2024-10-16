package Task.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1=0, num2=0,result = 0;


        // 전체 루프
        for (; ; ) {

            // num1입력 양수 확인 루프
            for (; ; ) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.println("양수를 입력하여 주십시오.");
                    continue;
                }
                break;
            }

            // num2입력 양수 확인 루프
            for (; ; ) {
                System.out.print("두 번째 숫자를 입력하세요 : ");
                num2 = sc.nextInt();
                if (num2 < 0) {
                    System.out.println("양수를 입력하여 주십시오.");
                    continue;
                }
                break;
            }

            // 연산기호 입력
            System.out.print("사칙연산 기호를 입력하세요 : ");
            char oper = sc.next().charAt(0);

            // 연산 할당
            switch (oper) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과 : " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과 : " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과 : " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("결과 : " + result);
                        break;
                    } else {
                        System.out.println("나눗셈 연산에서 두번째 숫자에 0이 들어갈 수 없습니다.");
                        continue;
                    }
                default:
                    System.out.println("올바른 연산기호를 입력하여 주십시오.");
                    continue;
            }

            System.out.println("아무 입력하여 계속 계산하기 (exit 입력시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")){
                Calculator Calc = new Calculator(result);
                return;
            }
        }
    }
}
