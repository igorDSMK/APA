package apa;

public class RadixSort {
    int vet[];
    CountingForRadix Count;
    
    public RadixSort(int[] vet){
        this.vet = vet;
        Count = new CountingForRadix(vet);
    }
    
    public void sort(){
        int maior = 0;
        for(int i = 0; i < vet.length; i++){
            if(vet[i] > maior)
                maior = vet[i];
        }
        for(int i = 1; maior/i > 0; i *=10){
            Count.sort(i);
        }
    }
}

