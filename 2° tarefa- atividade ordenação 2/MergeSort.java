package apa;

public class MergeSort {
    int[] vet;
    int[] helper;
    
    public MergeSort(int[] vet){
        this.vet = vet;
        helper = new int[vet.length];        
    }

    public void sort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            sort(low, middle);
            sort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    public void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = vet[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                vet[k] = helper[i];
                i++;
            } else {
                vet[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            vet[k] = helper[i];
            k++;
            i++;
        }
        while (j <= high) {
            vet[k] = helper[j];
            k++;
            j++;
        }
    }
}