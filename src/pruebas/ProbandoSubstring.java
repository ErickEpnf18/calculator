package pruebas;

import java.util.Scanner;
import static javafx.application.Application.launch;


public class ProbandoSubstring {

    public static void main(String[] args) {
    new ProbandoSubstring().probando();
    }
    
    public void probando(){
        /*
     String texto = " 7777";
if(texto.charAt(0)== ' ')
{
    System.out.println("aqui");
    System.out.println("texto1: ["+texto+"]");
}else{
            System.out.println("resultado: "+texto);
    System.out.println("texto2: ["+texto+"]");
}

Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
        System.out.println("Digite el numero["+(i+1)+"]: ");
String cadena1 = sc.nextLine();
            
        if(cadena1.length() == 1){
            System.out.println("ejecutame: ");
            
        }
            System.out.println("longitud1: ["+cadena1.length()+"]");
        }
        //error 
        //System.out.println("longitud2 : ["+cadena2.length()+"]");
*/
        /*
        String numero = "       9";
        int numeroParseado = Integer.parseInt(numero.trim());
        
        System.out.println("Numero parseado: "+ numeroParseado);
        */
        float nota1 = 7, nota2 = 7;
        String asistencia =  "6";
         float resultado = (nota1 + nota2)/2;
        boolean indice = false;
        if(resultado >= 6){
            indice = true;
        }

        String prueba = "hola";
        String txt="", txt1 = "", txt2 = "";
        
        System.out.println("prueba1: "+prueba);
        //String texto = prueba(prueba)"";
        System.out.println("prueba2: "+txt);
        System.out.println("prueba2: "+prueba(txt, txt1, txt2));

    }
    
    
public String prueba(String d, String f, String g){
    d = "palito"; 
    f = "dado"; 
    g = "cuaderno";
    System.out.println("algo esta");
    return d;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
