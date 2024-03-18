package br.cnj.projeto.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cnj.projeto.entity.CasoJudicial;
import br.cnj.projeto.repository.CasoJudicialRepository;

@Service
public class CasoJudicialService {

    private final CasoJudicialRepository repository;

    @Autowired
    public CasoJudicialService(CasoJudicialRepository repository){
        this.repository = repository;
    }

    public List<CasoJudicial> getTodosOsCasos(){
        return repository.findAll();
    }

    public CasoJudicial criarCaso(CasoJudicial caso){
        return caso;
    }

    public CasoJudicial atualizarCaso(Long id, CasoJudicial caso){
        return caso;
    }

    public CasoJudicial atualizarCaso(Long id, Map atualizacoes){
        return new CasoJudicial(null, null);
    }

    public void deletarCaso(Long id){

    }
}
