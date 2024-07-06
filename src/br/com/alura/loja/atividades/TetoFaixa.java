package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class TetoFaixa extends DescontoInss {

    /*
    0 : se o valor deste BigDecimal for igual ao do objeto BigDecimal passado como parâmetro.
    1 : se o valor deste BigDecimal for maior que o do objeto BigDecimal passado como parâmetro.
    -1 : se o valor deste BigDecimal for menor que o do objeto BigDecimal passado como parâmetro.
    */


    private BigDecimal valorfaixa5 = new BigDecimal("7087.22");
    private BigDecimal percentual5 = new BigDecimal("0.14");

    public TetoFaixa() {
        super(null);
    }

    public BigDecimal calcularInss(Remuneracao remuneracao) {


            return valorfaixa5.multiply(new BigDecimal(String.valueOf(percentual5)));

    }

    @Override
    public boolean deveAplicar(Remuneracao remuneracao) {
        return true;
    }
}
