package com.example.imcbackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://127.0.0.1:5500") //verificar se está no local correto
@RestController //Essa classe responde a requisições web
public class ImcController {
    @GetMapping("/api/imc") //Esse metodo roda quando alguém acessa /api/imc.
    public double calcularImc(@RequestParam double peso, @RequestParam double altura){

        double IMC = peso /  (altura * altura);
        return IMC;

    }
}
