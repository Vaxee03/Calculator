package Task.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int num1 = 0, num2 = 0;
        double result = 0;

        // 인스턴트 화
        Calculator calc = new Calculator();

        // 전체 루프
        while (true) {

            // num1입력 양수 확인 루프
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.println("양수를 입력하여 주십시오.");
                    continue;
                }
                break;
            }

            // num2입력 양수 확인 루프
            while (true) {
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

            // 연산 작업
            result = calculate(num1, num2, oper);

            // 연산 완료 값 저장
            calc.setQueue(result);
            System.out.println("현재 저장된 값 : " + calc.saveValue);

            // 연산 후
            while (true) {
                System.out.println("아무 입력하여 계속 계산하기 (exit 입력시 종료 및 remove 입력 시 가장 먼저 저장한 데이터 삭제)");
                String endChoice = sc.next();
                if (endChoice.equals("exit")) {
                    return;
                } else if (endChoice.equals("remove")) {
                    calc.removeResult();
                    System.out.println("현재 저장된 값 : " + calc.saveValue);
                } else {
                    break;
                }
            }
        }
    }

    //연산 작업 함수
    public static double calculate(int num1, int num2, char oper) {
        double result = 0;
        while (true) {
            switch (oper) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과 : " + result);
                    return result;
                case '-':
                    result = num1 - num2;
                    System.out.println("결과 : " + result);
                    return result;
                case '*':
                    result = num1 * num2;
                    System.out.println("결과 : " + result);
                    return result;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("결과 : " + result);
                        return result;
                    } else {
                        System.out.println("나눗셈 연산에서 두번째 숫자에 0이 들어갈 수 없습니다.");
                        break;
                    }
                default:
                    System.out.println("올바른 연산기호를 입력하여 주십시오.");
                    break;
            }
        }
    }
}
