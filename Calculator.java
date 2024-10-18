package Project.Calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    //Queue 불러오기
    private Queue<Double> saveValue = new LinkedList<>();

    // Getter 함수
    public Queue<Double> getSaveValue() {
        return saveValue;
    }

    // Setter 함수 (결과 저장 역할)
    public void setSaveValue(double result) {
        saveValue.add(result);
    }

    // 저장된 값 삭제 함수
    public void removeResult() {
        if (saveValue.isEmpty()) {
            System.out.println("삭제할 값이 없습니다.");
        } else {
            saveValue.poll();
            System.out.println("제일 먼저 저장된 값이 삭제되었습니다.");
        }
    }


}

