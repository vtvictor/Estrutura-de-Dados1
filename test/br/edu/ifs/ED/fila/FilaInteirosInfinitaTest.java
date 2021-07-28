package br.edu.ifs.ED.fila;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.*;
public class FilaInteirosInfinitaTest extends FilaInteirosTest {

    @BeforeEach
    @Override
    public void setUp() {
        fila = new FilaInteirosInfinita();
    }

    @Test
    void _4_0_aumentoCapacidadeTest()throws FilaCheiaException, FilaVaziaException{
        int i=0;
        int qtd = fila.getQtdMaxSuportada();
        for (int j = 0;j<qtd+5; j++) {
            fila.incluir(j);
        }
        assertThat(fila.getQtd()).isEqualTo(qtd+5);
        for (int j = 0;j<qtd+5; j++) {
            assertThat(fila.remover()).isEqualTo(j);
        }
        assertThat(fila.getQtd()).isZero();
    }

    @Test
    @Override
    public void _0_5_removerElementosAposFilaCheiaExceptionTest() throws FilaCheiaException, FilaVaziaException {    }

    @Test
    @Override
    public void _0_5_lancarFilaCheiaException() throws FilaCheiaException, FilaVaziaException {    }



}
