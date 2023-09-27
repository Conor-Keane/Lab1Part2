package ie.atu.lab1part2.lab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello ! How is your day going ?";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {return "Name: " + name;}
}
