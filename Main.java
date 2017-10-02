package apa;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] vet = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet1 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet2 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};                       
                
        Scanner scanner = new Scanner(new File("couting.txt"));
        int V;        
        int i = 0;
        V = scanner.nextInt();
        int [][] vet3 = new int[V-1][V-1];
        for(int n = 0; n < (V-1); n++){
            for(int m = 0; m < (V-1); m++){
                vet3[n][m] = 0;
            }
        }
        
        for(int n = 0; n < (V-1); n++){
            for(int m = 0; m < (V-1); m++){
                if(scanner.hasNextInt()){
                    vet3[n][m] = scanner.nextInt();
                } else 
                    break;
            }
        }                
        
        HeapMin s2 = new HeapMin(vet);
        s2.Build();
        s2.RemoveMin();
        
        int x = 0;            
        while(x < s2.tam){
            System.out.printf(vet[x] + " ");           
            x++;
        }
        
        /*double inf = Double.POSITIVE_INFINITY;
        System.out.println(inf + 5);
        System.out.println(inf - inf); // same as Double.NaN
        System.out.println(inf * -1);*/
    }  
}
