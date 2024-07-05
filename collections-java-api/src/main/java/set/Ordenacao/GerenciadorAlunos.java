package main.java.set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome,long matricula,double nota){
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        if (!alunosSet.isEmpty()){
            for (Aluno a : alunosSet){
                if (a.getMatricula() == matricula){
                    alunosSet.remove(a);
                    break;
                }
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparadorNome());
        alunosPorNome.addAll(alunosSet);
        return alunosPorNome;
    }
    
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparadorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }
}
