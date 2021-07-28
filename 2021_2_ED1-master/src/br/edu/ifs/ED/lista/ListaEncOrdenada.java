package br.edu.ifs.ED.lista;
/*
    Na Lista Encadeada Ordenada eu utilizei o código da Lista Encadeada e fiz as alterações necessárias para
    a Ordenada.
 */
public class ListaEncOrdenada <T extends Comparable<T>> extends ListaEnc<T>{

    // Atributos

    private No inicio;
    private No fim;
    int capacidade;
    int qtdLista;

    // Construtor

    public ListaEncOrdenada(){
        this.inicio=null;
        this.fim=null;
        this.qtdLista=0;
    }

    @Override
    public void incluir(T elemento) throws Exception {
        if(qtdLista>=capacidade){
            throw new Exception("A lista está cheia!");
        }
        if  (qtdLista==0){
            incluirInicio(elemento);
        }else{
            No novo = new No (elemento);
            fim.setProx(novo);
            novo.setAnterior(fim);
            fim=novo;
            qtdLista++;
        }

        throw new Exception("Não implementado");
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        if (qtdLista>capacidade){
            throw new Exception("Não implementado");
        }
        No novo = new No (elemento);
        if(qtdLista ==0){
            inicio = novo;
            fim = novo;
            qtdLista++;
        } else{
            inicio.setAnterior(novo);
            novo.setProx(inicio);
            inicio=novo;
            qtdLista++;
        }
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        if (qtdLista>=capacidade || posicao<0 || posicao>=capacidade) {
            throw new Exception("Não implementado");
        }
        if(posicao==0){
            incluirInicio(elemento);
        }else {
            No novoElemento = new No(elemento);
            No auxiliar = inicio;

            for (int i = 0; i < posicao-1; i++) { auxiliar.getProx();}
            novoElemento.setProx(auxiliar.getProx());
            auxiliar.setProx(novoElemento);

            No auxiliarAnterior = auxiliar.getAnterior();
            auxiliarAnterior.setProx(novoElemento);
            novoElemento.setAnterior(auxiliarAnterior);
            novoElemento.setProx(auxiliar);
            auxiliar.setAnterior(novoElemento);
            qtdLista++;
        }
    }

    @Override
    public T get(int posicao) throws Exception {
        if (posicao>=capacidade || posicao < 0) {
            throw new Exception("Posição solicitada não existe na lista");
        }
        No auxiliar = inicio;

        for (int i = 0; i<posicao; i++){

            //Foi necessário utilizar o (T) pois estava dando erro e com isso foi necessário o cast.
            return (T) auxiliar.getDado();
        }
        return null;
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        throw new Exception("Elemento não localizado");
    }

    @Override
    public void remover(int posicao) throws Exception {
        if (posicao<0 || posicao>=capacidade || inicio==null || qtdLista == 0) {
            throw new Exception("Não implementado");
        }
    }

    @Override
    public void limpar() {
        this.inicio = null;
        this.fim = null;
        setQtdLista(0);
    }

    @Override
    public int getTamanho() {
        No novo = this.inicio;
        int auxiliar = 0;

        return 0;
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
}
