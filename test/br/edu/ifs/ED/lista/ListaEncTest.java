package br.edu.ifs.ED.lista;

import org.junit.jupiter.api.BeforeEach;

class ListaEncTest extends ListaTest {
    @BeforeEach
    public void setUp() { lista = new ListaEnc<Integer>();
    }
}