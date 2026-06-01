package src.controler;

import src.declara.Veiculo;
import src.repositorio.VeiculoRepositorio;

        // valida os campos
public class VeiculoController {

    public String validar(String modelo, String placa, String ano, String categoria, String cambio) {
    if (modelo.trim().isEmpty()) {
        return "Modelo obrigatório";
             }
    if (placa.trim().isEmpty()){
        return "Placa obrigatória";
            }
    if (ano.trim().isEmpty()) {
        return "Ano obrigatório"; 
            }
    if (categoria == null) {
        return "Selecione uma categoria"; 
            }
        if (cambio == null)  {
         return "Selecione o câmbio";
            }
     return null;
    }

    public boolean salvar(String modelo, String placa, String ano, String categoria, String cambio, boolean ar, boolean gps, boolean seguro) {
        // criar repositorio
        } 
    }
    public boolean excluir(String placa) {
        // criar repositorio
    }
