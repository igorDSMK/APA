package apa;

public class Mochila {
    int[] pesos;
    int[] valores;
    int capacidade;
    int[][] itens;
    
    public Mochila(int[] pesos, int[]valores, int capacidade, int qnt){
        this.pesos = pesos;
        this.valores = valores;
        this.capacidade = capacidade;
        itens = new int[this.pesos.length + 1][capacidade + 1];
    }
    
    public int maximo(int a, int b){
        if(a > b)
            return a;
        else 
            return b;
    }    
    
    public void printMochila(int i, int w){
        System.out.println("Valor: " + itens[this.pesos.length][capacidade]);
        System.out.printf("itens escolhidas : ");    
        while(itens[i][w] != 0){
            if(itens[i][w] == itens[i-1][w])
                    i--;	
            else{
                    System.out.printf(i + "  ");
                    i--;
                    w = w - pesos[i];                    
            }	
       }
    }
    
    public void eMochila(){
        int i, w = 0;
        for (i = 0; i <= this.pesos.length; i++) {
            for (w = 0; w <= capacidade; w++){
                if (i==0 || w==0)
                    itens[i][w] = 0;
                else if (pesos[i-1] <= w)                    
                    itens[i][w] = maximo(valores[i-1] + itens[i-1][w-pesos[i-1]],  itens[i-1][w]);
                else
                    itens[i][w] = itens[i-1][w];                
            }
        }
        printMochila(i - 1,w - 1);
    }
}
