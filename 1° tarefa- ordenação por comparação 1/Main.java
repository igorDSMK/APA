package apa;

public class Main {
    public static void main(String[] args) {
        int[] vet = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet1 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        int[] vet2 = {30, 20, 10, 29, 28, 27, 26, 25, 24, 23, 22, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1, 2, 3, 4, 5, 9, 8, 7, 6};
        Insertion s1 = new Insertion(vet1);
        Selection s2 = new Selection(vet2); 
        s1.Sort();
        s2.Sort();
        int x = 0;
        
        System.out.println("Insertion Sort:\nVetor desordenado:");
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
        System.out.println("Selection Sort:\nVetor desordenado:");       
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
    }   
}
