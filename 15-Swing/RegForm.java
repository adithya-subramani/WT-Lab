import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class RegForm implements ActionListener{
    JFrame frame;
    JLabel frameTitle,details,info;
    JTextField box[];
    JComboBox<String> courseList,branchList;
    JComboBox<Integer> semList;
    JButton registerButton;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
    
    public RegForm(){
        frame = new JFrame();
        frameTitle = new JLabel("Registration form");
        frameTitle.setFont(new Font("Serif", Font.BOLD, 30));
        frameTitle.setBounds(100, 10, 600, 30);
        details = new JLabel("<html>Name "+"<br><br>DOB "+"<br><br>Gender "+"<br><br>Mail Id "+"<br><br>Mobile No. "+"<br><br>Password "+"<br><br>"
                + "Re-Password "+"<br><br>Courses "+"<br><br>Branch "+"<br><br>Semester</html>");
        details.setBounds(50, 60, 400, 500);
        details.setFont(new Font("Serif", Font.PLAIN, 20));
        
        // adding text fields
        box = new JTextField[7];
        for(int i=0;i<7;i++){
            if(i!=2){
                box[i] = (i>=5)?new JPasswordField(): new JTextField();
                box[i].setBounds(200, 38+47*(i+1), 200, 30);
                frame.add(box[i]);
            }
        }
        
        // Gender
        genderMale = new JRadioButton("Male", true);
        genderMale.setActionCommand("Male");
        genderFemale = new JRadioButton("Female");
        genderFemale.setActionCommand("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
        genderMale.setBounds(200, 179, 100, 30);
        genderFemale.setBounds(310, 179, 100, 30);
        
        // Branch
        branchList = new JComboBox<>();
        branchList.addItem("Computer Science and Engineering");
        branchList.addItem("Electronics and Communication Engineering");
        branchList.addItem("Information Technology");
        branchList.setBounds(200, 414, 200, 30);
        
        // Courses
        courseList = new JComboBox<>();
        courseList.addItem("M.E./M.Tech");
        courseList.addItem("B.E./B.Tech");
        courseList.addItem("BCA/MCA");
        courseList.setBounds(200, 461, 200, 30);
        
        // Semester
        semList = new JComboBox<>();
        for(int i=1;i<=8;i++) semList.addItem(i);
        semList.setBounds(200, 508, 200, 30);
        
        // Button 
        registerButton = new JButton("Register");
        registerButton.setBounds(130, 555, 200, 30);
        registerButton.addActionListener(this);
        
        // adding components
        frame.add(frameTitle);
        frame.add(details);
        frame.add(branchList);
        frame.add(courseList);
        frame.add(semList);
        frame.add(genderMale);
        frame.add(genderFemale);
        frame.add(registerButton);
        
        frame.setSize(500,700);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new RegForm();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        JDialog d = new JDialog(frame, "Submitted Details");
        info = new JLabel("<html>Name: "+box[0].getText()+"<br><br>DOB: "+box[1].getText()+"<br><br>Gender: "+genderGroup.getSelection().getActionCommand()+
                "<br><br>Mail Id: "+box[3].getText()+"<br><br>Mobile No.: "+box[4].getText()+"<br><br>Password: "+box[5].getText()+"<br><br>Courses: "
                +courseList.getSelectedItem()+"<br><br>Branch: "+branchList.getSelectedItem()+"<br><br>Semester: "+semList.getSelectedItem()+"</html>");
        info.setFont(new Font("Serif", Font.BOLD, 18));
        d.add(info);
        JPanel panel = (JPanel)d.getContentPane();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        d.setSize(400, 500);
        d.setVisible(true);
    }
}
