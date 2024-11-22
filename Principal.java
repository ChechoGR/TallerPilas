import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        boolean sisas = true;
        int dim = 0;
        int[][]matriz = new int [0][0];
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
                    m.Factorial(dim);
                    m.CrearMatriz(dim);
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