package src.controler;

import src.declara.Veiculo;
import src.declara.Locacao;
import src.repositorio.VeiculoRepositorio;
import src.repositorio.LocacaoRepositorio;

        // valida os campos
public class CadastroVei {

    public String validar(String modelo, String placa, String ano, String categoria, String cambio) {
    if (modelo.trim().isEmpty()) {
        return "Modelo obrigatório";
             }
    if (placa.trim().isEmpty()){
        return "Placa obrigatória";
            }
    try { //aqui o try catch e utilizado para verificar o ano
             int anoInt = Integer.parseInt(ano.trim());
            if (anoInt < 1900 || anoInt > 2026) {
                return "Ano invalido digite um ano valido";
        }
    } catch (NumberFormatException e) { //se e escrito qualquer coisa alem de numeros e jogado para o catch e manda uma mensagem de erro
            return "Ano invalido, digite apenas numeros";
        }
    if (categoria == null) {
        return "Selecione uma categoria"; 
            }
    if (cambio == null)  {
        return "Selecione o câmbio";
            }
     return null;
    }
//valida os campos do locacao
    public String validarLocacao(String cliente, String dataInicio, String dataDevolucao, String placaSelecionada) {
    if (cliente.trim().isEmpty()) {
        return "Nome do cliente e obrigatorio";
            }
    if (dataInicio.trim().isEmpty()) {
        return "Data de inicio e obrigatorio";
            }
    if (dataDevolucao.trim().isEmpty()){
        return "Data de devolucao e obrigatoria";
            }
    if (placaSelecionada == null || placaSelecionada.isEmpty()) {
        return "selecione um veiculo disponivel";
            }
        return null;
    }
}


