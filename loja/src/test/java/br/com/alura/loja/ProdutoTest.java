package br.com.alura.loja;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void test() {
        // Criar um objeto Produto com os valores esperados
        Produto produto = new Produto("Nome do Produto", 100.0);

        // Verificar se os valores estão corretos
        assertNotNull(produto);
        assertEquals("Nome do Produto", produto.getNome());
        assertEquals(100.0, produto.getPreco(), 0.01);
    }
}
