package ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CalcularApiRestApplication {

    @GetMapping("/rota")
    public String Rota() {
        return "Projeto Calcular no Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CalcularApiRestApplication.class, args);
    }

}
