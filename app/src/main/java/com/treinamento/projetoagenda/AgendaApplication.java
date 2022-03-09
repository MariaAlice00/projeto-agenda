package com.treinamento.projetoagenda;

import android.app.Application;

import com.treinamento.projetoagenda.dao.AlunoDAO;
import com.treinamento.projetoagenda.model.Aluno;

public class AgendaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();

    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Ana", "12344321", "ana@email.com"));
        dao.salva(new Aluno("Joao", "34566543", "joao@email.com"));
    }
}
