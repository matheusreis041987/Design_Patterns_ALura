package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public abstract class DescontoInss {

    protected DescontoInss proximaFaixa;

    public DescontoInss(DescontoInss proximaFaixa) {
        this.proximaFaixa = proximaFaixa;
    }

    public abstract BigDecimal calcularInss (Remuneracao remuneracao);

    public BigDecimal calcular (Remuneracao remuneracao){
        if (deveAplicar(remuneracao)){
            return calcularInss(remuneracao);
        }
        return proximaFaixa.calcular(remuneracao);
    }

    public abstract boolean deveAplicar(Remuneracao remuneracao);

}
