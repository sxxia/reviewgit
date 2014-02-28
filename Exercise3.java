import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercise3 extends JFrame
{
	private JLabel firstStringL, secondStringL, lagerStringL;
	
	private JTextField firstStringTF, secondStringTF, lagerStringTF;
	
	private JButton calculateB, exitB;
	
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	public Exercise3()
	{
	firstStringL = new JLabel("Enter the first string: ",SwingConstants.RIGHT);
	secondStringL = new JLabel("Enter the second string: ",SwingConstants.RIGHT);
	lagerStringL = new JLabel("Lager string: ", SwingConstants.RIGHT);
	
	firstStringTF = new JTextField(10);
	secondStringTF = new JTextField(10);
	lagerStringTF = new JTextField(10);
			
    calculateB = new JButton("Calculate");
	cbHandler = new CalculateButtonHandler();
	calculateB.addActionListener((ActionListener) cbHandler);
			
	exitB = new JButton("Exit");
	ebHandler = new ExitButtonHandler();
	exitB.addActionListener(ebHandler);
			
	setTitle("Compare the strings size");
			
	Container pane = getContentPane();
			
	pane.setLayout(new GridLayout(4, 2));
			
	pane.add(firstStringL);
	pane.add(firstStringTF);
	pane.add(secondStringL);
	pane.add(secondStringTF);
	pane.add(lagerStringL);
    pane.add(lagerStringTF);
	pane.add(calculateB);
	pane.add(exitB);
			
	setSize(WIDTH, HEIGHT);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class CalculateButtonHandler implements ActionListener
	{
	   public void actionPerformed(ActionEvent e)
	    {
	      String first, second, lager;
	      first = firstStringTF.getText();
	      second=secondStringTF.getText();
          
	      if(first.length()>second.length())
	    	  lager=first;
	      else
	    	  lager=second;
	
	lagerStringTF.setText(lager);
}

	}
	private class ExitButtonHandler implements ActionListener
	{
	public void actionPerformed(ActionEvent e)
	{
	System.exit(0);
	}
	}
	public static void main(String[] args)
	{
	Exercise3 rectObject = new Exercise3();
	}


}
