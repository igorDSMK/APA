package apa;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {      
        int qnt;
        int[] pesos;
        int[] valores;
        
        Scanner scanner = new Scanner(new File("caminho do .txt"));        
        qnt = scanner.nextInt();
        
        pesos = new int[qnt];
        valores = new int[qnt];
        int capacidade = scanner.nextInt();
        
        for(int n = 0; n < qnt; n++){
            pesos[n] = scanner.nextInt();
            valores[n] = scanner.nextInt();
        }                                
        
        Mochila moc = new Mochila(pesos, valores, capacidade);
        
        //long tempoInicial = System.currentTimeMillis();        
        
        moc.eMochila();
        
        //long Tempopassado = System.currentTimeMillis() - tempoInicial;
        //System.out.println("\ntempo de ordenação: " + Tempopassado + " milissegundos");                            
    }          
}
