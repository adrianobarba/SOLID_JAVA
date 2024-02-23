package br.com.adrianobarbosa.rh.service.reajuste;

import br.com.adrianobarbosa.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);

}
