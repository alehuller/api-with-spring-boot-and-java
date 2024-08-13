package br.com.erudio.validationsANDoperations;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class MathValidationsAndOperations {
	
	public static double operations(String op, String numberOne, String numberTwo) {
		if(op == "sum") {
			exception(numberOne, numberTwo);
			return convertToDouble(numberOne) + convertToDouble(numberTwo);
		}
		else if(op == "sub") {
			exception(numberOne, numberTwo);
			return convertToDouble(numberOne) - convertToDouble(numberTwo);
		}
		else if(op == "mult") {
			exception(numberOne, numberTwo);
			return convertToDouble(numberOne) * convertToDouble(numberTwo);
		}
		else if(op == "div") {
			exception(numberOne, numberTwo);
			return convertToDouble(numberOne) / convertToDouble(numberTwo);
		}
		else if(op == "avr") {
			exception(numberOne, numberTwo);
			return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
		}
		else if(op == "sqr") {
			exception(numberOne, numberTwo);
			return Math.sqrt(MathValidationsAndOperations.convertToDouble(numberOne));
		}
		else {
			throw new UnsupportedMathOperationException("Please send a valid operation.");
		}
	}
	
	public static Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		String number = strNumber.replace(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}
	
	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
	public static void exception(String numberOne, String numberTwo) {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value.");
		}
	}
}
