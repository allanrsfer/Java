package br.com;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();

        alunos.add("Allan Rieri");
        alunos.add("Roberto Sousa");
        alunos.add("Jessica Bessera");

        boolean allanEstaMatriculado = alunos.contains("Roberto Rieri");
        alunos.remove("Roberto Sousa");
        System.out.println(allanEstaMatriculado);

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        List<String> alunosEmLista = new ArrayList<>(alunos);
    }
}
