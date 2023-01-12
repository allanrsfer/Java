package br.com.alura.java.io.teste;


import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        //fluxo de Entrada com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//        PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter pw = new PrintWriter("lorem2.txt");

        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        pw.println();
        pw.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");

        pw.close();

    }
}
