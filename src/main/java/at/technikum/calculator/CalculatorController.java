package at.technikum.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    Calculator calculator = new Calculator();

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return calculator.sum(a,b);
    }
}
