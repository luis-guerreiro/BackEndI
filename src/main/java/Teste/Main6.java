package Teste;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Pluto");
        cachorro1.setIdade(3);

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Scooby");
        cachorro2.setIdade(1);

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);

        //Salvamos toda a coleção de páginas em um arquivo
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);

            dos.writeObject(cachorros);

        } catch (FileNotFoundException e) {
            System.out.println("ERROR:" + e.getMessage());
        }catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }

        //Recuperamos toda a coleção com cada uma das páginas do arquivo
        List<Cachorro> cachorros2 = null;
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            cachorros2 = (ArrayList) ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR:" + e.getMessage());
        }catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        for(Cachorro cachorro : cachorros2)
            System.out.println(cachorro.getNome() + ": " + cachorro.getIdade());




    }
}
