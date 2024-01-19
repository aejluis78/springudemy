import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CadenaRevez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		String cadenaRevez = "ALOH OTAG";
		
		System.out.println("Cadena la revez " +  cadenaRevez);
		System.out.println("Cadena la original " + getCadenaAlRevez(cadenaRevez));**/
		
		String  cadena = "SDFAFA789789adfadfuoiuiojkjo";
		if (esSoloMumerosLetras(cadena)) {
			System.out.println("Cadena Valida");
		}else {
			System.out.println("Cadena No valida");
		}
			

	}
	
	public static String getCadenaAlRevez(String encoded_str) {
		String cadenaOriginal = "";
		if (encoded_str !=null || encoded_str!="") {
			for(int i=encoded_str.length();i>=0; i--) {
				if(i>0)
					cadenaOriginal =    cadenaOriginal.concat(encoded_str.substring(i-1, i));
			}
		}
		
		return cadenaOriginal;
	}
	
	private static boolean esSoloMumerosLetras(String cadena) {
		Boolean esNumeroLetras = false;
		try {
			Pattern pat = Pattern.compile("[A-Za-z1-9]+");   
		    Matcher mat = pat.matcher(cadena);
		       if(mat.matches()){
		          esNumeroLetras = true;
		       }
		} catch (Exception e) {
			System.out.println("Cadena No valida" + e.getCause());
		}
		return esNumeroLetras;
	}

}
