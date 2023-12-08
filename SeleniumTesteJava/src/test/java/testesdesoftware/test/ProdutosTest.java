package testesdesoftware.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.ElementNotInteractableException;

import testesdesoftware.pageObject.ProdutosPO;

public class ProdutosTest extends BaseProdutosTest{

    private static ProdutosPO produtosPage;
    //abre navegador
	@BeforeClass
	public static void prepararTestes() {
		produtosPage = new ProdutosPO(driver);
	}
    @Test
    public void abrirModalDeCadastroDeProdutos (){
        produtosPage.pressionarBotaoCriar();
        assertEquals(produtosPage.modalCadastro.getAttribute("class"), "modal show");
    }

    @Test
    public void fecharModalDeCadastroDeProdutos (){
        produtosPage.pressionarBotaoCriar();
        produtosPage.pressionarBotaofechar();


        try {
            produtosPage.pressionarBotaofechar();
            assert(false);
        } catch (ElementNotInteractableException e) {
            assert(true);
        }
    }

    @Test
    public void voltarParaTelaLogin (){
        produtosPage.pressionarBotaoVoltar();
        
        try {
            produtosPage.pressionarBotaoCriar();
            assert(false);
        } catch (ElementNotInteractableException e) {
            assert(true);
        }
    }

}
