
import java.awt.*;  
import javax.swing.*;  
public class Login{  

  JFrame f;
    JLabel L1,email1,pass1;
    JTextField email ;
    JPasswordField pass;
    JPanel panel;
    Login()  
        {  
         f= new JFrame("Panel Example");    
         panel=new JPanel();  
         
         email1 = new JLabel("EMAIL :");
         pass1 = new JLabel( "PASSWORD");
         pass = new JPasswordField();
         pass1. setBounds(370,230,104,94);
         pass.setBounds(476,230,240,66);
         email1.setBackground(Color.black);
         email1.setBounds(420,130,100,90);
        f.getContentPane().setBackground(Color.black);
       // f.setBackground(Color.blue);
        panel.setBounds(345,0,400,600);    
        panel.setBackground(Color.gray);  
         email = new JTextField();
         email.setBounds(480,140,170,50);
       // JButton b1=new JButton("Button 1");     
        //b1.setBounds(50,100,80,30);    
       // b1.setBackground(Color.yellow);   
       // JButton b2=new JButton("Button 2");   
      //  b2.setBounds(100,100,80,30);    
     //   b2.setBackground(Color.green);
     f.add(pass);
     f.add(pass1);
     ImageIcon welcome = new ImageIcon("tt.gif");
      L1 = new JLabel(welcome);
      L1.setBounds(263, 18, 588,74);
      f.add(L1);
    panel.add(email1); //panel.add(b2);  
     f.add(email);
        f.add(email1); 
          f.add(panel);  
                f.setSize(750,580);    
                f.setLayout(null);    
                f.setVisible(true);    
        }  
        public static void main(String args[])  
        {  
        new Login();  
        }  }
