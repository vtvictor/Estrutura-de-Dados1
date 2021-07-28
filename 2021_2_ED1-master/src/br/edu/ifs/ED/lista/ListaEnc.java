package br.edu.ifs.ED.lista;

public class ListaEnc<T extends Comparable<T>> extends Lista<T> {

    // Atributos

    public No inicio;
    public No fim;
    int capacidade;
    int qtdLista;

    // Construtor

    public ListaEnc(){
        this.inicio=null;
        this.fim=null;
        qtdLista=0;
    }

    public int getQtdLista() {
        return qtdLista;
    }

    public void setQtdLista(int qtdLista) {

        this.qtdLista = qtdLista;
    }
    // Metodos

    @Override
    public void incluir(T elemento) throws Exception {
        No novo = new No (elemento);
        if(verificarVazio()){
            this.inicio = novo;
        }else{
            this.fim.setProx(novo);
        }
        this.fim=novo;
        this.qtdLista++;
        /*
        if(qtdLista>=capacidade){
            throw new Exception("A lista está cheia!");
        }
        if  (qtdLista==0){
            incluirInicio(elemento);
        }else{
            fim.setProx(novo);
            fim=novo;
            qtdLista++;
        }
        */
        //throw new Exception("Não implementado");
    }


    public T get(int posicao)  throws Exception {
        if (posicao>=getQtdLista() || posicao < 0) {
            throw new Exception("Posição solicitada não existe na lista");
        }
        No auxiliar = inicio;

        for (int i = 0; i<posicao; i++){

            //Foi necessário utilizar o (T) pois estava dando erro e com isso foi necessário o cast.
            return (T) auxiliar.getDado();
        }
        return null;
    }

    /*No getPosElemento foi utilizado uso do return cont, no qual, o mesmo serve para que o cont
    vai ser responsavel por obter a posição que vai ta o elemento, por isso sempre inicializa-lo
    fora do Do While e sempre recebendo 0. No qual, vai sempre percorrer todas as posições até ser null.
    */
    public int getPosElemento(T elemento)  throws Exception {
        No auxiliar = inicio;
        int cont = 0;

        do{

            if (auxiliar.getDado().equals(elemento)) {
                return cont;
            }
            auxiliar = auxiliar.getProx();
            cont++;

        } while (auxiliar != null);

        throw new Exception("Elemento não localizado");
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        No novo = new No (elemento);
        if(qtdLista ==0){
            inicio = novo;
            fim = novo;
            qtdLista++;
        } else{
            novo.setProx(inicio);
            inicio = novo;
            qtdLista++;
        }
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        if (qtdLista>=capacidade || posicao<0 || posicao>=capacidade) {
            throw new Exception("Não implementado");
        }
        No novoElemento = new No (elemento);
        No auxiliar = inicio;

        /*for (int i=0;i<posicao;i++){
            auxiliar = auxiliar.getProx();
        }*/
        novoElemento.setProx(auxiliar.getProx());
        auxiliar.setProx(novoElemento);
        qtdLista++;

    }

    @Override
    public void remover(int posicao) throws Exception {
        No auxiliar = null;
        No auxAtual = inicio;
        for (int i = 0; i < getTamanho(); i++) {
            if (qtdLista == 1) {
                inicio = null;
                fim = null;
            } else if (auxAtual == inicio) {
                inicio = auxAtual.getProx();
                auxAtual.setProx(null);
            } else if (auxAtual == fim) {
                fim = auxAtual;
                auxAtual.setProx(null);
            } else {
                auxAtual.setProx(auxAtual.getProx());
                auxAtual = null;
            }
            qtdLista--;
            break;
        }
        auxiliar = auxAtual;
        auxAtual = auxAtual.getProx();
    }

    @Override
    public int getTamanho() {
        return this.qtdLista;
        //return Integer.MIN_VALUE;
    }

    public void limpar() {
        this.inicio = null;
        this.fim = null;
        setQtdLista(0);
    }


    @Override
    public boolean contem(T elemento) throws Exception {
        No aux = inicio;
        /*if(this.qtdLista==0){
            throw new Exception("Lista vazia");
        }*/
        while (aux != null) {
            if (aux.getDado().equals(elemento))
                return true;
            aux = aux.getProx();
        }
        return false;
    }

    @Override
    public boolean verificarVazio() throws Exception {
        return qtdLista==0;
    }
}
