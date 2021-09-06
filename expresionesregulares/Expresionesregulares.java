
package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author J-CHAN
 */
public class Expresionesregulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        /*1.- Cree una función o método que reciba una oración y convierta
              cada "i" en "wi" y "e" en "we", y agregue "owo" al final.*/
        System.out.println("- Ejercicio 1 -");
        String caden = "Im gonna ride til I cant no more";
        String caden2 = "Do you ever feel like a plastic bag";
        String caden3 = "Cause baby you're a firework";

        String newcaden = caden.replace("i", "wi").replace("e", "we");
        String newcaden2 = caden2.replace("i", "wi").replace("e", "we");
        String newcaden3 = caden3.replace("i", "wi").replace("e", "we");

        System.out.println("Cadena original: "+ caden);
        System.out.println("Cadena modificado" + newcaden + " owo");
        System.out.println(" ");
        System.out.println("Cadena original: "+ caden2);
        System.out.println("Cadena modificado" + newcaden2+ " owo");
        System.out.println(" ");
        System.out.println("Cadena original: "+ caden3);
        System.out.println("Cadena modificado" + newcaden3 + " owo");
        
        /*2.- Cree una función que tome una cadena y devuelva 
              el número de vocales que contiene.*/
        System.out.println(" ");
        System.out.println("- Ejercicio 2 -");
        
        String sPalabra ="Celebration";
        String sPalabra2 ="Palm";
        String sPalabra3 ="Prediction";
        
        int contador = 0;
        for(int x=0;x<sPalabra.length();x++) {
            if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){ 
                contador++;
            }
        }
        int contador2 = 0;
        for(int x=0;x<sPalabra2.length();x++) {
            if ((sPalabra2.charAt(x)=='a') || (sPalabra2.charAt(x)=='e') || (sPalabra2.charAt(x)=='i') || (sPalabra2.charAt(x)=='o') || (sPalabra2.charAt(x)=='u')){ 
                contador2++;
            }
        }
        int contador3 = 0;
        for(int x=0;x<sPalabra3.length();x++) {
            if ((sPalabra3.charAt(x)=='a') || (sPalabra3.charAt(x)=='e') || (sPalabra3.charAt(x)=='i') || (sPalabra3.charAt(x)=='o') || (sPalabra3.charAt(x)=='u')){ 
                contador3++;
            }
        }
        
            
        System.out.println(sPalabra + " contiene " + contador + " vocales");
        System.out.println(sPalabra2 + " contiene " + contador2 + " vocales");
        System.out.println(sPalabra3 + " contiene " + contador3 + " vocales");
        
         
        /*3.- Cree una función que tome una palabra y devuelva 
              verdadero si la palabra tiene dos letras idénticas consecutivas.*/
        System.out.println(" ");
        System.out.println("- Ejercicio 3 -");
        String letra = "loop";
        String letra2 = "yummy";
        String letra3 = "orange";
        String letra4 = "munchkin";
        
        Pattern p = Pattern.compile("(\\w)\\1+");
        Matcher m = p.matcher(letra);
        if (m.find())
        {
            System.out.println(letra + " - True");
        }else{
            System.out.println(letra + " - False");
        }
        Pattern p2 = Pattern.compile("(\\w)\\1+");
        Matcher m2 = p.matcher(letra2);
        if (m2.find())
        {
            System.out.println(letra2 + " - True");
        }else{
            System.out.println(letra2 + " - False");
        }
        Pattern p3 = Pattern.compile("(\\w)\\1+");
        Matcher m3 = p3.matcher(letra3);
        if (m3.find())
        {
            System.out.println(letra3 + " - True");
        }else{
            System.out.println(letra3 + " - False");
        }
        Pattern p4 = Pattern.compile("(\\w)\\1+");
        Matcher m4 = p4.matcher(letra4);
        if (m4.find())
        {
            System.out.println(letra4 + " - True");
        }else{
            System.out.println(letra4 + " - False");
         }
        
        
        /*4.- Cree una función que tome una cadena y devuelva una nueva
            cadena con todas las vocales eliminadas.*/
        
        System.out.println(" ");
        System.out.println("- Ejercicio 4 -");
        
         String cadena = "I have never seen a thin person drinking Diet Coke.";
         System.out.println("Cadena original: "+ cadena);
         String cadenaCons = cadena.replaceAll("[A,a,E,e,I,i,O,o,U,u]", "");
         System.out.println("Cadena sin vocales: "+cadenaCons);
         System.out.println(" ");
         
         String cadena2 = "We're gonna build a wall!";
         System.out.println("Cadena original: "+ cadena2);
         String cadenaCons2 = cadena2.replaceAll("[A,a,E,e,I,i,O,o,U,u]", "");
         System.out.println("Cadena sin vocales: "+cadenaCons2);
         System.out.println(" ");
         
         String cadena3 = "Happy Thanksgiving to all--even the haters and losers!";
         System.out.println("Cadena original: "+ cadena3);
         String cadenaCons3 = cadena3.replaceAll("[A,a,E,e,I,i,O,o,U,u]", "");
         System.out.println("Cadena sin vocales: "+cadenaCons3);
         
    }
    
}
