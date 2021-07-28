package br.edu.ifs.ED.lista;

public class No<T> {
    public T dado;
    public No prox;
    //utilizado na Lista Encadeada Ordenada para saber o elemento/posição anterior.
    public No anterior;

    //Construtor

    public No (T dado) {
        this.dado = dado;
        this.prox = null;
    }


    public T getDado (){
        return dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
