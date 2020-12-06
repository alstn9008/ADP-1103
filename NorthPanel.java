import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class NorthPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NorthPanel extends JPanel
{
    public NorthPanel()
    {
        //this.setBackground(Color.gray);
        JLabel lo = new JLabel("수식입력");
        JTextField tfo = new JTextField("", 16);
        
        this.add(lo);
        this.add(tfo);
    }

}
