import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class CenterPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CenterPanel extends JPanel
{
    public CenterPanel()
    {
        this.setLayout(new GridLayout(4, 4, 5, 5));
        JButton button = new JButton("test"); 
        this.setBackground(Color.white);
        JButton b0 = new JButton("0"); //white color
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bCE = new JButton("CE");
        JButton bCalc = new JButton("계산");
        // b0.setBackground(Color.WHITE);
        // b1.setBackground(Color.WHITE);
        // b2.setBackground(Color.WHITE);
        // b3.setBackground(Color.WHITE);
        // b4.setBackground(Color.WHITE);
        // b5.setBackground(Color.WHITE);
        // b6.setBackground(Color.WHITE);
        // b7.setBackground(Color.WHITE);
        // b8.setBackground(Color.WHITE);
        // b9.setBackground(Color.WHITE);
        // bCE.setBackground(Color.WHITE);
        // bCalc.setBackground(Color.WHITE);
        
        JButton bSum= new JButton("+");//cyan color
        JButton bSub = new JButton("-"); 
        JButton bMul = new JButton("x");
        JButton bDiv = new JButton("/");
        bSum.setBackground(Color.CYAN);
        bSub.setBackground(Color.CYAN);
        bMul.setBackground(Color.CYAN);
        bDiv.setBackground(Color.CYAN);
        
        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(bCE);
        this.add(bCalc);
        this.add(bSum);
        this.add(bSub);
        this.add(bMul);
        this.add(bDiv);  
    }
}
