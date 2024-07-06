package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class CalcularInss {



    public BigDecimal calcularDescontoInss(Remuneracao remuneracao){
        DescontoInss desconto = new DescontoInssPrimeiraFaixa(new DescontoInssSegundaFaixa(new DescontoInssTerceiraFaixa(new DescontoInssQuartaFaixa(new TetoFaixa()))));
        return   desconto.calcularInss(remuneracao);
    }
}
