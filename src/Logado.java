import javax.swing.JFrame;
import javax.swing.JLabel;

public class Logado extends JFrame {
    
    public Logado() {

        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        
        label = new JLabel("ACESSO AUTORIZADO!");
        label.setBounds(80, 0, 150, 150);
        frame.add(label);
    }


}