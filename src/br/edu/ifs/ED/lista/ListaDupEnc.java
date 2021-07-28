package br.edu.ifs.ED.lista;

public class ListaDupEnc<T extends Comparable<T>> extends Lista<T>{
    @Override
    public void incluir(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public T get(int posicao) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void remover(int posicao) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public void limpar() {

    }

    @Override
    public int getTamanho() {
        return Integer.MIN_VALUE;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        throw new Exception("Não implementado");

    }

    @Override
    public boolean verificarVazio() throws Exception {
        return false;
    }
}
