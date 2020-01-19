import java.io.IOException;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JSONObject jsonobject; 
		
		jsonobject = new JSONObject(); 
		
		
		jsonobject.put("matricula", "12232");
		jsonobject.put("nome", "SIDNEY FRANCISCO PEROTA DA CUNHA");
		
		
		
		
		
		
		System.out.print( jsonobject.toString() );
	
	}

}
