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
                if (dim < 0) {
                    JOptionPane.showMessageDialog(null, "No se permiten dimensiones negativas!");
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
            return resultado;
        }
    }
}
