package ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathControllerConversao {

    @GetMapping("/somaConversao/{num1}/{num2}")

    public Double soma(
            @PathVariable(value = "num1") String num1Str,
            @PathVariable(value = "num2") String num2Str
    ) throws Exception{
        return NumeroConverter.convertToDouble(num1Str) + NumeroConverter.convertToDouble(num2Str);
    }

    @GetMapping("/subtracaoConversao/{num1}/{num2}")

    public Double subtracao(
            @PathVariable(value = "num1") String num1Str,
            @PathVariable(value = "num2") String num2Str
    ) throws Exception {
        return NumeroConverter.convertToDouble(num1Str) - NumeroConverter.convertToDouble(num2Str);
    }

    @GetMapping("/multiplicacaoConversao/{num1}/{num2}")

    public Double multiplicacao(
            @PathVariable(value = "num1") String num1Str,
            @PathVariable(value = "num2") String num2Str
    ) throws Exception {
        return NumeroConverter.convertToDouble(num1Str) * NumeroConverter.convertToDouble(num2Str);
    }

    @GetMapping("/divisaoConversao/{num1}/{num2}")

    public Double divisao(
            @PathVariable(value = "num1") String num1Str,
            @PathVariable(value = "num2") String num2Str
    ) throws Exception {
        return NumeroConverter.convertToDouble(num1Str) / NumeroConverter.convertToDouble(num2Str);
    }

    @GetMapping("/media/{num1}/{num2}")

    public Double media(
            @PathVariable(value = "num1") String num1Str,
            @PathVariable(value = "num2") String num2Str
    ) throws Exception {
        return (NumeroConverter.convertToDouble(num1Str) + NumeroConverter.convertToDouble(num2Str))/2;
    }

    @GetMapping("/raizQuadrada/{num1}")

    public Double raizQuadrada(
            @PathVariable(value = "num1") String num1Str
    ) throws Exception {
        return Math.sqrt(NumeroConverter.convertToDouble(num1Str));
    }
}
