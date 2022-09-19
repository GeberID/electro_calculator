import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Gui mainWindow = new Gui();
        mainWindow.pack();
        mainWindow.setSize(new Dimension(400, 400));
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}