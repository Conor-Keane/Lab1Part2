package ie.atu.lab1part2.lab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    public int operation(int num1, int num2, String operation) {
        switch(operation) {

        }
        return num1;
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        return "Num1 = " + num1 + "Num2 = " + num2;
    }

}
