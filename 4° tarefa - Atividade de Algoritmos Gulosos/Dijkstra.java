package apa;

public class Dijkstra {
    int ar[][];
    int tam;
    int c;
    
    public Dijkstra(int tam, int ar[][]){
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

    public void printSolution(int dist[]){
        System.out.printf("Vertex   Distance from Source\n");
        System.out.printf(0+ "     " + dist[0]);
    }
  
    public void dijkstra(){
        int[] dist = new int[tam];
        boolean[] sptSet = new boolean[tam];
        
        for (int i = 0; i < tam; i++){
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        
        int[] Q = new int[tam];
        for(int i = 0; i < tam; i++)
            Q[i] = i;        
        
        int tt= tam; 
        int u;
        
        Build(Q);
        int[] temp = new int[tam];        
        
        while(tt != 1){
            u = RemoveMin(Q);
            sptSet[u] = true;
            for(int v = 0; v < tam; v++){                      
                if(!sptSet[v] && ar[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u]+ar[u][v] < dist[v]){
                    dist[v] = dist[u] + ar[u][v];
                }
            }
            tt--;  
        }
         printSolution(dist);
    }
}
