package br.cnj.projeto.entity;

import org.springframework.stereotype.Component;

@Component
public class CustoJudicial {
    public double adicionarCusto(int ano){
        return (ano >= 2024 ? 20 : 10);
    }
}
