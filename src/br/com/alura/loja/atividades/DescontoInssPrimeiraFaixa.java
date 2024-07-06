package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class DescontoInssPrimeiraFaixa extends DescontoInss {

    /*
    0 : se o valor deste BigDecimal for igual ao do objeto BigDecimal passado como parâmetro.
    1 : se o valor deste BigDecimal for maior que o do objeto BigDecimal passado como parâmetro.
    -1 : se o valor deste BigDecimal for menor que o do objeto BigDecimal passado como parâmetro.
    */


    private BigDecimal faixa1 = new BigDecimal("1212.00");
    private BigDecimal percentual1 = new BigDecimal("0.075");

    public DescontoInssPrimeiraFaixa(DescontoInss proximaFaixa) {
        super(proximaFaixa);
    }

    public BigDecimal calcularInss(Remuneracao remuneracao) {


            return remuneracao.totalRemuneracao().multiply(new BigDecimal(String.valueOf(percentual1)));

    }

    @Override
    public boolean deveAplicar(Remuneracao remuneracao) {
        if(remuneracao.totalRemuneracao().compareTo(faixa1) <= 0){
            return true;
        }
        return false;
    }
}
