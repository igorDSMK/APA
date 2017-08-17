package apa;

public class Selection {
    int vet[];
    
    public Selection(int vet[]){
        this.vet = vet;
    }
    
    public void Sort(){        
        int menor;
        for(int i = 0; i < vet.length-1; i++){
            menor = i;
            for(int j = i+1; j < vet.length; j++){
                if(vet[j] < vet[menor]){
                    menor = j;
                }
            }
            if(i != menor){
                int temp = vet[menor];
                vet[menor] = vet[i];
                vet[i] = temp;
            }            
        }
    }
}
