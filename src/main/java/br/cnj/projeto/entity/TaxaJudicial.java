package br.cnj.projeto.entity;

import org.springframework.stereotype.Component;

@Component
public class TaxaJudicial {
    public double adicionarTaxa(String estado){
        return (estado.equals("DF") ? 10 : 20);
    }
}
