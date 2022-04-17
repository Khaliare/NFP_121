import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("IHM pour CLI");
    frame.setPreferredSize(new Dimension(400, 200));
    frame.setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    JButton button1 = new JButton("Creuse (C)");
    JButton button2 = new JButton("Pleine (P)");

    buttonPanel.add(button1);
    buttonPanel.add(button2);
    
    JPanel middleWestPanel = new JPanel(new GridLayout(3, 1));
    
    JLabel indices = new JLabel("Valeur de l'indice (K)");
    JLabel alpha = new JLabel("Valeur de alpha (A)");
    JLabel epsilon = new JLabel("Valeur de epsilon (E)");
    
    middleWestPanel.add(indices);
    middleWestPanel.add(alpha);
    middleWestPanel.add(epsilon);
    
    JPanel middleCenterPanel = new JPanel(new GridLayout(3, 1));
    
    for (int i = 0; i < 3; i++) {
    	
    	middleCenterPanel.add(new JTextField());
    	middleCenterPanel.add(new JButton("+"));
    }

    JPanel southPanel = new JPanel(new GridLayout(1,1));

    southPanel.add(new JTextField());

    frame.add(buttonPanel, BorderLayout.NORTH);
    frame.add(middleWestPanel,BorderLayout.WEST);
    frame.add(middleCenterPanel, BorderLayout.CENTER);
    frame.add(southPanel, BorderLayout.SOUTH);

    frame.pack();
    frame.setVisible(true);
  }
}
