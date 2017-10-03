package apa;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {      
        int[] result;
        int V;
        int [][]ar;
        
        Scanner scanner = new Scanner(new File("caminho do .txt"));        
        V = scanner.nextInt();
        
        ar = new int[V][V];      
        
        for(int n = 0; n < V; n++){
            int y = V - n - 1;
            for(int m = 0; m < y; m++){
                ar[n][m] = scanner.nextInt();            
            }
        }                
        
        PRIM prim = new PRIM(V, ar);
        //Dijkstra dji = new Dijkstra(V, ar);    
        
        long tempoInicial = System.currentTimeMillis();        
        
        //dji.dijkstra();
        prim.primMST(); 
        
        long Tempopassado = System.currentTimeMillis() - tempoInicial;
        System.out.println("\ntempo de ordenação: " + Tempopassado + " milissegundos");                            
    }          
}
