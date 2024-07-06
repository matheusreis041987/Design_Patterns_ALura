package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class DescontoInssQuartaFaixa extends DescontoInss {

    /*
    0 : se o valor deste BigDecimal for igual ao do objeto BigDecimal passado como parâmetro.
    1 : se o valor deste BigDecimal for maior que o do objeto BigDecimal passado como parâmetro.
    -1 : se o valor deste BigDecimal for menor que o do objeto BigDecimal passado como parâmetro.
    */


    private BigDecimal faixa4 = new BigDecimal("7087.22");
    private BigDecimal percentual4 = new BigDecimal("0.14");

    public DescontoInssQuartaFaixa(DescontoInss proximaFaixa) {
        super(proximaFaixa);
    }

    public BigDecimal calcularInss(Remuneracao remuneracao) {


            return remuneracao.totalRemuneracao().multiply(new BigDecimal(String.valueOf(percentual4)));

    }

    @Override
    public boolean deveAplicar(Remuneracao remuneracao) {
        if(remuneracao.totalRemuneracao().compareTo(faixa4) <= 0){
            return true;
        }
        return false;
    }
}
