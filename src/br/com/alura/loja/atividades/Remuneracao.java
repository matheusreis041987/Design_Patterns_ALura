package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class Remuneracao {

    public Remuneracao(BigDecimal salario, BigDecimal gea, BigDecimal ats) {
        this.salario = salario;
        this.gea = gea;
        this.ats = ats;
    }

    private BigDecimal salario;
    private BigDecimal gea;

    private BigDecimal ats;

    public BigDecimal getSalario() {
        return salario;
    }

    public BigDecimal getGea() {
        return gea;
    }

    public BigDecimal getAts() {
        return ats;
    }

    public BigDecimal totalRemuneracao() {
       BigDecimal remuneracao = new BigDecimal("0");
       remuneracao = remuneracao.add(salario.add(gea.add(ats)));
               return remuneracao;
    }
}
