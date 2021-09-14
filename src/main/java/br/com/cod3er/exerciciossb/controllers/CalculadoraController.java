package br.com.cod3er.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

    @GetMapping("/soma/{a}/{b}")
    public int soma(@PathVariable int a, @PathVariable int b){
        return a+b;
    }
    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a-b;
    }
    //somar 10 + 20
    // subtrair 20-10
}
