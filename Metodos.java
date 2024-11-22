import java.util.Arrays;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Metodos {
    public int dimension() {
        int dim = -1;
        boolean continuar = true;
        while (continuar) {
            try {
                String dimensioncita = JOptionPane.showInputDialog("Ingrese la dimensión: ");
                if (dimensioncita == null || dimensioncita.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se ha ingreso un valor válido, intente nuevamente");
                    continue;
                }
                dim = Integer.parseInt(dimensioncita);
                if (dim <= 0) {
                    JOptionPane.showMessageDialog(null, "No se permiten dimensiones negativas o igual a cero!");
                    continue;
                }
                continuar = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No válido");

            }
        }
        return dim;

    }

    public int Factorial(int dim) {
        if (dim < 0) {
            JOptionPane.showMessageDialog(null, "No se tiene un número entero válido");
            return -1;

        } else {
            int resultado = 1;
            for (int i = 1; i <= dim; i++) {
                resultado = resultado * i;

            }
            JOptionPane.showMessageDialog(null, "El factorial de la dimensión es: \n" + dim + "!= " + resultado);
            return resultado;
        }

    }

    public int[][] CrearMatriz(int dim) {
        int[][] matriz = new int[dim][dim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        return matriz;
    }

    public Stack<Integer> LlenarPila1(int[][] matriz) {
        Stack<Integer> pila1 = new Stack<>();
        for (int i = 0; i < matriz.length; i++) {
            int sumF = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumF += matriz[i][j];
            }
            pila1.push(sumF);
            System.out.println(pila1); // Prueba para la salida
        }
        JOptionPane.showMessageDialog(null, "La pila (PILA 1) con la suma de las filas es: \n" + pila1);
        System.out.println("Prueba para validar resultados" + pila1);
        return pila1;
    }

    public Stack<Integer> LlenarPila2(int[][] matriz) {
        Stack<Integer> pila2 = new Stack<>();
        for (int i = 0; i < matriz.length; i++) {
            int sumC = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumC += matriz[j][i];
            }
            pila2.push(sumC);
        }
        JOptionPane.showMessageDialog(null, "La pila (PILA 2) con la suma de las columnas es: \n" + pila2);
        System.out.println("Prueba para validar resultados" + pila2);
        return pila2;
    }

    public Stack<Integer> OrdenarPila1(Stack<Integer> pila1) {
        int n1 = pila1.size();
        int[] arreglo1 = new int[n1];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = pila1.pop();
        }
        Arrays.sort(arreglo1);
        for (int i = 0; i < arreglo1.length; i++) {
            pila1.push(arreglo1[i]);
        }
        JOptionPane.showMessageDialog(null, "La pila ordenada (PILA 1) con la suma de las filas es: \n" + pila1);
        return pila1;
    }
    public Stack<Integer> OrdenarPila2(Stack<Integer> pila2) {
        int n2 = pila2.size();
        int[] arreglo1 = new int[n2];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = pila2.pop();
        }
        Arrays.sort(arreglo1);
        for (int i = 0; i < arreglo1.length; i++) {
            pila2.push(arreglo1[i]);
        }
        JOptionPane.showMessageDialog(null, "La pila ordenada (PILA 1) con la suma de las filas es: \n" + pila2);
        return pila2;
    }

}
