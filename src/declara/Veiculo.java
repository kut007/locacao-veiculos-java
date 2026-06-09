package src.declara;

public class Veiculo {
    private String modelo;
    private String placa;
    private String categoria;
    private String ano;
    private String cambio;
    private boolean arCondicionado;
    private boolean gps;
    private boolean seguro;
    private boolean disponiveis;

public Veiculo(String modelo, String placa, String categoria, String ano, String cambio, boolean arCondicionado, boolean gps, boolean seguro) {
    this.modelo = modelo;
    this.placa = placa;
    this.categoria = categoria;
    this.ano = ano;
    this.cambio = cambio;
    this.arCondicionado = arCondicionado;
    this.gps = gps;
    this.seguro = seguro;
    this.disponiveis = true;
}

public String getModelo() {
    return modelo;
}
public String getPlaca() {
    return placa;
}
public String getCategoria(){
    return categoria;
}
public String getAno() {
    return ano;
}
public String getCambio() {
    return cambio;
}
public boolean getArCondicionado() {
    return arCondicionado;
}
public boolean getGps() {
    return gps;
}
public boolean getSeguro() {
    return seguro;
}
public boolean isDisponiveis() {
    return disponiveis;
}

public void setDisponivel(boolean disponivel) {
    this.disponiveis = disponivel;
}
}

