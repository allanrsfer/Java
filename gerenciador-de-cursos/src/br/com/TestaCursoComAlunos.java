package br.com;

public class TestaCursoComAlunos {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Allan Rieri");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));

        Aluno a1 = new Aluno("Allan Rieri", 112682);
        Aluno a2 = new Aluno("Jessica Beserra", 113804);
        Aluno a3 = new Aluno("Antonio Riere", 225026);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        Aluno rieri  = new Aluno("Allan Rieri", 112682);
        System.out.println("O aluno " + a1 + " está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(rieri));


        System.out.println(a1.equals(rieri));

        System.out.println(a1.hashCode() == rieri.hashCode());
    }
}
