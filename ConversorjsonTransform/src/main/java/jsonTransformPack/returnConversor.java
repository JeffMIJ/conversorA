package jsonTransformPack;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class returnConversor {
	JSONParser jp = new JSONParser();
	double valorMoneda;
	public double devolverValor(String nombreCarpeta,String nombreFile, String monedaConvertir){
		try {
			//se obtiene los parametros del para buscar la carpeta, nombre del docuemnto y el parametro
			Object obj = jp.parse(new FileReader("../jsonTransform/jsonFiles"+nombreCarpeta+"/"+nombreFile+".json"));
			JSONObject jsonObject = (JSONObject) obj;
			valorMoneda =  (double)jsonObject.get(monedaConvertir);
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return valorMoneda;
	}
}
