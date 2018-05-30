package clase01;

import javax.swing.JOptionPane;

/**
 * @author Kevin Rios
 */
public class Clase01 {

    
        /** 
         * punto de entrada del proyecto
         * @param args  Argumentos que ingresan por consola
         */
    
       public static void main(String[] args) {
           /*
          
           Software:  
                      JDK 8.x   www.oracle.com
                      Netbeans IDE 8.x  netbeans.org
           
           JDK Java Development Kit (Kit de desarrollo Java)
           JDK Alternativo: OpenJDK (solo linux)
           IDE Integrated Development Kit (Entorno de desarrollo integrado)
           IDEs: Netbeans, Eclipse, Intellij
           
           */
           
           
           /**  
            * Comentario Java DOC
            * El comentario Java DOC debe colocarse antes de la declaracion de clase o metodo
            */
           
           
           
           // Tipo de datos primitivos
          // Tipo de datos boolean
          boolean bol= true;       // internamente guarda un 1  
          System.out.println(bol);
          
          System.out.println("--------");
          
          bol= false;          // internamente guarda un 0
          System.out.println(bol);
          
          //tipo de datos byte   signed 1 byte
           byte by=100;
           by=-120;           
           
           //tipo de datos short   2 bytes
           short sh=20000;
           sh=200;           
           
           // tipo de datos int    4 bytes
           int in= 2000000000;
           in=-20000000;
           
           // tipo de datos long   8 bytes
           long lo= 2000000000;
           lo= 30000000L;
           
           // tipo de datos float  32 bits
           float fl= 4.25f;
           
           // tipo de datos double 64 bits
           double dou= 4.25;
           
           fl= 10;
           dou=10;
           
           System.out.println(fl/3);
           System.out.println(dou/3);
           
           
           fl= 100;
           dou=100;
           
           
           System.out.println(fl/3);
           System.out.println(dou/3);
           
           // tipo de datos char  (unsigned)   4bytes
           char ch=65;
           // como esto busca en la tabla ascii, me termina imprimiendo el caracter A
           System.out.println(ch);
           
           
           // tipo de datos string 
           // Clase String
           String st = "un texto";
           System.out.println(st);

           // Recorrer el vector st
           
           
           for (int i = 0; i < st.length(); i++) {               
               System.out.print(st.charAt(i));
           }           
           System.out.println();
           
           
           // imprimir st en mayusculas
           
           for (int i = 0; i< st.length(); i++) {
               char caracter= st.charAt(i);
               if (caracter>=97 && caracter <=122) {
                   caracter-=32;
               }
               System.out.print(caracter);
           }
           System.out.println();
           
           
           String test= "prueba";
           
        // operador ternario ? - el unico operador con tres terminos            
        
           for (int i = 0; i < st.length(); i++) {
               char car = st.charAt(i);              
               System.out.print((car>=97 && car<=122)? (car-=32):car);
           }
           System.out.println();
           
           // imprimir st en minusculas
           
           for (int i = 0; i < st.length(); i++) {
               char car = st.charAt(i);
               System.out.println((car>=65 && car<=90)? (car+=32):car);
           }
           System.out.println();
           
           
           System.out.println("----------");
           System.out.println(st.toUpperCase());
           System.out.println(st.toLowerCase());           
           
           System.out.println("----------");
           System.out.println("----------");
           System.out.println("----------");
           // java swing
           // como no esta en java lang la tengo que importar
           
           JOptionPane.showMessageDialog(null, "Hola");
           
           
    } //end main
    
} // end class Clase01
