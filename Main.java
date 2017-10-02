package apa;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] vet = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet1 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet2 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};                       
                
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
