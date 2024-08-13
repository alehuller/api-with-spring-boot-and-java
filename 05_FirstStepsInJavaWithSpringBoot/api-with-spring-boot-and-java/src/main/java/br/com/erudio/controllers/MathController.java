package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.validationsANDoperations.MathValidationsAndOperations;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		return MathValidationsAndOperations.operations("sum", numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		return MathValidationsAndOperations.operations("sub", numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		return MathValidationsAndOperations.operations("mult", numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		return MathValidationsAndOperations.operations("div", numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/avr/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double avr(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		return MathValidationsAndOperations.operations("avr", numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sqr/{number}", method = RequestMethod.GET)
	public Double sqr(@PathVariable(value = "number") String number) throws Exception {
		return MathValidationsAndOperations.operations("sqr", number, "0");
	}
}