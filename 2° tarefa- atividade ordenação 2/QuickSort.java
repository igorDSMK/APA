package apa;

public class QuickSort {
    int[] vet;
 
    public QuickSort(int[] vet){
        this.vet = vet;      
    }
 
    public void sort(int low, int high) {         
        int i = low;
        int j = high;
        int pivot = vet[low+(high-low)/2];
        while (i <= j) {
            while (vet[i] < pivot) {
                i++;
            }
            while (vet[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            sort(low, j);
        if (i < high)
            sort(i, high);
    }
}
