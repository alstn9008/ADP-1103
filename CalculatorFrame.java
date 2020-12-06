import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class CalculatorFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorFrame extends JFrame
{
    public CalculatorFrame()
    {
        this.setSize(300, 300);
        this.setTitle("계산기");

        //JPanel np = new NorthPanel();
        //JPanel cp = new CenterPanel();
        //JPanel sp = new SouthPanel();

        this.add(new CenterPanel(), BorderLayout.CENTER);
        this.add(new NorthPanel(), BorderLayout.NORTH);
        this.add(new SouthPanel(), BorderLayout.SOUTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
