package br.com.alura.loja.main;

import br.com.alura.loja.imposto.CalculadoraImpostos;
import br.com.alura.loja.imposto.Icms;
import br.com.alura.loja.imposto.Iss;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    /*
    Padrão Stratege - Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação
    (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.
    é um padrão de design comportamental que permite definir uma família de algoritmos,
    colocar cada um deles em uma classe separada e tornar seus objetos intercambiáveis.
    https://refactoring.guru/design-patterns/strategy
*/
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"),6);
        CalculadoraImpostos calculadora = new CalculadoraImpostos();

        System.out.println(calculadora.calcular(orcamento, new Iss()));


    }


}
