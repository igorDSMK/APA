package apa;

public class PRIM {    
    int ar[][];
    int tam;
    int c;
    
    public PRIM(int tam, int ar[][]){
        this.ar = ar;
        this.tam = tam;
        c = tam;
    }

    public void MinHeapIFY(int vet[], int cord){
        int temp;
        int l = (cord*2) + 1;
        int r = (cord*2) + 2;       
        int menor = cord;
        if(l < c  && vet[l] < vet[cord])
            menor = l;
        if(r < c  && vet[r] < vet[menor])
            menor = r;
        if(menor != cord){
            temp = vet[cord];
            vet[cord] = vet[menor];
            vet[menor] = temp;
            MinHeapIFY(vet, menor);
        }
    }
        
    public void Build(int vet[]){
        for(int i = tam/2 ; i >= 0; i--)
            MinHeapIFY(vet, i);
    }
        
    public int RemoveMin(int vet[]){
        int min = vet[0];
        vet[0] = vet[c-1];
        c--;
        MinHeapIFY(vet, 0);
        return min;
    }

    void printMST(int parent[]){
        System.out.println("Edge   Weight");
        for (int i = 1; i < tam; i++)
            System.out.println(parent[i]+" - "+ i+"    "+
                               ar[i][parent[i]]);
    }

    void primMST(){
        int[] parent = new int[tam];
        int[] key = new int [tam];

        for (int i = 0; i < tam; i++){
            key[i] = Integer.MAX_VALUE;
        }

        key[0] = 0;
        parent[0] = -1;
        
        int[] Q = new int[tam];
        for(int i = 0; i < tam; i++)
            Q[i] = i;        
        
        int tt= tam; 
        int u;
        
        Build(Q);
        int[] temp = new int[tam];
        
        while(tt != 1){
            u = RemoveMin(Q);
            for(int m = 0; m < tam; m++)
                temp[m] = ar[u][m];
            for(int v = 0; v < tam; v++){                      
                if(temp[v] != 0 && ar[u][v] < key[v]){
                    parent[v] = u;
                    key[v] = ar[u][v];
                }
            }
            tt--;            
        }
        printMST(parent);
    }
}
