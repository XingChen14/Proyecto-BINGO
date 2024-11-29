import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

public class Juego extends JuegoBase {
    private static List<Integer> numerosBingo = new ArrayList<>();
    private static JLabel numeroActualLabel = new JLabel("0", SwingConstants.CENTER);
    private static JPanel bingoCard; // Variable para guardar la tarjeta de bingo
    private static JLabel[][] historialLabels = Historial.inicializarHistorial();

    /**
     * Inicia el juego de bingo. Configura la ventana principal del juego y todos los elementos necesarios.
     */
    @Override
    public void iniciarJuego() {
        Main.mainMenu.setVisible(false);

        JFrame frame = new JFrame("Bingo Juego");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLayout(new BorderLayout());

        // Panel para la tarjeta de bingo
        JPanel bingoCardPanel = new JPanel();
        bingoCardPanel.setLayout(new BorderLayout());

        // Generar la tarjeta de bingo (solo se genera una vez)
        bingoCard = Carta.generarTarjetaBingo();  // Guardamos la tarjeta en la variable bingoCard
        JLabel bingoLabel = new JLabel("B   I   N   G   O", SwingConstants.CENTER);
        bingoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        bingoCardPanel.add(bingoLabel, BorderLayout.NORTH);
        bingoCardPanel.add(bingoCard, BorderLayout.CENTER);

        // Panel lateral derecho para el círculo y botones
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());

        // Círculo para mostrar el número actual
        numeroActualLabel.setFont(new Font("Arial", Font.BOLD, 24));
        numeroActualLabel.setOpaque(true);
        numeroActualLabel.setBackground(Color.WHITE);
        numeroActualLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        numeroActualLabel.setPreferredSize(new Dimension(100, 100));

        JPanel circlePanel = new JPanel();
        circlePanel.setLayout(new FlowLayout());
        circlePanel.add(numeroActualLabel);

        // Botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        JButton nextButton = new JButton("Next");
        JButton showHistoryButton = new JButton("Mostrar Historial");
        JButton exitButton = new JButton("Salir del Partida");

        nextButton.addActionListener(e -> generarSiguienteNumero());
        showHistoryButton.addActionListener(e -> Historial.mostrarHistorial(frame));
        exitButton.addActionListener(e -> salirAPrincipal(frame));

        buttonPanel.add(nextButton);
        buttonPanel.add(showHistoryButton);
        buttonPanel.add(exitButton);

        rightPanel.add(circlePanel, BorderLayout.CENTER);
        rightPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Agregar todo al marco principal
        frame.add(bingoCardPanel, BorderLayout.CENTER);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.setVisible(true);

        inicializarNumerosBingo();
        Historial.inicializarHistorial();
    }

    /**
     * Inicializa los números de bingo y los mezcla aleatoriamente.
     */
    private static void inicializarNumerosBingo() {
        numerosBingo.clear();
        for (int i = 1; i <= 75; i++) {
            numerosBingo.add(i);
        }
        Collections.shuffle(numerosBingo);
    }

    /**
     * Genera el siguiente número de bingo y actualiza la interfaz.
     * Marca el número en la tarjeta de bingo y el historial. Verifica si el jugador ganó.
     */
    private static void generarSiguienteNumero() {
        if (!numerosBingo.isEmpty()) {
            int numero = numerosBingo.remove(0);
            numeroActualLabel.setText(String.valueOf(numero));

            // Recorrer la tarjeta de bingo y buscar el número correspondiente
            for (int fila = 0; fila < 5; fila++) {
                for (int col = 0; col < 5; col++) {
                    JLabel label = (JLabel) bingoCard.getComponent(fila * 5 + col);
                    if (label.getText().equals(String.valueOf(numero))) {
                        label.setBackground(Color.GRAY); // Cambiar el color a gris
                        label.setOpaque(true);
                        label.setForeground(Color.BLACK); // Asegurarse de que el texto sea visible
                    }
                }
            }

            // Marcar el historial de números
            for (int fila = 0; fila < 5; fila++) {
                for (int col = 0; col < 16; col++) {
                    if (historialLabels[fila][col].getText().equals(String.valueOf(numero))) {
                        historialLabels[fila][col].setBackground(Color.YELLOW);
                        historialLabels[fila][col].setForeground(Color.BLACK);
                    }
                }
            }

            // Verificar si el jugador ganó
            if (!verificarPatronSeleccionado()) {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un patrón para ganar.");
            } else if (verificarPatronGanador()) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado con el patrón seleccionado.");
                salirAPrincipal((JFrame) numeroActualLabel.getTopLevelAncestor());
            }
        } else {
            numeroActualLabel.setText("¡Fin del Juego!");
        }
    }

    /**
     * Verifica si se ha seleccionado un patrón de ganar.
     *
     * @return true si se ha seleccionado un patrón, false en caso contrario.
     */
    private static boolean verificarPatronSeleccionado() {
        return FormaGanar.patronSeleccionado >= 0;
    }

    /**
     * Verifica si el patrón seleccionado por el jugador se cumple en la tarjeta de bingo.
     *
     * @return true si el jugador ha ganado, false en caso contrario.
     */
    // Verificar si el patrón seleccionado por el jugador se cumple en la tarjeta de bingo.
private static boolean verificarPatronGanador() {
    // Obtener el patrón seleccionado
    boolean[][] patron = FormaGanar.patronesDeGanar.get(FormaGanar.patronSeleccionado);

    // Recorrer la tarjeta de bingo y verificar si cumple con el patrón
    for (int fila = 0; fila < 5; fila++) {
        for (int col = 0; col < 5; col++) {
            // Si es la casilla central, considerarla como marcada
            if (fila == 2 && col == 2) {
                continue; // Ignorar la casilla central
            }

            JLabel label = (JLabel) bingoCard.getComponent(fila * 5 + col);
            boolean marcado = label.getBackground().equals(Color.GRAY); // Comprobar si está marcado

            // Si el patrón requiere que esté marcado y no lo está, o viceversa, no cumple
            if (patron[fila][col] && !marcado) {
                return false;
            }
        }
    }
    return true; // Cumple con el patrón
}


    /**
     * Cierra la ventana actual y regresa al menú principal.
     *
     * @param frame La ventana de la partida que se cerrará.
     */
    private static void salirAPrincipal(JFrame frame) {
        frame.dispose();
        Main.mainMenu.setVisible(true);
    }
}
