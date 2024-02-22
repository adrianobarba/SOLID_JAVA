package br.com.adrianobarbosa.rh.service;

import br.com.adrianobarbosa.rh.ValidacaoException;
import br.com.adrianobarbosa.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
    LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
    LocalDate dataAtual = LocalDate.now();
    Long mesesDeseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
    if(mesesDeseUltimoReajuste > 6) {
        throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo de 6 messes!");
        }
    }
}
