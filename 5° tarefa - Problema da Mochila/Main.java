package apa;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {      
        int qnt;
        int[] pesos;
        int[] valores;
        
        Scanner scanner = new Scanner(new File("C:\\Users\\David\\Desktop\\teste\\mochila02.txt.txt"));        
        qnt = scanner.nextInt();
        
        pesos = new int[qnt];
        valores = new int[qnt];
        int capacidade = scanner.nextInt();
        
        for(int n = 0; n < qnt; n++){
            pesos[n] = scanner.nextInt();
            valores[n] = scanner.nextInt();
        }                                
        
        Mochila moc = new Mochila(pesos, valores, capacidade, qnt);  
        
        moc.eMochila();                      
    }          
}
