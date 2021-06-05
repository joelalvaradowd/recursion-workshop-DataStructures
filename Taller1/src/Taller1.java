
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

// El stringBuilder trabaja sobre la misma cadena y es más eficiente
    public static String replaceOA(String cadena, int n) {
        StringBuilder sb = new StringBuilder(cadena);
        if (n == 0) {
            return cadena;
        }
        if (cadena.isEmpty()) {
            return "";
        } else {
            StringBuilder inicio = new StringBuilder(sb.substring(0, 1));            
            if (inicio.toString().equals("o")) {                
                return  new StringBuilder("a").append(replaceOA(cadena.substring(1), n - 1)).toString();
            } else {
                return inicio.append(replaceOA(cadena.substring(1), n)).toString();
            }
        }
    }    
}
    
