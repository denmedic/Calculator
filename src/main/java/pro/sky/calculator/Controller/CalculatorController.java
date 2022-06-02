package pro.sky.calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.CalculatorService;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService= calculatorService;
    }
    @GetMapping
    public String showHello() {
        return calculatorService.showHello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int first, @RequestParam("num2") int second) {
        return first + "+" + second + "=" + calculatorService.plus(first,second);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int first, @RequestParam("num2") int second) {
        return first + "-" + second + "=" + calculatorService.minus(first,second);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int first, @RequestParam("num2") int second) {
        return first + "*" + second + "=" + calculatorService.multiply(first,second);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") float first, @RequestParam("num2") float second) {
        if (second == 0) {
            return "На 0 не делится";
        } else {
            return first + "/" + second + "=" + calculatorService.divide(first,second);
        }
    }
}
