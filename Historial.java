import java.awt.*;
import javax.swing.*;

public class Historial {
    public static JLabel[][] historialLabels = new JLabel[5][16]; // Cuadro de historial

    /**
     * Inicializa el cuadro del historial con las letras BINGO y los números correspondientes.
     * En la primera columna estarán las letras BINGO, y en las siguientes columnas los números.
     *
     * @return Una matriz de etiquetas JLabel configuradas con letras y números de bingo.
     */
    public static JLabel[][] inicializarHistorial() {
        String[] letras = {"B", "I", "N", "G", "O"};
        int[][] rangos = {{1, 15}, {16, 30}, {31, 45}, {46, 60}, {61, 75}};
        
        // Llenamos la primera columna con las letras BINGO
        for (int fila = 0; fila < 5; fila++) {
            historialLabels[fila][0] = new JLabel(letras[fila], SwingConstants.CENTER);
            historialLabels[fila][0].setFont(new Font("Arial", Font.BOLD, 14));
            historialLabels[fila][0].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            historialLabels[fila][0].setOpaque(true);
            historialLabels[fila][0].setBackground(Color.DARK_GRAY);
            historialLabels[fila][0].setForeground(Color.WHITE);
        }

        // Llenamos las siguientes columnas con los números correspondientes a cada letra
        for (int col = 1; col < 16; col++) {
            for (int fila = 0; fila < 5; fila++) {
                // Calcular el número para cada celda
                int numero = rangos[fila][0] + col - 1; // Para obtener el rango correcto
                if (numero <= rangos[fila][1]) {  // Solo asignar el número si está dentro del rango
                    historialLabels[fila][col] = new JLabel(String.valueOf(numero), SwingConstants.CENTER);
                    historialLabels[fila][col].setFont(new Font("Arial", Font.BOLD, 14));
                    historialLabels[fila][col].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    historialLabels[fila][col].setOpaque(true);
                    historialLabels[fila][col].setBackground(Color.DARK_GRAY);
                    historialLabels[fila][col].setForeground(Color.WHITE);
                }
            }
        }

        return historialLabels;
    }

    /**
     * Muestra un cuadro de diálogo con el historial de números de bingo.
     * Se crea un panel con una cuadrícula de 5 filas por 16 columnas que contiene las etiquetas del historial.
     *
     * @param parent La ventana principal desde donde se muestra el cuadro de diálogo.
     */
    public static void mostrarHistorial(JFrame parent) {
        JPanel panel = new JPanel(new GridLayout(5, 16));
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 16; col++) {
                panel.add(historialLabels[fila][col]);
            }
        }
        JOptionPane.showMessageDialog(parent, panel, "Historial de Números", JOptionPane.INFORMATION_MESSAGE);
    }
}
