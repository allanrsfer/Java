package br.com;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        aulas.forEach(aula -> {
            System.out.println("percorrendo: ");
            System.out.println("Aula " + aula);
        });

        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("The first class is: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++){
            System.out.println("Aula: " + aulas.get(i));
        }

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
