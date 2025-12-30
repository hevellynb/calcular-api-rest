package ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @GetMapping("/soma/{num1}/{num2}")

    public Double soma(@PathVariable(value = "num1") String num1Str, @PathVariable(value = "num2") String num2Str) throws Exception{
        return Double.parseDouble(num1Str)+Double.parseDouble(num2Str);
    }
}
