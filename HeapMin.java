package apa;

public class HeapMin {
    int[] vet;
    int tam;
 
    public HeapMin(int[] vet){
        this.vet = vet;      
        tam = this.vet.length;
    }
    
    public void MinHeapIFY(int cord){
        int temp;
        int l = (cord*2) + 1;
        int r = (cord*2) + 2;       
        int menor = cord;
        if(l < tam  && vet[l] < vet[cord])
            menor = l;
        if(r < tam  && vet[r] < vet[menor])
            menor = r;
        if(menor != cord){
            temp = vet[cord];
            vet[cord] = vet[menor];
            vet[menor] = temp;
            MinHeapIFY(menor);
        }
    }
    
    public int RemoveMin(){
        int min = vet[0];
        vet[0] = vet[tam-1];
        tam--;
        MinHeapIFY(0);
        return min;
    }
    
    public void Build(){
        for(int i = tam/2 ; i >= 0; i--)
            MinHeapIFY(i);
    }
    
    public void sort(){
        int temp;
        int t = 0;
        Build();
        for(int j = vet.length; j > 1; j--){
            temp = vet[0];
            vet[0] = vet[j - 1];
            vet[j - 1] = temp;
            tam--;    
            MinHeapIFY(0);            
        }
    }
}
