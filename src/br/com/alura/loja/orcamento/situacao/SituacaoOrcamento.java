package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public void aprovar (Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void reprovar (Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser reaprovado!");
    }

    public void finalizado (Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser reaprovado!");
    }

}
