package apa;

public class CountingSort {
    int[] A;
    int[] B;
    int[] C;
    
    public CountingSort(int[] vet){
        A = vet;     
        B = new int[A.length];
    }
    
    public void sort(){
        int maior = 0;
        int ende;
        for (int i = 0; i < A.length; i++){
            if(A[i] > maior)
                maior = A[i];
        }
        C = new int[maior + 1];
        
        for (int i = 0; i < C.length; i++)
            C[i] = 0;
               
        for (int i = 0; i < A.length; i++)           
            C[A[i]] += 1;       

        for (int i = 1; i < C.length; i++)
            C[i] += C[i-1];
        
        for (int i = A.length - 1; i >= 0; i--){          
            ende = C[A[i]] - 1; 
            B[ende] = A[i];
            C[A[i]]--;
        }
        
        for(int i = 0; i < A.length; i++){
            A[i] = B[i];
        }
    }    
}
