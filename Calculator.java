package Task.Calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    Double result;
    //Queue 불러오기
    Queue<Double> saveValue = new LinkedList<>();

    // Setter
    public void setQueue(double result) {
        saveValue.add(result);
    }

    public void removeResult() {
        if (saveValue.isEmpty()) {
            System.out.println("삭제할 값이 없습니다.");
        } else {
            saveValue.poll();
            System.out.println("제일 먼저 저장된 값이 삭제되었습니다.");
        }
    }


}

