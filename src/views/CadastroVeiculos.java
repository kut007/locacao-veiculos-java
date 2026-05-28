package src.views;
import javax.swing.*;

public class CadastroVeiculos extends JFrame{
    public  CadastroVeiculos() {

    this.setSize(1000, 800);
    this.setTitle("Cadastro de veículos");
    this.setLayout(null); //this é a antiga classe janela que n existe mais pq a propria classe ja é a janela


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

      //  return janela();
    });

    JButton button_exc = new JButton("Excluir");
    button_exc.setBounds(220, 340, 80, 30);

    JPanel painel_v = new JPanel();
    painel_v.setLayout(null);


    painel_v.add(label_modelo);
    painel_v.add(digitar_modelo);
    painel_v.add(label_placa);
    painel_v.add(digitar_placa);
    painel_v.add(label_ano);
    painel_v.add(digitar_ano);
    painel_v.add(label_categoria);
    painel_v.add(combo_categoria);
    painel_v.add(label_cambio);
    painel_v.add(radio_aut);
    painel_v.add(radio_manual);
    painel_v.add(label_opcional);
    painel_v.add(check_ar);
    painel_v.add(check_gps);
    painel_v.add(check_seg);
    painel_v.add(button_salvar);
    painel_v.add(button_limpar);
    painel_v.add(button_exc);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTabbedPane abas = new JTabbedPane(); //é as abas veiculos e locacoes


    JPanel painel_l = new JPanel(); // é o conteudo dentro de cada aba no caso temos a aba veiculos e a aba locações
    painel_l.setLayout(null); 


    abas.addTab("veiculos", painel_v);
    abas.addTab("Locações", painel_l);
    abas.setBounds(0, 0, 990, 760);

    this.add(abas);
    JMenuBar barrinha = new JMenuBar(); // as 3 opções no topo do codgigo veiculso locacoes e sair

    JMenu veiculos = new JMenu("Veiculos");
    JMenu locacoes = new JMenu("Locações");
    JMenu sair = new JMenu("Sair");
    barrinha.add(veiculos);
    barrinha.add(locacoes);
    barrinha.add(sair);
    this.setJMenuBar(barrinha);

    JToggleButton opcoes = new JToggleButton("Mostrar as disponiveis");
    opcoes.setBounds(30, 400, 220, 30);
    painel_v.add(opcoes);

    JLabel textinhoencima = new JLabel("Registrar sua locação");
    textinhoencima.setBounds(20, 8, 200, 30);

    JLabel cliente = new JLabel("Cliente");
    cliente.setBounds(60, 60, 100, 30);

    JTextField digtar_cliente = new JTextField();
    digtar_cliente.setBounds(220, 60, 250, 30);

    JLabel data = new JLabel("Data de inicio");
    data.setBounds(60, 120, 100, 30);

    JTextField data_digitar = new JTextField();
    data_digitar.setBounds(220,120,100,30);

    JLabel datadev = new JLabel("Data de devolução");
    datadev.setBounds(60, 180, 180, 30);

    JTextField datadev_digitar = new JTextField();
    datadev_digitar.setBounds(220, 180, 100, 30);
    
    JLabel veic = new JLabel("Veiculos");
    veic.setBounds(60, 240, 180, 30);

    JComboBox<String> veiculinhos = new JComboBox<>();
    veiculinhos.setBounds(220, 240, 180, 30);

    JButton confirmar = new JButton("Confirmar locação");
    confirmar.setBounds(90, 300, 180, 30);

    JButton registrar = new JButton("Registrar devolução");
    registrar.setBounds(295, 300, 180, 30);

    JButton limpar = new JButton("Limpar");
    limpar.setBounds(500, 300, 100, 30);

    limpar.addActionListener(e ->{
      digtar_cliente.setText("");
      data_digitar.setText("");
      datadev_digitar.setText("");
      veiculinhos.setSelectedIndex(-1);
    });

    button_salvar.addActionListener(e -> {
      //logica a ser feita
    });

    button_exc.addActionListener(e -> {
      JOptionPane.showConfirmDialog(null, "Confirma a exclusão?");
    });
    


    painel_l.add(cliente);
    painel_l.add(textinhoencima);
    painel_l.add(digtar_cliente);
    painel_l.add(data);
    painel_l.add(data_digitar);
    painel_l.add(datadev);
    painel_l.add(datadev_digitar);
    painel_l.add(veic);
    painel_l.add(veiculinhos);
    painel_l.add(confirmar);
    painel_l.add(registrar);
    painel_l.add(limpar);

    this.setVisible(true);
};

}