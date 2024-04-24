import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Login
 {
	 private JFrame f ;
	 private JTextArea	 t ;
	 private JPanel back;
	 private JPasswordField p ;
	 private JButton b ;
	 private JLabel l1 ,l2,l3  ; 
 	
	
	
	
	public Login()
	{
	
	f = new JFrame();
	p = new JPasswordField();
	p.setBounds(500,280,90,80);
	l1 = new JLabel ("NAME:");
    l1.setBounds(400,280,100,80);
	f.add(l1);
	f.add(p);
	//f.add(t);
	f.setSize(800,780);
	f.setVisible(true);	
		
		
		
	}

	
	
	
	
	public static void main(String [] args)
	{
		new Login();
	}
	
	

}