package ec1_rojas_adrian.ec1_rojas_adrian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ComputadoraController {
    @GetMapping({"/computadora"})
    public String computadora() {
        return "descuentocomputadora";
    }
}
