import javax.swing.JOptionPane;

public class ejercicio1 {
    public static void main(String[] args) {
        
        // Declaración de variables:
        int c1,c2,c3,meses;
        
        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer capital: "));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo capital: "));
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese capital objetivo: "));
        meses = 0;

        while (c1 + c2 < c3) {
            c1 += (c1 * 0.03);
            c2 += (c2 * 0.04);
            meses++;
        }

        JOptionPane.showMessageDialog(null,
                "Para alcanzar el capital deseado de " + c3 + " pesos, se tardarían un total de " + meses + " meses.");
        System.exit(0);
    }
}
