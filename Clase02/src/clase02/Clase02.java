package clase02;

import javax.swing.JOptionPane;


public class Clase02 {

   
    public static void main(String[] args) {
        
        // Clase 02 POO
        //Clase: Todo lo que es sustantivo se puede representar. Ej.: alumno,silla
        
        //declaracion de clase interna (una clase dentro de otra)
        // no recomendable su uso actualmente
        class Auto{
            
            // atributos (describen a la clase)
            // Los Atributos numericos se inicializan en 0
            // Los Atributos String/Objetct se inicializan en null
             String marca;
             String modelo;
             String color;
             int velocidad;
             // metodos constructores
             
             Auto(){
                 
             }             
            Auto(String marca, String modelo, String color){
                // de este objeto, el atributo es igual al parametro
                this.marca= marca;
                this.modelo= modelo;
                this.color= color;              
            }
            
          
            
            // metodos
            void acelerar(){
               // velocidad+=10;
               // if(velocidad>100){
               // velocidad=100;
              //  }
              acelerar(10); // llamado de métodos a la misma clas
            }
            
            //sobrecarga de metodos 
            void acelerar(int kilometros){
                velocidad+=kilometros;
                if(velocidad>100){
                    velocidad=100;
                }
            }     
            
            void frenar(){
                velocidad-=10;
                if(velocidad<0){
                    velocidad=0;
                }
            }
            
            void imprimirVelocidad(){
                System.out.println(velocidad);
            }
            int getVelocidad(){
                return velocidad;
            }
            
            @Override
            public String toString(){
                return marca+" "+modelo+" "+color+" "+velocidad;
            }
        
        } // end class auto
               
        System.out.println("-- auto1 --");
        Auto auto1 = new Auto(); // construye un objeto de la clase auto
        auto1.marca="Ford";        
        auto1.modelo= "Falcon";
        auto1.color="Verde";
        auto1.acelerar();       //10
        auto1.acelerar();       //20
        auto1.acelerar();       //30
        auto1.frenar();         //20  
        
        System.out.println(auto1.marca+" "+ auto1.modelo+" "+auto1.color+" "+auto1.velocidad);

        System.out.println("-- auto2 --");
        Auto auto2 = new Auto(); // construye un objeto de la clase auto
        auto2.marca="Fiat";        
        auto2.modelo= "Duna";
        auto2.color="Rojo";
        
        for (int i = 0; i < 38; i++) {
            auto2.acelerar();
                    
            
        }
        
        auto2.frenar();
        auto2.frenar();     //60
        auto2.frenar();     //50
        auto2.frenar();     //40
        auto2.acelerar();   //30
        auto2.acelerar(25); //55
        System.out.println(auto2.marca+" "+ auto2.modelo+" "+auto2.color+" "+auto2.velocidad);

        System.out.println("-- auto3 --");
        Auto auto3 = new Auto("Citroen", "c4", "verde");
        
        auto3.imprimirVelocidad();
        System.out.println(auto3.getVelocidad());
        int velocidad = auto3.getVelocidad();
        System.out.println(velocidad);
        
        //JOptionPane.showMessageDialog(null, "Velocidad: "+auto3.getVelocidad());
        
        // Metodo toString()
        
        System.out.println(auto3.toString());
        System.out.println(auto3);
        
        
        // Libro
        
        Libro libro1 = new Libro(1, "Java", "Jhon Smith", "ABC");
        System.out.println(libro1);
        libro1.setTitulo("qwerty");
        System.out.println(libro1);
        
        
        

        
        
    } // end main
    
    
} // end class
