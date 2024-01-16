import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaSwing extends JFrame implements ActionListener {
    JButton button;  // Jbutton class to create a button
     boolean change = false;
    javaSwing(){
        setTitle("This is my first project");        // For setting the title of the JFrame
        setLayout(null);
        button = new JButton("button");       // Instanceating the button(JButton) object
        button.setSize(100,50);       // For setting the size of the button needed
        button.setLocation(250,175);       // For setting the location of the button created and place it at desired place
        button.addActionListener(this);       // For preforming the desired action we use addActionListener
        add(button);                             //For adding the button in JFrame(Java Frame)


        setVisible(true);                      // For setting the visibility
        setSize(600,400);          // For setting the size of the JFrame
        setResizable(false);                   // For restricting the changing of the size
        getContentPane().setBackground(Color.red);  // For changing of setting the background color




    }

    public static void main(String[] args) {
        javaSwing ob = new javaSwing();

    }

    @Override      //
    public void actionPerformed(ActionEvent actionEvent) {
        String e = actionEvent.getActionCommand();                  //creating a object to use it as a control
        if(e.equals("button") && change==false){

            getContentPane().setBackground(Color.blue);
            change = true;

        }else{
            getContentPane().setBackground(Color.red);
            change = false;
        }
    }
}
