package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InterfaceCLI {

	public static void main(String[] args) {

		JFrame frame = new JFrame("IHM pour CLI");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container contenu = frame.getContentPane();
		contenu.setPreferredSize(new Dimension(500, 200));
		contenu.setLayout(new BorderLayout());

//	    JPANELS OF THE FRAME

		JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		JPanel westPanel = new JPanel(new GridLayout(3, 1));

		JPanel centerPanel = new JPanel(new GridLayout(3, 2));

		JPanel southPanel = new JPanel(new GridLayout(1, 1));

//	    NORTH PART

		JButton creuse = new JButton("Creuse (C)");
		JButton pleine = new JButton("Pleine (P)");

//		FIRST PART (1/3) (IN ORDER : WEST, CENTER(MIDDLE,EAST)

		JLabel indiceL = new JLabel("Valeur de m'indice (K)");
		JTextField indiceT = new JTextField();
		JButton indiceB = new JButton("+");

//		FIRST PART (2/3) (IN ORDER : WEST, CENTER(MIDDLE,EAST)

		JLabel alphaL = new JLabel("Valeur de alpha (A)");
		JTextField alphaT = new JTextField();
		JButton alphaB = new JButton("+");

//		FIRST PART (3/3) (IN ORDER : WEST, CENTER(MIDDLE,EAST)

		JLabel epsilonL = new JLabel("Valeur de epsilon (E)");
		JTextField epsilonT = new JTextField();
		JButton epsilonB = new JButton("+");

//	    OUTPUT RESULT

		JTextField result = new JTextField();

//		ADD JAVASWING ELEMENTS TO JPANELS	  

		northPanel.add(creuse);
		northPanel.add(pleine);

		westPanel.add(indiceL);
		centerPanel.add(indiceT);
		centerPanel.add(indiceB);

		westPanel.add(alphaL);
		centerPanel.add(alphaT);
		centerPanel.add(alphaB);

		westPanel.add(epsilonL);
		centerPanel.add(epsilonT);
		centerPanel.add(epsilonB);

		southPanel.add(result);

// 		ADD JPANELS TO THE FRAME

		contenu.add(northPanel, BorderLayout.NORTH);
		contenu.add(westPanel, BorderLayout.WEST);
		contenu.add(centerPanel, BorderLayout.CENTER);
		contenu.add(southPanel, BorderLayout.SOUTH);
		
//		ADDING INTERACTION WITH ELEMENTS
		
		creuse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+ " -C ");
				
			}
		});
		
		pleine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText()+ " -P ");
				
			}
		});
		
		indiceB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + " -K " + indiceT.getText());
			}
		});
		
		alphaB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + " -A " + indiceT.getText());
				
			}
		});
		
		epsilonB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(result.getText() + "-E " + indiceT.getText());
				
			}
		});
		
		

// 		FINITIONS
		frame.pack();
		frame.setVisible(true);

	}

}
