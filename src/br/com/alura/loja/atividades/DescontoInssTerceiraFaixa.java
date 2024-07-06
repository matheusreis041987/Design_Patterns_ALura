package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class DescontoInssTerceiraFaixa extends DescontoInss {

    /*
    0 : se o valor deste BigDecimal for igual ao do objeto BigDecimal passado como parâmetro.
    1 : se o valor deste BigDecimal for maior que o do objeto BigDecimal passado como parâmetro.
    -1 : se o valor deste BigDecimal for menor que o do objeto BigDecimal passado como parâmetro.
    */


    private BigDecimal faixa3 = new BigDecimal("3641.03");
    private BigDecimal percentual3 = new BigDecimal("0.12");

    public DescontoInssTerceiraFaixa(DescontoInss proximaFaixa) {
        super(proximaFaixa);
    }

    public BigDecimal calcularInss(Remuneracao remuneracao) {


            return remuneracao.totalRemuneracao().multiply(new BigDecimal(String.valueOf(percentual3)));

    }

    @Override
    public boolean deveAplicar(Remuneracao remuneracao) {
        if(remuneracao.totalRemuneracao().compareTo(faixa3) <= 0){
            return true;
        }
        return false;
    }
}
