package apa;

public class HeapSort {    
    int[] vet;
 
    public HeapSort(int[] vet){
        this.vet = vet;      
    }
    
    public void MaxHeapIFY(int cord){
        int l = cord*2;
        int r = (cord*2) + 1;       
        int maior;
        System.out.println(l);
        if(l < vet.length  && vet[l] > vet[cord])
            maior = l;
        else
            maior = cord;
        if(r < vet.length  && vet[r] > vet[maior])
            maior = r;
        if(maior != cord){
            int temp = vet[cord];
            vet[cord] = vet[maior];
            vet[maior] = temp;
            MaxHeapIFY(maior);
        }
    }
    
    public void sort(){
        for(int i = vet.length/2 ; i > 0; i--)
            MaxHeapIFY(i);
    }
}
