package ie.atu.lab1part2.lab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public CalculatorClass calculate(@RequestParam(name = "num1")int num1, @RequestParam(name = "num2") int num2, @RequestParam(name = "operation") String operation) {
        return new CalculatorClass(num1, num2, operation);
    }

    @GetMapping("/calculate2")
    public CalculatorClass calculate2(@PathVariable(name = "num1")int num1, @PathVariable(name = "num2") int num2, @PathVariable(name = "operation") String operation){
        return new CalculatorClass(num1, num2, operation);
    }
}
