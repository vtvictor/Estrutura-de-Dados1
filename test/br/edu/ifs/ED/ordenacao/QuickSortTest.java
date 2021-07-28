package br.edu.ifs.ED.ordenacao;

import br.edu.ifs.ED.pilha.PilhaInteiro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    IOrdenacao ordenacao;
    @BeforeEach
    void setUp() {
        ordenacao = new QuickSort();
    }
    @Test
    void ordenarEntradaCrescente() {
        int[] entrada = new int[]{3, 4, 1, 2, 6, 5, 8, 9, 7, 10};
        int[] saida = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ordenacao.ordenar(entrada);
        assertArrayEquals(saida, entrada);
    }
    @Test
    void ordenarEntradaAleatorio() {
        int[] entrada = new int[]{3,27,12,36,63,94,89,78,42,50};
        int[] saida   = new int[]{3,12,27,36,42,50,63,78,89,94};
        ordenacao.ordenar(entrada);
        assertArrayEquals(saida, entrada);
    }
    @Test
    void ordenarEntradaDecrescente() {
        int[] entrada = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] saida = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ordenacao.ordenar(entrada);
        assertArrayEquals(saida, entrada);

    }
}