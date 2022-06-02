package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public  String showHello(){
        return "<b>Добро пожаловать в калькулятор!</b>";
    }
    public int plus(int first, int second) {
        return first + second;
    }
    public int minus(int first, int second) {
        return first - second;
    }
    public int multiply(int first, int second) {
        return first * second;
    }
    public float divide(float first, float second) {
        return first / second;
    }
}
