package ejercicio2;

import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main(String[] args) {

        // Declaración de variables:
        int n,f;
        f = 1;

        // Entrada:
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));

        // Proceso y salida:
        if (n>0){
            while(n>1){
                f = f * n;
                n = n - 1;
            }

            JOptionPane.showMessageDialog(null, "El factorial del número " + n + " es " + f);

        }
        else{

            JOptionPane.showMessageDialog(null, "El conjunto está formado por 0 elementos que se pueden combinar de una única forma, es decir, si seguimos aplicando el método que hemos seguido, obtenemos que 0! = 1.");
        }

        // Fin
        System.exit(0);
    
    }
}
