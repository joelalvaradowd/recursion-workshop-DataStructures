//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Test {
    public static void main(String[] args) {
        System.out.println("Retornar primera letra\n");
        System.out.println(Taller1.retornarPrimeraLetra("yosoyESPOL"));
        System.out.println(Taller1.retornarPrimeraLetra("hola"));
        System.out.println(Taller1.retornarPrimeraLetra("nPoe"));
        System.out.println(Taller1.retornarPrimeraLetra("Sin mayuscula")); 
        System.out.println(Taller1.retornarPrimeraLetra("uzuM"));                     
        
        System.out.println("Reemplazar o con a\n");
        System.out.println(Taller1.replaceOA("Esta es una cadena sin el caracter", 3));
        System.out.println(Taller1.replaceOA("Buenos dias a todos!", 5));
        System.out.println(Taller1.replaceOA("ee", 5));
        System.out.println(Taller1.replaceOA("Buenos dias a todos!", 2));
        System.out.println(Taller1.replaceOA("Angel Guale", 3));
    }

}
