package com.example.calculadora.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.calculadora.model.Calculadora;

@Service
public class CalculadoraService {
	
   public Calculadora operacao(BigDecimal result) throws Exception {
	   Calculadora calc = new Calculadora();
	   try {
		   calc.setResultado(result.toString());
		   return  calc;   
	   } catch (Exception e) {
		   calc.setErro("Erro na operação");
		 return calc;
	   }
   }

}
