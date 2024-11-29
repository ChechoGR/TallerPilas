import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        boolean sisas = true;
        int dim = 0;
        int[][] matriz = null;
        int[][] matriz2 = null;
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        while (sisas) {
            String seleccion_opcion = JOptionPane.showInputDialog(
                    "Seleccione la opción deseada \n" + "1. Seleccionar la dimensión de la matriz \n" + "2. Salir \n"
                            + "3. Llenar cola\n" + "4. Multiplicar dos matrices en una cola \n"
                            + "5. Crear dos pilas y añadir en colas por par o impar \n");
            if (seleccion_opcion == null || seleccion_opcion.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entrada vacía, ingrese un número");
                continue;

            }
            try {
                int seleccion_opcion1 = Integer.parseInt(seleccion_opcion);
                switch (seleccion_opcion1) {
                    case 1:
                        dim = m.dimension();
                        matriz = m.CrearMatriz(dim);
                        pila1 = m.LlenarPila1(matriz);
                        pila2 = m.LlenarPila2(matriz);
                        m.Factorial(dim);
                        m.OrdenarPila1(pila1);
                        m.OrdenarPila2(pila2);
                        m.Limpiardatos(pila1, pila2, cola1, cola2);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Saliendo del programita!");
                        sisas = false;
                        break;
                    case 3:
                        dim = m.dimension();
                        cola1 = m.LlenarColas(cola1, dim);
                        m.Limpiardatos(pila1, pila2, cola1, cola2);
                        break;
                    case 4:
                        dim = m.dimension();
                        matriz = m.CrearMatriz(dim);
                        matriz2 = m.CrearMatriz2(dim);
                        cola2 = m.MultiplicarMatrizCola(cola2, matriz, matriz2);
                        m.CalcularMedias(matriz, matriz2);
                        m.Limpiardatos(pila1, pila2, cola1, cola2);

                        break;
                    case 5:
                        dim = m.dimension();
                        matriz = m.CrearMatriz(dim);
                        pila1 = m.LlenarPila1(matriz);
                        pila2 = m.LlenarPila2(matriz);
                        m.LlenarColas(pila1, pila2);
                        m.Limpiardatos(pila1, pila2, cola1, cola2);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida del menú");

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida");
            }

        }
    }
}