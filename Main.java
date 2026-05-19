import javax.swing.*;

public class Main {
public static void main(String[] args) {
// Criando a janela
JFrame janela = new JFrame();
janela.setSize(400,300);
janela.setTitle("Janela");

janela.setLayout(null);

JLabel label_gmail = new JLabel("Gmail:");
label_gmail.setBounds(30,30,100,30);
JTextField field_gmail = new JTextField();
field_gmail.setBounds(90,30,150,30);
JLabel label_idade = new JLabel("idade:");
label_idade.setBounds(30,70,100,30);
JTextField field_idade = new JTextField();
field_idade.setBounds(90,120,100,30);

JButton salvar = new JButton("salvar");
salvar.setBounds(90,100,100,30);

janela.add(label_gmail);
janela.add(field_gmail);
janela.add(label_idade);
janela.add(field_idade);
janela.add(salvar);



janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
janela.setVisible(true);
}
}