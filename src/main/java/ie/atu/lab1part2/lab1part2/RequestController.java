package ie.atu.lab1part2.lab1part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello ! How is your day going ?";
    }
}
