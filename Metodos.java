import java.util.Arrays;
import java.util.Queue;
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

    public int[][] CrearMatriz2(int dim) {
        int[][] matriz2 = new int[dim][dim];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        return matriz2;
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

    public Queue<Integer> LlenarColas(Queue<Integer> cola1, int dim) {
        for (int i = 0; i < dim; i++) {
            cola1.offer((int) (Math.random() * 100 + 1)); // Offer sirve para añadir

        }
        JOptionPane.showMessageDialog(null, cola1);
        return cola1;
    }

    public Queue<Integer> MultiplicarMatrizCola(Queue<Integer> cola2, int[][] matriz, int[][] matriz2) {
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                int n = matriz[i][j] * matriz2[i][j];
                cola2.offer(n);
            }
        }
        int tamaño = cola2.size();
        JOptionPane.showMessageDialog(null, "Tamaño de la cola: " + tamaño);
        JOptionPane.showMessageDialog(null, cola2, "Cola: Multiplicacion de matrices", 0);
        return cola2;
    }

    public void Limpiardatos(Stack<Integer> pila1, Stack<Integer> pila2,  Queue<Integer> cola1,  Queue<Integer> cola2){
        pila1.clear();
        pila2.clear();
        cola1.clear();
        cola2.clear();
    }

}
