package src.declara;

public class Locacao {

    private String cliente;
    private String dataInicio;
    private String dataDevolucao;
    private boolean ativa;  
    private Veiculo veiculo;

    public Locacao(String cliente, Veiculo veiculo, String dataInicio, String dataDevolucao) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
        this.ativa = true;
    }

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