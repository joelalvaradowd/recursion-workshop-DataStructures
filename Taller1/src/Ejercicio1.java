public class Ejercicio1 {
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
}