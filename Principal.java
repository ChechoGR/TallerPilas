import java.util.Stack;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        boolean sisas = true;
        int dim = 0;
        int[][]matriz = null;
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        while (sisas) {
            String seleccion_opcion = JOptionPane.showInputDialog(
                    "Seleccione la opción deseada \n" + "1. Seleccionar la dimensión de la matriz \n" + "2. Salir");
            if (seleccion_opcion == null || seleccion_opcion.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Entrada vacía, ingrese un número");
                continue;

            }
            try{
                int seleccion_opcion1 = Integer.parseInt(seleccion_opcion);
                switch (seleccion_opcion1) {
                    case 1:
                    dim = m.dimension();
                    matriz = m.CrearMatriz(dim);
                    pila1 = m.LlenarPila1(matriz);
                    pila2= m.LlenarPila2(matriz);
                    m.Factorial(dim);
                    m.OrdenarPila1(pila1);
                    m.OrdenarPila2(pila2);
                    break;
                    case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programita!");
                    sisas = false;
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Opción no válida del menú");
    
                }
    
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada no válida");
            }


            
        }
    }
}