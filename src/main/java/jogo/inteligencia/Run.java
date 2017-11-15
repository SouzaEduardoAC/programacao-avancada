package jogo.inteligencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Run {
    private static No raiz;
    public static void main(String[] args){
        raiz = carregarDoArquivo();

        if(raiz == null) raiz = inicializarRaiz();

        do{
            tentarFazerAdivinhacaoOuAprenderAlgoQuandoNaoConseguirAdivinhar();
            salvarEmArquivo();
        }while(desejaContinuar());
    }

    private static No inicializarRaiz() {
    }

    private static boolean desejaContinuar() {
    }

    private static No carregarDoArquivo() {
        try{
            File file = new File("conhecimento.data");
            if(!file.exists()) return null;
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            No raizCarregada = (No)ois.readObject();
            ois.close();

            return raizCarregada;
        }catch (Exception e){
            mostrarFalha(e);
            return null;
        }
    }

    private static void mostrarFalha(Exception e) {
    }

    private static void tentarFazerAdivinhacaoOuAprenderAlgoQuandoNaoConseguirAdivinhar(){}

    private static void salvarEmArquivo(){}
    
}
