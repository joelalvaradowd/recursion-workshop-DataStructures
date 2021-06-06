
public class Taller1 {
	
    public static Character retornarPrimeraLetra(String cadena) {
        if (cadena.isEmpty()) {
            return null;
        } else {
            if (Character.isUpperCase(cadena.charAt(0))) {
                return cadena.charAt(0);
            } else {
                return retornarPrimeraLetra(cadena.substring(1, cadena.length()));
            }
        }
    }

// El metodo replace ocupa O(1) en este caso, ya que solo reemplazo un caracter
    public static String replaceOA(String cadena, int n) {        
        return replace(new StringBuilder(cadena), n, 0).toString();
    }
    
    private static StringBuilder replace(StringBuilder cadena, int n, int indice) {          
    	if(indice>=cadena.length() || n==0) {    		
    		return cadena;    		
    	}
        if(cadena.charAt(indice)=='o') {      		
    		cadena.replace(indice, indice+1, "a");
    		return replace(cadena, n-1, indice+1);       		
    	}else if(cadena.charAt(indice)=='O') {    		
    		cadena.replace(indice, indice+1, "A");
    		return replace(cadena, n-1, indice+1);     		
    	}else{
            return replace(cadena, n, indice+1);
        }    	
    }
}
    
