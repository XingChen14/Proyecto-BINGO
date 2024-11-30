import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

/**
 * Clase que genera una tarjeta de bingo con un diseño de 5x5 y un espacio "FREE" en el centro.
 */
public class Carta {
    /**
     * Genera un panel que representa una tarjeta de bingo con números aleatorios por columna.
     * La celda central contiene un espacio "FREE".
     * 
     * @return JPanel con la tarjeta de bingo generada.
     */
    public static JPanel generarTarjetaBingo() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));  
        int[][] rangos = {{1, 15}, {16, 30}, {31, 45}, {46, 60}, {61, 75}};

        // Generar los números para cada columna
        List<List<Integer>> columnas = new ArrayList<>();
        for (int col = 0; col < 5; col++) {
            columnas.add(generarNumerosColumna(rangos[col][0], rangos[col][1], 5));
        }

        // Rellenar las celdas del panel
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                JLabel label = new JLabel("", SwingConstants.CENTER);
                label.setFont(new Font("Arial", Font.BOLD, 18));
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                if (fila == 2 && col == 2) {
                    label.setText("FREE");
                    label.setBackground(Color.LIGHT_GRAY);
                    label.setOpaque(true);
                } else {
                    label.setText(String.valueOf(columnas.get(col).get(fila)));
                }
                panel.add(label);
            }
        }

        return panel;
    }

    /**
     * Genera una lista de números aleatorios únicos dentro de un rango especificado.
     * 
     * @param min Valor mínimo del rango.
     * @param max Valor máximo del rango.
     * @param cantidad Cantidad de números a generar.
     * @return List<Integer> con los números generados.
     */
    private static List<Integer> generarNumerosColumna(int min, int max, int cantidad) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        while (numeros.size() < cantidad) {
            int numero = random.nextInt(max - min + 1) + min;
            if (!numeros.contains(numero)) {
                numeros.add(numero);
            }
        }
        return numeros;
    }
}
