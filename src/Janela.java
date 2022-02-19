import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Janela implements ActionListener {

    public static JFrame frame;
    public static JPanel panel;
    private static JLabel labelUsuario;
    private static JTextField textUsuario;
    private static JLabel labelSenha;
    private static JPasswordField textSenha;
    private static JButton botao;
    private static JLabel sucesso;
    
    public void principal() {
        
        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.setLayout(null);
        
        labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(10, 20, 80, 25);
        panel.add(labelUsuario);

        textUsuario = new JTextField();
        textUsuario.setBounds(100, 20, 165, 25);
        panel.add(textUsuario);

        labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(10, 50, 80, 25);
        panel.add(labelSenha);

        textSenha = new JPasswordField();
        textSenha.setBounds(100, 50, 165, 25);
        panel.add(textSenha);

        botao = new JButton("Entrar");
        botao.setBounds(100, 100, 80, 25);
        botao.addActionListener(new Janela());
        panel.add(botao);

        sucesso = new JLabel("");
        sucesso.setBounds(10, 130, 300, 25);
        panel.add(sucesso);


        frame.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = textUsuario.getText();
        String senha = textSenha.getText();
        System.out.println(senha);
        if (usuario.equals("curioso@gmail.com") && senha.equals("testando123")) {
            frame.setVisible(false);
            new Logado();
        } else {
            sucesso.setText("Login Negado.");
        }
    }

}