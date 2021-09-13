public class QuicksortDecrescente {
    public void Quicksort(String vetor[], int esquerda, int direita){
        int p;

        if(esquerda < direita){
            p = Separar(vetor, esquerda, direita);
            Quicksort(vetor, esquerda, p - 1);
            Quicksort(vetor, p + 1, direita);
        }
    }

    public static int Separar(String[] vetor, int esquerda, int direita){
        int i = esquerda + 1, j = direita;
        String c = vetor[esquerda], troca;

        while(i <= j){
            if(vetor[i].length() >= c.length())
                i++;
            else if(c.length() > vetor[j].length())
                j--;
            else{
                troca = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = troca;
            }
        }

        i = j + 1;
        vetor[esquerda] = vetor[j];
        vetor[j] = c;
        return j;
    }
}
