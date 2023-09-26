package class_0209;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidaCPFTest {

    @Test
    void testCPFValido() {
        ValidaCPF vCPF = new ValidaCPF();
        assertTrue(vCPF.isCPF("12345678909"));
    }

    @Test
    void testCPFsInvalidos() {
        ValidaCPF vCPF = new ValidaCPF();
        assertFalse(vCPF.isCPF("11111111111")); // CPF inválido
        assertFalse(vCPF.isCPF("00000000000")); // CPF inválido
    }

    @Test
    void testCPFComTamanhoIncorreto() {
        ValidaCPF vCPF = new ValidaCPF();
        assertFalse(vCPF.isCPF("12345")); // Tamanho menor que 11
        assertFalse(vCPF.isCPF("123456789012345")); // Tamanho maior que 11
    }

    @Test
    void testCPFComCaracteresNaoNumericos() {
        ValidaCPF vCPF = new ValidaCPF();
        assertFalse(vCPF.isCPF("A2345678909")); // Contém caracteres não numéricos
    }

    @Test
    void testCPFNulo() {
        ValidaCPF vCPF = new ValidaCPF();
        assertFalse(vCPF.isCPF(null)); // CPF nulo
    }
}
