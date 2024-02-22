package br.com.adrianobarbosa.rh.service.promocao;

import br.com.adrianobarbosa.rh.ValidacaoException;
import br.com.adrianobarbosa.rh.model.Cargo;
import br.com.adrianobarbosa.rh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerente não pode ser promovido!");
        }
        if(metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else{
            throw new ValidacaoException("Funcionario não bateu a meta!");
        }
    }
}
