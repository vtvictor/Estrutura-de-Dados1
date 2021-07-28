package br.edu.ifs.ED.pilha;

public class PilhaSequencial<T> implements IPilha<T>{

    public PilhaSequencial(Class<T> dataType){
        this.max = 10;
        this.dados = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);
    }
    T[] dados;
    int max;
    @Override
    public void empilhar(T valor) throws PilhaCheiaException {

    }

    @Override
    public T desempilhar() throws PilhaVaziaException {
        return null;
    }

    @Override
    public T getTopo() throws PilhaVaziaException{
        return null;

    }

    @Override
    public int getQtd() {
        return -99999;
    }

    @Override
    public boolean estahVazia() {
        return false;
    }
}
