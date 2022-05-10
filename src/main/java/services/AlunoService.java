/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import java.util.List;
import model.Aluno;


/**
 *
 * @author Administrador
 */
public class AlunoService {

    private Aluno aluno;
    private List<Aluno> listAlunos = new ArrayList<>();

    public void populate() {

        Aluno a;

        a = new Aluno(1l, "João Victor", "João@gmail.com", java.util.UUID.randomUUID().toString());

        listAlunos.add(a);

        a = new Aluno(2l, "Pedro Paulo", "pepa1@gmail.com", java.util.UUID.randomUUID().toString());

        listAlunos.add(a);

    }

    public void add(Aluno aluno) {
        boolean exists = false;
        for (Aluno a : listAlunos) {
            if (a.getId() == aluno.getId()) {
                exists = true;
            }
            if (!exists) {
                listAlunos.add(aluno);
            }

        }
    }

    public void remove(Aluno aluno) {

        for (Aluno a : listAlunos) {
            if (a.getId() == aluno.getId()) {
                listAlunos.remove(a);
                break;
            }

        }
    }

    public List<Aluno> getAll() {
        return this.listAlunos;

    }

    public Aluno getAluno(Long id) {

        try {
            for (Aluno a : listAlunos) {
            if (a.getId() ==id) {
                return a;
            }

        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return null;
    }
}
