package apa;

public class CountingForRadix {
    int[] A;
    int[] B;
    int[] C;
    
    public CountingForRadix(int[] vet){
        A = vet;     
        B = new int[A.length];
    }
    
    public void sort(int n){
        int ende;        
        C = new int[10];
        
        for (int i = 0; i < C.length; i++)
            C[i] = 0;
               
        for (int i = 0; i < A.length; i++)           
            C[(A[i]/n)%10] += 1;       

        for (int i = 1; i < C.length; i++)
            C[i] += C[i-1];
        
        for (int i = A.length - 1; i >= 0; i--){          
            ende = C[(A[i]/n)%10] - 1; 
            B[ende] = A[i];
            C[(A[i]/n)%10]--;
        }
        
        for(int i = 0; i < A.length; i++){
            A[i] = B[i];
        }
    }    
}
