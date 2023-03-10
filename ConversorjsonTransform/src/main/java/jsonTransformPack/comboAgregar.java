package jsonTransformPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comboAgregar {

public List<String> agregarCombo(Object obj, String[] arrayDetalle) {
		//se obtiene el arreglo del primer combobox para usar el remove de la lista y
		//poder llenar el segundo combobox removiendo la opcion que usaron
		List<String> list = new ArrayList<String>(Arrays.asList(arrayDetalle));
		
		for (String temp: arrayDetalle) {
			if (temp ==String.valueOf(obj)) {
				list.remove(String.valueOf(obj));
			}
		}
		
		return list;
	}
}
