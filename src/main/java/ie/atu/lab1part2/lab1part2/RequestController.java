package ie.atu.lab1part2.lab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello") //annotate
    public String hello() {
        return "Hello ! How is your day going ?"; //method
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {return "Hello " + name + " How is your day going ?";}

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: " + name + ", Age: " + age;
    }
}
