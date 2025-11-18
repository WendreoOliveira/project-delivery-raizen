package com.wendreo.br.project_delivery_raizen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/reservasdelivery")
    public String boasVindas() {
        return "Testando essa rota";
    }



}
