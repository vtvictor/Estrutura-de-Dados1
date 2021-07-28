package br.edu.ifs.ED.fila;

public class FilaSequencial<T> implements IFila<T> {
    private int max;
    private T[] dados;
    public FilaSequencial(Class<T> dataType){
        this.max = 10;
        this.dados = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);

    }
    public void incluir(T valor) throws FilaCheiaException {

    }
    public T remover() throws FilaVaziaException{
        return null;

    }
    public int getQtd() {
        return  100000;
    }

    @Override
    public int getQtdMaxSuportada() {
        return 0;
    }

    public boolean estaVazia() {
        return false;
    }
    public void limpar(){

    }

    public T visualizarProximo() throws FilaVaziaException{
        return null;
    }

}
