import javax.swing.*;
// implementei meu codigo (da Bia)
public class Main {
public static void main(String[] args) {
JFrame janela = new JFrame();
janela.setSize(1000, 800);
janela.setTitle("Cadastro de veículos");
janela.setLayout(null);

JLabel label_modelo = new JLabel("Modelo");
label_modelo.setBounds(30, 30, 100 ,30);

JTextField digitar_modelo = new JTextField();
digitar_modelo.setBounds(130, 30, 200, 30);

JLabel label_placa = new JLabel("Placa");
label_placa.setBounds(30, 90, 100, 30);

JTextField digitar_placa = new JTextField();
digitar_placa.setBounds(130, 90, 100, 30);

JLabel label_ano = new JLabel("Ano");
label_ano.setBounds(30, 130, 100, 30);

JTextField digitar_ano = new JTextField();
digitar_ano.setBounds(130, 130, 100, 30);

JLabel label_categoria = new JLabel("Categoria");
label_categoria.setBounds(30, 190, 100, 30);

JComboBox<String> combo_categoria = new JComboBox<>();//pra criar a setinha
combo_categoria.addItem("Economico");
combo_categoria.addItem("SUV");
combo_categoria.addItem("Executivo");
combo_categoria.setBounds(130, 190, 150, 30);

JLabel label_cambio = new JLabel("Câmbio");
label_cambio.setBounds(30, 240, 100, 30);

JRadioButton radio_manual = new JRadioButton("Manual"); // botoes  ai fzemos o button group pra poder marcar só 1
radio_manual.setBounds(130, 240, 90, 30);

JRadioButton radio_aut = new JRadioButton("Automatico");
radio_aut.setBounds(220, 240, 110, 30);

ButtonGroup grupo_ma = new ButtonGroup();
grupo_ma.add(radio_manual);
grupo_ma.add(radio_aut);

JLabel label_opcional = new JLabel("Opcionais");
label_opcional.setBounds(30, 290, 100, 30);

JCheckBox check_ar = new JCheckBox("Ar condicionado");
check_ar.setBounds(130, 290, 130, 30);

JCheckBox check_gps = new JCheckBox("GPS"); // chek é chegagem onde posso marcar mais de 1
check_gps.setBounds(290, 290, 70, 30);

JCheckBox check_seg = new JCheckBox("Seguro");
check_seg.setBounds(370, 290, 90, 30);

JButton button_salvar = new JButton("Salvar");
button_salvar.setBounds(30, 340, 80, 30);

JButton button_limpar = new JButton("Limpar");
button_limpar.setBounds(120, 340, 80, 30);

button_limpar.addActionListener(e ->{
    digitar_modelo.setText("");
    digitar_placa.setText("");
    digitar_ano.setText("");
    combo_categoria.setSelectedIndex(-1);
    grupo_ma.clearSelection();
    check_ar.setSelected(false);
    check_gps.setSelected(false);
    check_seg.setSelected(false);
});

JButton button_exc = new JButton("Excluir");
button_exc.setBounds(220, 340, 80, 30);

janela.add(label_modelo);
janela.add(digitar_modelo);
janela.add(label_placa);
janela.add(digitar_placa);
janela.add(label_ano);
janela.add(digitar_ano);
janela.add(label_categoria);
janela.add(combo_categoria);
janela.add(label_cambio);
janela.add(radio_aut);
janela.add(radio_manual);
janela.add(label_opcional);
janela.add(check_ar);
janela.add(check_gps);
janela.add(check_seg);
janela.add(button_salvar);
janela.add(button_limpar);
janela.add(button_exc);

janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
janela.setVisible(true);



}
}