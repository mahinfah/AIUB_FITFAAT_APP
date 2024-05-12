import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;  
import javax.swing.*; 
import java.util.*; 
class Doc_Registration implements ActionListener {
	
    private JFrame frame;
	
	private JLabel doctor ,Number ,emailLabel;
    private JTextField nameField,NumberField, emailField;
    private JPasswordField passwordField;
    private JComboBox<String> genderBox;
    private JButton back,registerButton,clearButton;
	
	
	
	
    public Doc_Registration() {
		
		
        frame = new JFrame("Registration");
        frame.setSize(700, 560);
        frame.setLayout(null);
            
        Color mycolor = new Color(100,149,237);
		frame.getContentPane().setBackground(mycolor);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(350, 50, 100, 30);
        frame.add(nameLabel);

        Number = new JLabel ("Contact Number:");
        Number.setBounds(345,350,100,30);
        frame.add(Number); 

     // time = new JLabel("");
	     
		 

        nameField = new JTextField();
        nameField.setBounds(450, 50, 200, 30);
        frame.add(nameField);
		
		NumberField = new JTextField();
		NumberField.setBounds(450,350,200,30);
        frame.add(NumberField); 
        
		
		
		
		ImageIcon doctorpic = new ImageIcon("doctorreg.png");
		doctor = new JLabel(doctorpic);
        doctor.setBounds(-3,-7,350,550);
		
        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(350, 100, 100, 30);
        frame.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(450, 100, 200, 30);
        frame.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(350, 150, 100, 30);
        frame.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(450, 150, 200, 30);
        frame.add(passwordField);
		

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(350, 200, 100, 30);
        frame.add(genderLabel);

        String[] genders = {"Male", "Female", "Other"};
        genderBox = new JComboBox<>(genders);
        genderBox.setBounds(450, 200, 200, 30);
        frame.add(genderBox);


          back = new JButton("Back");
		  back.setBounds(500,490,100,30);



        JButton registerButton = new JButton("Register");
        registerButton.setBounds(458, 450, 100, 30);
       

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(566, 450, 100, 30);
        
		
        
       back.addActionListener(this);
		clearButton.addActionListener(this);
		registerButton.addActionListener(this);
		
		frame.add(doctor);
		
		frame.add(back);
		 frame.add(registerButton);
        frame.add(clearButton);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    private void register() {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String gender = (String) genderBox.getSelectedItem();
		String number = NumberField.getText();
		
 
        // Check for empty fields
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill all fields!");
            return;
        }

        // Check for existing email
        if (isEmailExists(email)) {
            JOptionPane.showMessageDialog(frame, "User with this email already exists!");
            return;
        }

        User newUser = new User(name, email, password, gender,number);

        try {
            FileWriter writer = new FileWriter("reg_user.txt", true);
            writer.write(newUser.getName() + "," + newUser.getEmail() + "," + newUser.getPassword() + "," + newUser.getGender() + "," +newUser.getNumber());
            writer.close();
            JOptionPane.showMessageDialog(frame, "Registration Successful!");
            frame.dispose();
            new Login();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean isEmailExists(String email) {
        try {
            File file = new File("reg_user.txt");
            if (!file.exists()) {
                return false;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[1].equals(email)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private void clearFields() {
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        genderBox.setSelectedIndex(0);
		NumberField.setText("");
    }
	
	
	 public void actionPerformed(ActionEvent e)
    {
   

        if((e.getSource()).equals(back))
       {
         frame.setVisible(false);
           new connect();
       }


      
        if((e.getSource()).equals(registerButton))
       {
         
           register();
       }
	   
	   
	   
        if((e.getSource()).equals(clearButton))
       {
         clearFields()  ;
       }

  }  
	
	
	
	
}