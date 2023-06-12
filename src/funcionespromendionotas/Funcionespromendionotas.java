/*pedir 3 notar y sacr promedio
 */
package funcionespromendionotas;

import javax.swing.JOptionPane;

public class Funcionespromendionotas {

    public static int promedio(int a,int b,int c){ //se crea la funcion donde va la operacio
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        
        //se piden las tres notas
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 2"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese nota 3"));
        
        //se imprime el resultado
        JOptionPane.showMessageDialog(null,"su promedio es: "+promedio(n1,n2,n3));
    }
    
}
