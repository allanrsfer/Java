package br.com;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Allan Rieri");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(javaColecoes.getAulas());
        System.out.println(javaColecoes.getTempoTotal());

    }
}
