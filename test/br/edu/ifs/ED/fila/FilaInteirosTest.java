package br.edu.ifs.ED.fila;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.*;
public class FilaInteirosTest {

    protected FilaSequencial<Integer> fila;
    @BeforeEach
    public void setUp() {
        fila = new FilaInteiros();
    }


    @Test
    public void _0_5_incluir_UmElemento() throws FilaCheiaException, FilaVaziaException {
        assertThat(fila.getQtd()).isEqualTo(0);
        fila.incluir(1);
        assertThat(fila.getQtd()).isEqualTo(1);
        assertThat(fila.remover()).isEqualTo(1);
    }

    @Test
    public void _0_5_incluir_MaisDeUmElemento() throws FilaCheiaException, FilaVaziaException {
        for(int i = 0; i < 5; i++){
            fila.incluir(i);
        }
        assertThat(fila.getQtd()).isEqualTo(5);
        assertThat(fila.remover()).isEqualTo(0);
        int get_qtd = fila.getQtd();
        for(int i = 0; i < get_qtd; i++){
            assertThat(fila.remover()).isEqualTo(i+1);
        }
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    public void _0_5_removerElementosAposFilaCheiaExceptionTest() throws FilaCheiaException, FilaVaziaException {
        for(int i = 0; i < fila.getQtdMaxSuportada(); i++){
            fila.incluir(i);
        }
        assertThatExceptionOfType(FilaCheiaException.class).isThrownBy(() -> fila.incluir(11));
        assertThat(fila.getQtd()).isEqualTo(fila.getQtdMaxSuportada());

        int get_qtd = fila.getQtd();
        for(int i = 0; i < get_qtd; i++){
            assertThat(fila.remover()).isEqualTo(i);
        }
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    public void _0_5_lancarFilaCheiaException() throws FilaCheiaException, FilaVaziaException {
        for(int i = 0; i < fila.getQtdMaxSuportada(); i++){
            fila.incluir(i);
        }
        assertThat(fila.getQtd()).isEqualTo(fila.getQtdMaxSuportada());
        assertThatExceptionOfType(FilaCheiaException.class).isThrownBy(() -> fila.incluir(11));
    }

    @Test
    public void _0_5_incluirAposRemocaoElementosTest() throws FilaCheiaException, FilaVaziaException {
        for(int i = 0; i < 10; i++){
            fila.incluir(i);
        }
        int get_qtd = fila.getQtd();

        for(int i = 0; i < 5; i++){
            fila.remover();
        }

        assertThat(fila.getQtd()).isEqualTo(5);
        assertThat(fila.visualizarProximo()).isEqualTo(5);

        for(int i = 0; i < 5; i++){
            fila.incluir(10+i);
        }

        assertThat(fila.getQtd()).isEqualTo(10);


        assertThat(fila.visualizarProximo()).isEqualTo(5);

        get_qtd = fila.getQtd();
        for(int i = 0; i < 5; i++){
            assertThat(fila.remover()).isEqualTo(i+5);
        }

        assertThat(fila.visualizarProximo()).isEqualTo(10);
        assertThat(fila.getQtd()).isEqualTo(5);

        for(int i = 0; i < 5; i++){
            assertThat(fila.remover()).isEqualTo(10+i);
        }
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    public void _0_5_lancarFilaVaziaException() throws FilaCheiaException, FilaVaziaException {
        fila.incluir(1);
        fila.remover();
        assertThatExceptionOfType(FilaVaziaException.class).isThrownBy(() -> fila.remover());
        assertThat(fila.estaVazia()).isTrue();
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    public void _0_5_removerElementosTest() throws FilaCheiaException, FilaVaziaException {
        for(int i =0; i < 5; i++){
            fila.incluir(i);
        }
        for(int i = 0; i < 5; i++) {
            assertThat(fila.remover()).isEqualTo(i);
        }
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    public void _0_5_getQtd_FilaVaziaTest() {
        assertThat(fila.getQtd()).isEqualTo(0);
    }
    @Test
    public void _0_5_getQtd_FilaComItemTest() throws FilaCheiaException {
        fila.incluir(1);
        assertThat(fila.getQtd()).isEqualTo(1);
    }
    @Test
    public void _0_5_getQtd_FilaCheiaTest() throws FilaCheiaException {
        int x = fila.getQtdMaxSuportada();
        for (int i= 0; i< x; i++)
            fila.incluir(i);
        assertThat(fila.getQtd()).isEqualTo(x);
    }

    @Test
    public void _0_5_estaVazia_FilaVaziaTest() {
        assertThat(fila.estaVazia()).isTrue();
    }

    @Test
    public void _0_5_limpar_FilaComItensTest() throws FilaCheiaException {
        fila.incluir(1);
        fila.limpar();
        assertThat(fila.estaVazia()).isTrue();
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    public void _0_5_limpar_FilaVazia() {
        fila.limpar();
        assertThat(fila.estaVazia()).isTrue();
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    void verProxQuandoFilaVazia(){
        assertThatExceptionOfType(FilaVaziaException.class).isThrownBy(() -> fila.visualizarProximo());
    }
    @Test
    void _0_5_visualizarProximo() throws FilaCheiaException, FilaVaziaException {
        for(int i = 0; i < 5; i++){
            fila.incluir(i);
        }
        assertThat(fila.getQtd()).isEqualTo(5);
        assertThat(fila.remover()).isEqualTo(0);
        assertThat(fila.visualizarProximo()).isEqualTo(1);
    }
}