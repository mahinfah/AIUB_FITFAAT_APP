
import java.awt.*;  
import javax.swing.*;  
public class Login{  

    JLabel L1,email1,pass1;
    JTextField email ;
    JPasswordField pass;
    
    Login()  
        {  
        JFrame f= new JFrame("Panel Example");    
        JPanel panel=new JPanel();  
         email1 = new JLabel("EMAIL :");
         email1.setBackground(Color.black);
         email1.setBounds(360,76,60,40);
        f.getContentPane().setBackground(Color.black);
       // f.setBackground(Color.blue);
        panel.setBounds(345,0,400,450);    
        panel.setBackground(Color.gray);  

       // JButton b1=new JButton("Button 1");     
        //b1.setBounds(50,100,80,30);    
       // b1.setBackground(Color.yellow);   
       // JButton b2=new JButton("Button 2");   
      //  b2.setBounds(100,100,80,30);    
     //   b2.setBackground(Color.green);
     ImageIcon welcome = new ImageIcon("messagif (2).gif");
      L1 = new JLabel(welcome);
      L1.setBounds(345, 1, 438, 66);
      f.add(L1);
    panel.add(email1); //panel.add(b2);  
     
        f.add(email1); 
          f.add(panel);  
                f.setSize(750,450);    
                f.setLayout(null);    
                f.setVisible(true);    
        }  
        public static void main(String args[])  
        {  
        new Login();  
        }  }