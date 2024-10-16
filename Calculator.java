package Task.Calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    Integer result;

    //Queue 불러오기
    Queue<Integer> saveValue = new LinkedList<>();

    public Calculator(int result){
    this.result = result;

    // Queue에 결과 값을 저장
    saveValue.add(result);
        System.out.println(saveValue.poll());
    }
}
