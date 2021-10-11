import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeiteSojaTest {
    @Test
    void deveRetornaLeiteAprovado(){
        LeiteSoja leite = new LeiteSoja();
        leite.setPesoLeite(1.05f);
        leite.setPesoCaixaDoLeite(24.0f);
        assertEquals("Ok", leite.verificaLeite());
    }
    @Test
    void deveRetornaLeiteReprovado(){
        LeiteSoja leite = new LeiteSoja();
        leite.setPesoLeite(0.89f);
        leite.setPesoCaixaDoLeite(20.0f);
        assertEquals("Retorna produção", leite.verificaLeite());
    }
    @Test
    void deveRetornaDadosDoLeite(){
        LeiteSoja leite = new LeiteSoja();
        leite.setPesoLeite(0.89f);
        leite.setPesoCaixaDoLeite(20.0f);
        leite.setMarcaLeite("Itambé");
        leite.setCodigoDeBarra(10902);
        assertEquals("Leite de Soja{ Codigo de Barra = 10902, Marca do Leite = 'Itambé', estado = Retorna produção}", leite.getInfoCaixa());
    }

}