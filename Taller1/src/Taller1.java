
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
    
    
    public static String replaceOA(String cadena, int n) {
        return replace(cadena, n, 0);
    }
    
    private static String replace(String cadena, int n, int inicio) {    	
    	StringBuilder sb = new StringBuilder(cadena);     	
    	if(inicio>cadena.length() || n==0) {    		
    		return sb.toString();    		
    	}else if(sb.charAt(inicio)=='o') {      		
    		sb.replace(inicio, inicio+1, "a");   
    	}else if(cadena.charAt(inicio)=='O') {    		
    		sb.replace(inicio, inicio+1, "A");		    		
    	}else {
    		return replace(sb.toString(), n, inicio+1);
    	}
        return replace(sb.toString(), n-1, inicio+1); 
    	
    }
}
