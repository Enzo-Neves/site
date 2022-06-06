package AcessosDados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import Interfaces.IinserirDados;

public class InserirDados implements IinserirDados{

    public static void escrever(String path, String texto) {
        try {
            // O parametro é que indica se deve sobrescrever ou continua no
            // arquivo.
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter conexao = new BufferedWriter(fw);
            conexao.write(texto);
            conexao.newLine();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void menu() {
        System.out.println("Escreva na linha"); 

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da nova plantinha:");
        String nome_popular = sc.next();
        System.out.println("Digite o nome cientifico da plantinha:");
        String nome_cientifico = sc.next();
        System.out.println("Quando foi a ultima adubação obs coloque a data no formato  dd/mm/AAAA");
        String data_de_adubação = sc.next();
        System.out.println("Quantas plantas tem em estoque:");
        String estoque = sc.next();

        String BD = "Panthus\\src\\panthus.csv";
        
        String nova_planta_bd = nome_popular + ";" + nome_cientifico +";" + data_de_adubação+ ";" + estoque;
        escrever(BD, nova_planta_bd);
        sc.close();
        
    }
}