package apa;

public class Insertion {
    int vet[];
    
    public Insertion(int vet[]){
        this.vet = vet;
    }
    
    public void Sort(){
        int atual, j;
        for(int i = 1; i < vet.length; i++){
            atual = vet[i];
            j = i -1;
            while (j >= 0 && vet[j] > atual){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = atual;
        }  
    }
}
