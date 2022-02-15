package com.company;


import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try{
            FileReader fr;
            fr = new FileReader("listanomes.txt");
            BufferedReader bf = new BufferedReader(fr);
            String linha = bf.readLine();
            System.out.println(linha);
            while(linha!=null){
                System.out.println(linha);
                linha = bf.readLine();
            }

        }catch (Exception e){
            System.out.println("Erro "+e.getMessage());
        }

    }
}
