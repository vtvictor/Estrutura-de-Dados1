package br.edu.ifs.ED.lista;

import java.lang.reflect.InvocationTargetException;

public class ListaSequencial<T extends Comparable<T>> extends Lista<T>{


    T[] lista;
    int qtdMax;
    int finalLista;
    public ListaSequencial(Class<T> dataType){
        super();
        qtdMax = 10;
        this.lista = (T[]) java.lang.reflect.Array.newInstance(dataType, qtdMax);
        finalLista = -1;
    }

    @Override
    public void limpar() {
        finalLista = -1;
    }
    @Override
    public T get(int posicao) throws Exception {
        throw new Exception("Método não implementado.");
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        throw new Exception("Método não implementado.");
    }

    @Override
    public void incluir(T elemento) throws Exception {
        throw new Exception("Método não implementado!!!!!");
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        throw new Exception("Método não implementado.");
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        throw new Exception("Método não implementado.");
    }

    @Override
    public void remover(int posicao) throws Exception {
        throw new Exception("Método não implementado.");
    }
    @Override
    public int getTamanho() {
        return -9999;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        throw new Exception("Método não implementado.");
    }

    @Override
    public boolean verificarVazio() throws Exception {
        return false;
    }
}
