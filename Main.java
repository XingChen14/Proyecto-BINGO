import java.awt.GridLayout;
import javax.swing.*;

public class Main {
    public static JFrame mainMenu; // Ventana principal del menú
    private static JuegoBase juego; // Instancia de un juego concreto que extiende JuegoBase

    public static void main(String[] args) {
        // Inicializar el juego concreto
        juego = new Juego(); // Juego extiende JuegoBase
        mostrarMenuInicio();
    }

    /**
     * Mostrar el menú principal.
     */
    private static void mostrarMenuInicio() {
        mainMenu = new JFrame("Menú de Bingo");
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setSize(400, 400);
        mainMenu.setLayout(new GridLayout(4, 1));

        JButton jugarButton = new JButton("Jugar");
        JButton reglasButton = new JButton("Reglas");
        JButton formasButton = new JButton("Forma de Ganar");
        JButton salirButton = new JButton("Salir");

        jugarButton.addActionListener(e -> juego.iniciarJuego());
        reglasButton.addActionListener(e -> {
            String mensaje = """
                Instrucciones del Juego:
                1. Selecciona una forma de ganar.
                2. Presiona “Jugar” para generar una tarjeta.
                3. Observa los números sorteados y su coincidencia en tu tarjeta.
                4. Presiona “Next” para avanzar al siguiente número.
                ¡Disfruta del juego!
                """;
            juego.mostrarReglas(mensaje); 
        });
        formasButton.addActionListener(e -> FormaGanar.mostrarFormasDeGanar());
        salirButton.addActionListener(e -> System.exit(0));

        mainMenu.add(jugarButton);
        mainMenu.add(reglasButton);
        mainMenu.add(formasButton);
        mainMenu.add(salirButton);
        mainMenu.setVisible(true);
    }
}