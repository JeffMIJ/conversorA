package jsonTransformPack;

import java.text.DecimalFormat;


public class ConversorMoneda {
	
	public String convertirMoneda(String cantidad, Object moneda, Object monedaConvertir) {
		
		// regex de solo numero y mayor a 0, despues se llama al json con su dato para multiplicarlo
		if (!cantidad.matches("^[0-9]+") || Integer.parseInt(cantidad) < 0) {
			return "invalid";
		}else {
			returnConversor rt = new returnConversor();
			//se llena "Moneda" para ir a la carpeta, segundo valor el nombre del json y el ultimo buscando el valor para convertir
			double valorMoneda = rt.devolverValor("Moneda",String.valueOf(moneda), String.valueOf(monedaConvertir));
			//formato para que se puedan obtener un decimal por cada #
			String totalResultado =  new DecimalFormat("#.####").format( Double.parseDouble(cantidad)*valorMoneda);
		
		
			return totalResultado;
		}
		
	}
}
