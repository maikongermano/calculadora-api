package com.example.calculadora.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculadora.model.Calculadora;
import com.example.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("/operacao")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	@GetMapping("/somar")
	public Calculadora somar(@RequestParam BigDecimal primeiro, @RequestParam BigDecimal segundo ) throws Exception {
	   return calculadoraService.operacao(primeiro.add(segundo));
	}
	
	@GetMapping("/subtrair")
	public Calculadora subtrair(@RequestParam BigDecimal primeiro, @RequestParam BigDecimal segundo ) throws Exception {
	   return calculadoraService.operacao(primeiro.subtract(segundo));
	}
	
	@GetMapping("/dividir")
	public Calculadora dividir(@RequestParam BigDecimal primeiro, @RequestParam BigDecimal segundo ) throws Exception {
	   return calculadoraService.operacao(primeiro.divide(segundo));
	}
	
	@GetMapping("/multiplicar")
	public Calculadora multiplicar(@RequestParam BigDecimal primeiro, @RequestParam BigDecimal segundo ) throws Exception {
	   return calculadoraService.operacao(primeiro.multiply(segundo));
	}
	
}
