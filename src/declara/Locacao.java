package src.declara;

// criacao da classe locacao
public class Locacao {
// declaracao das variaveis privadas
    private String cliente;
    private String dataInicio;
    private String dataDevolucao;
    private boolean ativa;  
    private Veiculo veiculo;

//classe construtora da locacao
    public Locacao(String cliente, Veiculo veiculo, String dataInicio, String dataDevolucao) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
        this.ativa = true;
    }

//metodos para usar as variaveis em outros lugares
    public String  getCliente(){
         return cliente;
    }
    public String  getDataInicio(){
         return dataInicio;    
    }
    public String  getDataDevolucao(){ 
        return dataDevolucao; 
    }
    public boolean isAtiva(){ 
        return ativa;        
    }

    public void encerrar() {
        this.ativa = false;
        this.veiculo.setDisponivel(true);
    }
}