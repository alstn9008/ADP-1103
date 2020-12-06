import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class SouthPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SouthPanel extends JPanel
{
    public SouthPanel()
    {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBackground(Color.yellow);

        JLabel lr = new JLabel("계산결과", SwingConstants.LEFT);
        JTextField tfr = new JTextField("", 16);
        
        this.add(lr);
        this.add(tfr);
    }
}
