package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class DescontoInssSegundaFaixa extends DescontoInss {

    /*
    0 : se o valor deste BigDecimal for igual ao do objeto BigDecimal passado como parâmetro.
    1 : se o valor deste BigDecimal for maior que o do objeto BigDecimal passado como parâmetro.
    -1 : se o valor deste BigDecimal for menor que o do objeto BigDecimal passado como parâmetro.
    */


    private BigDecimal faixa2 = new BigDecimal("2427.35");
    private BigDecimal percentual2 = new BigDecimal("0.09");

    public DescontoInssSegundaFaixa(DescontoInss proximaFaixa) {
        super(proximaFaixa);
    }

    public BigDecimal calcularInss(Remuneracao remuneracao) {


            return remuneracao.totalRemuneracao().multiply(new BigDecimal(String.valueOf(percentual2)));


    }

    @Override
    public boolean deveAplicar(Remuneracao remuneracao) {
       if (remuneracao.totalRemuneracao().compareTo(faixa2) <= 0){
           return true;
       }
       return false;
    }
}
