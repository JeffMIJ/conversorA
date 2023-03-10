package jsonTransformPack;

import java.text.DecimalFormat;

public class ConversorDistancia {

	public String detalle(String cantidad, Object distancia, Object distanciaConvertir) {
		returnConversor rc = new returnConversor();
		if (!cantidad.matches("^[0-9]+") || Integer.parseInt(cantidad) < 0) {
			return "invalid";
		}else {
			double valorDistancia =rc.devolverValor("Distancia", String.valueOf(distancia), String.valueOf(distanciaConvertir));
			
			String resultado = new DecimalFormat("#.########").format(valorDistancia*Double.valueOf(cantidad));
			
			
			return resultado;
		}
	}
}

//String.valueOf(transformadoMilla/valorDistanciaConvertir)