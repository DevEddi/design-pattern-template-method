import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeiteIntegralTest {

    @Test
    void deveRetornaLeiteAprovado(){
        LeiteIntegral leite = new LeiteIntegral();
        leite.setPesoLeite(1.03f);
        leite.setPesoCaixaDoLeite(20.0f);
        assertEquals("Ok", leite.verificaLeite());
    }
    @Test
    void deveRetornaLeiteReprovado(){
        LeiteIntegral leite = new LeiteIntegral();
        leite.setPesoLeite(0.89f);
        leite.setPesoCaixaDoLeite(20.0f);
        assertEquals("Retorna produção", leite.verificaLeite());
    }
    @Test
    void deveRetornaDadosDoLeite(){
        LeiteIntegral leite = new LeiteIntegral();
        leite.setPesoLeite(0.89f);
        leite.setPesoCaixaDoLeite(20.0f);
        leite.setMarcaLeite("Itambé");
        leite.setCodigoDeBarra(010203);
        assertEquals("Leite Integral{ Codigo de Barra = 010203, Marca do Leite = 'Itambé', estado = Retorna produção}", leite.getInfoCaixa());
    }


}