package ejercicio3;

import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {
        
        // Declaración de variables:
        int n;

        // Entrada:
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));

        // Proceso y salida:
        if (n>=0){

           if ( n == 1 ){

                JOptionPane.showMessageDialog(null, n + " no es un número primo");

                // Fin
                System.exit(0);
                
            }
            
            for(int i=2; i<n; i ++ ){

                if( n % i == 0){

                    JOptionPane.showMessageDialog(null, n + " no es un número primo");
                    
                    // Fin
                    System.exit(0);

                }

                else{

                    JOptionPane.showMessageDialog(null, n + " si es un número primo");

                    // Fin
                    System.exit(0);

                }
                

            }

        }
        else{

            JOptionPane.showMessageDialog(null, n + " es un número negativo");

            // Fin
            System.exit(0);

        }
    }
}
