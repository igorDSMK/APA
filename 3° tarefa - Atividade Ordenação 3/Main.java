package apa;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] vet = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet1 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet2 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
                
        int x = 0;        
        System.out.println("Counting Sort:\nVetor desordenado:");
        while(x < vet1.length){
            System.out.printf(vet1[x] + " ");           
            x++;
        }      
        
        CountingSort s1 = new CountingSort(vet1);
        s1.sort();

        x = 0;
        System.out.println("\nVetor ordenado:");
        while(x < vet1.length){
            System.out.printf(vet1[x] + " ");           
            x++;
        }        
        
        RadixSort s2 = new RadixSort(vet2);
        s2.sort();
        
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("Radix Sort:\nVetor desordenado:");               
        x = 0;
        while(x < 30){
            System.out.printf(vet[x] + " ");           
            x++;
        }
        x = 0;
        System.out.println("\nVetor ordenado:");
        while(x < 30){
            System.out.printf(vet2[x] + " ");           
            x++;
        }                       
        System.out.println("\n----------------------------------------------------------------");
         
        Scanner scanner = new Scanner(new File("couting.txt"));
        int [] vet3 = new int [101];
        int i = 0;
        while(scanner.hasNextInt()){
           vet3[i++] = scanner.nextInt();
        }
                
        CountingSort s3 = new CountingSort(vet3);
        RadixSort s4 = new RadixSort(vet3);
        long tempoInicial = System.currentTimeMillis();        
        s3.sort();
        //s4.sort();
        long Tempopassado = System.currentTimeMillis() - tempoInicial;
        System.out.println("tempo de ordenação: " + Tempopassado + " milissegundos");
        x = 0;
        System.out.println("\nVetor ordenado:");
        while(x < vet3.length){
            System.out.printf(vet3[x] + " ");           
            x++;
        }  
    }    
}
