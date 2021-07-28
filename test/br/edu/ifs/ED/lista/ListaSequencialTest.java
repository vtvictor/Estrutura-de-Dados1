package br.edu.ifs.ED.lista;

import org.junit.jupiter.api.BeforeEach;

public class ListaSequencialTest extends ListaTest {
    @BeforeEach
    void setUp() {
        lista = new ListaSequencial<Integer>(Integer.class);
    }

}
