import javax.swing.*;

public abstract class JuegoBase {

    /** 
     *Método abstracto que las subclases deben implementar
     */
    public abstract void iniciarJuego();

    /**
     * Mostrar las reglas del juego.
     * @param mensaje El mensaje de reglas a mostrar.
     */
    public void mostrarReglas(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Reglas", JOptionPane.INFORMATION_MESSAGE);
    }
}
