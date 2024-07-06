package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {
    public BigDecimal calcularvalorDescontoEstra (Orcamento orcamento){
        return orcamento.getValor().multiply((new BigDecimal("0.02")));
    }


}
