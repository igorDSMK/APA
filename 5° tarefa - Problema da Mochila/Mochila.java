package apa;

public class Mochila {
    int[] pesos;
    int[] valores;
    int capacidade;
    int valor = 0;
    int[] itens;    
    boolean[] colocados;
    
    public Mochila(int[] pesos, int[]valores, int capacidade){
        this.pesos = pesos;
        this.valores = valores;
        this.capacidade = capacidade;
        itens = new int[this.pesos.length];
        colocados = new boolean[this.pesos.length];
        for(int i = 0; i < this.pesos.length; i++){
            colocados[i] = false;
        }
    }
    
    public int maximo(float a, float b, int i, int j){
        if(a > b)
            return i;
        else 
            return j;
    }    
    
    public void printMochila(int qnt){
        System.out.println("valor: " + valor);
        System.out.printf("Fora escolhidos os itens:");
        for(int i = 0; i < qnt; i++){
            System.out.printf(" " + itens[i]);
        }
    }
    
    public void eMochila(){
        int qnt = 0;
        int pesoTemp = 0;
        int melhor = -1;
        float razaou, razaod;
        boolean continua = true;
        while(continua){
            melhor = -1;
            for (int i = 0; i < pesos.length; i++){                
                if(pesos[i] <= (capacidade - pesoTemp) && !colocados[i]){
                    if(i != 0 && melhor != -1)
                        melhor = maximo((((float)valores[i])/pesos[i]), (((float)valores[melhor])/pesos[melhor]), i, melhor);
                    else
                        melhor = i;
                }                
            }
            if(melhor >= 0){
                    pesoTemp += pesos[melhor];
                    valor += valores[melhor];
                    colocados[melhor] = true;
                    itens[qnt] = melhor + 1;                    
                    qnt++;
                } else 
                    continua = false;
        }
        printMochila(qnt);
    }
}
