import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;  
import javax.swing.*;  
public class Login{  

  JFrame frame;
  JButton login,signin,adminsignin;
  
    JLabel L1,email1,pass1,pic,wel;
    JTextField email_field ;
    JPasswordField pass;
    JPanel panel;
    public Login()  
        {  
         frame= new JFrame("Panel Example");    
         panel=new JPanel();  
             email_field = new JTextField();
  ImageIcon loginpic = new ImageIcon("login.png");
  login = new JButton(loginpic);
  login.setBounds(430,335,70,27);
  frame.add(login);
ImageIcon wel1 = new ImageIcon("messagif (3).gif");
    wel = new JLabel(wel1);
	wel.setBounds(0,1,340,180);
	frame.add(wel);
  ImageIcon signinpic = new ImageIcon("signin.png");
  signin = new JButton(signinpic);
signin.setBounds(550,335,70,29);
frame.add(signin);
  email1 = new JLabel("    EMAIL :");
         pass1 = new JLabel( " PASSWORD :");
         pass = new JPasswordField();
         pass1. setBounds(420,200,104,94);
         pass.setBounds(510,230,150,35);
         email1.setBounds(420,155,200,40);
         email1.setBackground(Color.black);
         email_field.setBounds(510,155,150,35);
        frame.getContentPane().setBackground(Color.black);
       // f.setBackground(Color.blue);
       ImageIcon front  = new ImageIcon("boyjogging.gif");
         pic = new JLabel(front);
         pic.setBounds(1, 195, 340, 360);
        panel.setBounds(345,0,400,600);    
        panel.setBackground(Color.gray);  
     
         
       // JButton b1=new JButton("Button 1");     
        //b1.setBounds(50,100,80,30);    
       // b1.setBackground(Color.yellow);   
       // JButton b2=new JButton("Button 2");   
      //  b2.setBounds(100,100,80,30);    
     //   b2.setBackground(Color.green);
     frame.add(pass);
     frame.add(pass1);
     frame.add(pic);
     //f.add(front);
     ImageIcon welcome = new ImageIcon("tt.gif");
      L1 = new JLabel(welcome);
      L1.setBounds(263, 50, 588,74);
	  
	  login.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent e){
			  login();
	}
	  });
	  
         frame.add(L1);
         panel.add(email1); //panel.add(b2);  
         frame.add(email_field);
         frame.add(email1); 
         frame.add(panel);  
         frame.setSize(740,585);  
		 frame.setLayout(null);  
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null);			
         frame.setVisible(true);
 
		}
 
  private void Login ()
  {
	 String email = email_field.getText();
	 String password =  new String ( pass.getPassword());
	  User user = null;
	  
try  {
	File file = new File("reguser.txt");
if( !file.exists())
    {  JOptionPane.showMessageDialog(frame,"PLEASE SIGNUP FIRST");	
	return ;
	}
	
	
	BufferedReader reader = new BufferedReader(new FileReader(file));
    	String textline ;
		boolean loggedin = false ;
		while ( (textline=reader.readLine())!= null)
		{
			String [] part =textline.split(",");
			if(part[1].equals(email1)&&part[2].equals(password))
			{
				loggedin = true ;
				user = new User( part[0],part[1],part[2],part[3]);
			break;}
		}
		reader.close();
		if( loggedin)
		{
			JOptionPane.showMessageDialog(frame,"Login succesfully");	
			frame.dispose();
			new Dashboard();
		}
		else
		{
			JOptionPane.showMessageDialog(frame,"Invalid password or email");	
		}
    }
	catch (IOException ex)
	{ 
	ex.printStackTrace();
	}
}
	
        public static void main(String args[])  
        {  
        new Login();  
        } 
       }
