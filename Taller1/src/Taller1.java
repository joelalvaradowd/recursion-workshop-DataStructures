
public class Taller1 {
	public static Character retornarPrimeraLetra(String cadena) {        
        return retornar(new StringBuilder(cadena),0);
    }
    
    private static Character retornar(StringBuilder sb, int indice) {          
    	if(indice>=sb.length()) {    		
    		return null;    		
    	}
        if(Character.isUpperCase(sb.charAt(indice))) {      		
            return sb.charAt(indice);
        }
        else{
            return retornar(sb, indice+1);
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
    
