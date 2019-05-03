public class Exercicios{
 
    /*
(Adaptado do URI - Problema 1244) Crie um programa para ordenar um conjunto de strings pelo
 seu tamanho.  Seu programa deve receber um vetor contendo as strings e retornar este mesmo 
 vetor ordenado pelo tamanho das palavras.  Se o tamanho das strings for igual, 
 deve-se manter a ordem original do conjunto.  Sua solucao deve ter complexidade O(n*log(n))
    */

    public void arrumaString(String[] vetor, int inicio, int fim){

        if(inicio < fim){

            int meio = (inicio+fim)/2;
            arrumaString(vetor, inicio, meio);
            arrumaString(vetor, meio+1, fim);
            ordena(vetor, inicio, meio, fim);
        }

    }

    public void ordena(String[] vetor, int inicio, int meio, int fim){

        String[] aux = new String[vetor.length];
        //Copia vetor --> aux
        for(int i = 0; i < vetor.length; i++){
            aux[i] = vetor[i];
        }

        int i = inicio;
        int posMeio = meio+1;
        int k = inicio;
        
        while(i <= posMeio && posMeio <= fim){
            if(aux[i] < aux[posMeio){
                
            }
        }


    }
    
}