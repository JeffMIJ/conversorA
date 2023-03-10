package jsonTransformPack;

import java.text.DecimalFormat;

public class ConversorTemperatura {
	
	public String converTemperatura(String cantidad, Object grado, Object gradoConvertir) {
		//regex de solo numeros negativos y positivos, despues se filtar con el primer dato para poder redirigir al siguiente metodo
		if (!cantidad.matches("-?[0-9]\\d*|0")) {
			return "Invalid";
		}else if (grado == "Fahrenheit") {
			return fahrenheit(cantidad, gradoConvertir);
		}else if (grado == "Celsius") {
			return Celsius(cantidad, gradoConvertir);
		}else {
			return Kelvin(cantidad, gradoConvertir);
		}
		
	}
	
	//"Fahrenheit","Celsius","Kelvin"
	public String fahrenheit(String cantidad, Object gradoConvertir) {
		//formaula usada para hacer la conversion
		if(gradoConvertir=="Celsius") {
			String resultado =new DecimalFormat("#.####").format( (Double.parseDouble(cantidad)-32)*5/9);
			return resultado;
		}else {
			String resultado =new DecimalFormat("#.####").format( (Double.parseDouble(cantidad)-32)*5/9+273.15);
			return resultado;
		}
		
	}
	public String Celsius(String cantidad, Object gradoConvertir) {
		//formaula usada para hacer la conversion
		if(gradoConvertir == "Fahrenheit") {
			String resultado =new DecimalFormat("#.####").format( (Double.parseDouble(cantidad)*9/5)+32);
			return resultado;
		}else {
			String resultado =new DecimalFormat("#.####").format( (Double.parseDouble(cantidad)+273.15));
			return resultado;
		}
	}
	
	public String Kelvin(String cantidad, Object gradoConvertir) {
		//formaula usada para hacer la conversion
		if(gradoConvertir == "Fahrenheit") {
			String resultado =new DecimalFormat("#.####").format( (Double.parseDouble(cantidad)-273.15)*9/5+32);
			return resultado;
		}else {
			String resultado =new DecimalFormat("#.####").format( (Double.parseDouble(cantidad)-273.15));
			return resultado;
		}
	}
}
