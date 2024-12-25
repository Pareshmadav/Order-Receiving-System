import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingChkOrder extends JFrame implements ActionListener{
    JLabel l1,l2;
    JCheckBox chkTea,chkCoffee,chkSoftDrink;
    JButton b1,b2;
    JPanel p1,p2;
    JTextArea ta;

    SwingChkOrder()
    {
        setLayout(new GridLayout(6,1,10,10));
        setSize(600,700);
        setTitle("Smart Order Receiver");

        l1 = new JLabel("Select Order : ");
        l2 = new JLabel("Order : ");
        p1 = new JPanel();
        p2 = new JPanel();
        ta = new JTextArea(30,60);
        p1.setLayout(new GridLayout(4,1,10,10));
        p2.setLayout(new GridLayout(2,2,10,10));
        chkTea= new JCheckBox("Tea");
        chkCoffee= new JCheckBox("Coffee");
        chkSoftDrink= new JCheckBox("Soft Drink");
        b1 = new JButton("Order");
        b2 = new JButton("Cancel");

        p1.add(l1);
        p1.add(chkTea);
        p1.add(chkCoffee);
        p1.add(chkSoftDrink);
        p2.add(b1);
        p2.add(b2);
        p2.add(l2);
        p2.add(ta);

        b1.addActionListener(this);
        b2.addActionListener(this);
        add(p1);
        add(p2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String ord = "Your Order is : ";
        if (ae.getSource()==b1)
        {
            if(chkTea.isSelected())
            {
                ord+="Tea ";
            }
            if(chkCoffee.isSelected())
            {
                ord+="Coffee ";
            }
            if(chkSoftDrink.isSelected())
            {
                ord+="Soft Drink ";
            } 
            ta.setText(ord);
            JOptionPane.showMessageDialog(this,ord);
        }
        else
        {
            ta.setText("Order : ");
            chkTea.setSelected(false);
            chkCoffee.setSelected(false);
            chkSoftDrink.setSelected(false);
            
        }
    }

    public static void main(String args[])
    {
        new SwingChkOrder();
    }
}