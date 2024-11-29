import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
* Clase que gestiona las formas de ganar en el bingo y permite seleccionar un patrón ganador.
*/
public class FormaGanar {
    public static int patronSeleccionado = -1; // Índice del patrón seleccionado
    public static List<boolean[][]> patronesDeGanar = new ArrayList<>(); // Lista de patrones
    
    /**
    * Inicializa una lista con patrones de ganar predefinidos para el juego de bingo.
    */    
    public static void inicializarPatrones() {
        // 5 In a Row
        patronesDeGanar.add(new boolean[][] {
            {true, true, true, true, true},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},
            {true, true, true, true, true},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},
            {false, false, false, false, false},
            {true, true, true, true, true},
            {false, false, false, false, false},
            {false, false, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {true, true, true, true, true},
            {false, false, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {true, true, true, true, true},
        });
        patronesDeGanar.add(new boolean[][] {
            {true, false, false, false, false},
            {true, false, false, false, false},
            {true, false, false, false, false},
            {true, false, false, false, false},
            {true, false, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, true, false, false, false},
            {false, true, false, false, false},
            {false, true, false, false, false},
            {false, true, false, false, false},
            {false, true, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
            {false, false, true, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, true, false},
            {false, false, false, true, false},
            {false, false, false, true, false},
            {false, false, false, true, false},
            {false, false, false, true, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true},
            {false, false, false, false, true},
        });

        patronesDeGanar.add(new boolean[][] {
            {true, false, false, false, false},
            {false, true, false, false, false},
            {false, false, true, false, false},
            {false, false, false, true, false},
            {false, false, false, false, true},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, true},
            {false, false, false, true, false},
            {false, false, true, false, false},
            {false, true, false, false, false},
            {true, false, false, false, false},
        });
        // 6 Pack
        patronesDeGanar.add(new boolean[][] {
            {true, true, false, false, false},
            {true, true, false, false, false},
            {true, true, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},
            {true, true, false, false, false},
            {true, true, false, false, false},
            {true, true, false, false, false},
            {false, false, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},
            {false, false, false, false, false},
            {true, true, false, false, false},
            {true, true, false, false, false},
            {true, true, false, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, true, true, false, false},
            {false, true, true, false, false},
            {false, true, true, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, true, true, false, false},
            {false, true, true, false, false},
            {false, true, true, false, false},
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, true, true, false, false},
            {false, true, true, false, false},
            {false, true, true, false, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, true, true, false},
            {false, false, true, true, false},
            {false, false, true, true, false},
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, true, true, false},
            {false, false, true, true, false},
            {false, false, true, true, false},
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, true, true, false},
            {false, false, true, true, false},
            {false, false, true, true, false},
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, true, true},
            {false, false, false, true, true},
            {false, false, false, true, true},
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, true, true},
            {false, false, false, true, true},
            {false, false, false, true, true},
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, true, true},
            {false, false, false, true, true},
            {false, false, false, true, true},
        });
        patronesDeGanar.add(new boolean[][] {
            {true, true, true, false, false},          
            {true, true, true, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, true, true, true, false},          
            {false, true, true, true, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, true, true, true},          
            {false, false, true, true, true},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {true, true, true, false, false},          
            {true, true, true, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, true, true, true, false},          
            {false, true, true, true, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, true, true, true},          
            {false, false, true, true, true},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {true, true, true, false, false},          
            {true, true, true, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, true, true, true, false},          
            {false, true, true, true, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, true, true, true},          
            {false, false, true, true, true},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {true, true, true, false, false},          
            {true, true, true, false, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, true, true, true, false},          
            {false, true, true, true, false},          
        });
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, false, false, false},          
            {false, false, true, true, true},          
            {false, false, true, true, true},          
        });
        // 8 Diamond
        patronesDeGanar.add(new boolean[][] {
            {false, false, true, false, false},          
            {false, true, false, true, false},          
            {true, false, false, false, true},          
            {false, true, false, true, false},          
            {false, false, true, false, false},          
        });
        // 8 Small Center Box
        patronesDeGanar.add(new boolean[][] {
            {false, false, false, false, false},          
            {false, true, true, true, false},          
            {false, true, false, true, false},          
            {false, true, true, true, false},          
            {false, false, false, false, false},          
        });
        
    }

    /**
    * Muestra una ventana con todas las formas de ganar disponibles, permitiendo seleccionar una.
    */
    public static void mostrarFormasDeGanar() {
        // Llamar a iniciarPatrones si no se ha hecho ya
        if (patronesDeGanar == null || patronesDeGanar.isEmpty()) {
            inicializarPatrones();
        }
    
        // Crear un panel principal con un diseño de cuadrícula
        JPanel panel = new JPanel(new GridLayout(0, 4, 10, 10)); // Hasta 4 patrones por fila
        List<JButton> botones = new ArrayList<>();
    
        // Generar un componente visual para cada patrón
        for (int i = 0; i < patronesDeGanar.size(); i++) {
            // Crear el panel visual para el patrón
            JPanel patronPanel = generarPanelPatron(patronesDeGanar.get(i));
            patronPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
            // Botón para seleccionar el patrón
            JButton boton = new JButton("Seleccionar");
            final int indice = i; // Necesario para usar dentro del lambda
            boton.addActionListener(e -> {
                patronSeleccionado = indice;
                JOptionPane.showMessageDialog(Main.mainMenu, "Patrón seleccionado: " + (indice + 1));
            });
    
            // Panel que contiene el patrón y su botón
            JPanel contenedor = new JPanel(new BorderLayout());
            contenedor.add(patronPanel, BorderLayout.CENTER);
            contenedor.add(boton, BorderLayout.SOUTH);
    
            // Añadir al panel principal
            panel.add(contenedor);
        }
    
        // Mostrar los patrones en un cuadro de diálogo
        JScrollPane scrollPane = new JScrollPane(panel); // Agregar scroll si hay muchos patrones
        scrollPane.setPreferredSize(new Dimension(800, 600)); // Tamaño del cuadro de diálogo
        JOptionPane.showMessageDialog(Main.mainMenu, scrollPane, "Selecciona una forma de ganar", JOptionPane.PLAIN_MESSAGE);
    }
    
    /*
    * Genera un panel visual que representa un patrón de ganar específico.
    * 
    * @param patron Matriz booleana que define el patrón (true para las casillas marcadas).
    * @return JPanel con la representación gráfica del patrón.
    */
    private static JPanel generarPanelPatron(boolean[][] patron) {
        JPanel panel = new JPanel(new GridLayout(5, 5)); 
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                JLabel label = new JLabel();
                label.setOpaque(true);
                label.setPreferredSize(new Dimension(30, 30)); // Tamaño de cada celda
                label.setBackground(patron[fila][col] ? Color.BLUE : Color.LIGHT_GRAY); // Azul para marcado
                panel.add(label);
            }
        }
        return panel;
    }

}
