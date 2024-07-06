package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento); // possui a lógica com as regras de negócio e sua aplicação.

    public abstract boolean deveAplicar (Orcamento orcamento); // deve aplicar ficar nas classes concretas, Ele verifica qual classe aplicará o desconto, de acordo com um lógica boleana

    public BigDecimal calcular(Orcamento orcamento){ // método concreto que, se deveAplicar for verdadeiro, ele irá chamar a classe concreta de efetuar cálculo, que tem a regra de negócio
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);

    }
}


/*
1º o sistema verifica na classe concreta deveAplicar se o desconto deve ser aplicado na sua classe; Se for verdadeiro, entra na classe concreta calcular para efetuar o cálculo
se for falsa, entra no promixo.calcular, que chama o p´rocimo método concreto;
2º sendo verdadeiro o resultado de deveAplicar, é chamada a classe calcular para retornar o método concreto efetuarCalculo, que possui a regra de cálculo
3º é chamado o método concreto efetuarCalculo


 */