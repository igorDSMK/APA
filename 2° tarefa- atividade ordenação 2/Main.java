package apa;

public class Main {
    public static void main(String[] args) {
        int[] vet = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet1 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet2 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet3 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        
        MergeSort s1 = new MergeSort(vet1);
        s1.sort(0, s1.vet.length - 1);
        QuickSort s2 = new QuickSort(vet2);
        s2.sort(0, s2.vet.length - 1);
        HeapSort s3 = new HeapSort(vet3);
        s3.sort();
        
        int x = 0;        
        System.out.println("MergeSort:\nVetor desordenado:");
        while(x < 30){
            System.out.printf(vet[x] + " ");           
            x++;
        }
        x = 0;
        System.out.println("\nVetor ordenado:");
        while(x < 30){
            System.out.printf(vet1[x] + " ");           
            x++;
        }        
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("QuickSort:\nVetor desordenado:");               
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
        System.out.println("HeapSort:\nVetor desordenado:");               
        x = 0;
        while(x < 30){
            System.out.printf(vet[x] + " ");           
            x++;
        }
        x = 0;
        System.out.println("\nVetor ordenado:");
        while(x < 30){
            System.out.printf(vet3[x] + " ");           
            x++;
        }        
        System.out.println("");
    }   
}
