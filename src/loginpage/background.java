/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginpage;

/**
 *
 * @author manit
 */
import javax.swing.*;
import java.awt.*;


public class background extends JFrame {
     private final JLayeredPane layeredPane;

    public background() {
        layeredPane = new JLayeredPane();
        setContentPane(layeredPane);

        // Load and set the background imag
        ImageIcon backgroundImage = new ImageIcon("C:/Manit/Java/NetBeansProjects/LoginPage/src/lib.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
        layeredPane.add(backgroundLabel, Integer.valueOf(0));

        // Your additional components can be added on top of the background
        // layeredPane.add(yourComponent, Integer.valueOf(1));
    }
}
