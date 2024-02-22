import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing extends JFrame {
    private JTextField txtname;
    private JButton btnclick;
    private JPanel nom;

    public swing() {
        btnclick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnclick,txtname.getText() + " ,hello");
            }
        });
    }

    public static void main(String[] args) {
        swing a = new swing();
        a.setContentPane(a.nom);
        a.setTitle("hello");
        a.setBounds(600,200,200,200);
        //a.setSize(300,400);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


