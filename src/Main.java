import javax.swing.*;
import gui.MainMenuUI;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainMenuUI();
        });
    }
}
