package br.com.alura.loja.atividades;

import java.math.BigDecimal;

public class TesteInss {

    public static void main(String[] args) {


        Remuneracao matheus = new Remuneracao(new BigDecimal("15000.45"), new BigDecimal("1500.56"),new BigDecimal("800.62"));
        Remuneracao joao = new Remuneracao(new BigDecimal("1000.00"), new BigDecimal("112.45"),new BigDecimal("5.45"));
        Remuneracao bernardo = new Remuneracao(new BigDecimal("1400.00"), new BigDecimal("500.45"),new BigDecimal("110.45"));
        Remuneracao aurea = new Remuneracao(new BigDecimal("2800.00"), new BigDecimal("500.45"),new BigDecimal("110.45"));
        Remuneracao jose = new Remuneracao(new BigDecimal("4000.00"), new BigDecimal("500.45"),new BigDecimal("110.45"));
        CalcularInss calcularInss = new CalcularInss();
        System.out.println("**************** Desconto inss ******************************");
        System.out.println("Remuneração Matheus: R$ " + matheus.totalRemuneracao());
        System.out.println("Desconto INSS Matheus: R$ " + calcularInss.calcularDescontoInss(matheus));
        System.out.println("**************** Desconto inss ******************************");
        System.out.println("Remuneração João: R$ " + joao.totalRemuneracao());
        System.out.println("Desconto INSS João: R$ " + calcularInss.calcularDescontoInss(joao));
        System.out.println("**************** Desconto inss ******************************");
        System.out.println("Remuneração Bernardo: R$ " + bernardo.totalRemuneracao());
        System.out.println("Desconto INSS Bernardo: R$ " + calcularInss.calcularDescontoInss(bernardo));
        System.out.println("**************** Desconto inss ******************************");
        System.out.println("Remuneração Aurea: R$ " + aurea.totalRemuneracao());
        System.out.println("Desconto INSS Aurea: R$ " + calcularInss.calcularDescontoInss(aurea));
        System.out.println("**************** Desconto inss ******************************");
        System.out.println("Remuneração Jose: R$ " + jose.totalRemuneracao());
        System.out.println("Desconto INSS Jose: R$ " + calcularInss.calcularDescontoInss(jose));



    }
}
