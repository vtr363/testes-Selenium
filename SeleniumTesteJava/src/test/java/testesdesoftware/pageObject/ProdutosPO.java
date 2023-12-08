package testesdesoftware.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutosPO extends BasePO{

    @FindBy(id = "codigo")
	public WebElement inputCodigo;
    @FindBy(id = "nome")
	public WebElement inputNome;
    @FindBy(id = "quantidade")
	public WebElement inputQuantidade;
    @FindBy(id = "valor")
	public WebElement inputValor;
    @FindBy(id = "btn-salvar")
	public WebElement buttonSalvar;
    @FindBy(id = "btn-adicionar")
	public WebElement buttonCriar;
    @FindBy(id = "cadastro-produto")
	public WebElement modalCadastro;
    @FindBy(className = "close")
	public WebElement buttonFecharModalCadastro;
    @FindBy(className = "nav-link")
	public WebElement buttonVoltar;


    public ProdutosPO(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void pressionarBotaoCriar(){
        buttonCriar.click();
        buttonCriar.click();
    }
    public void pressionarBotaofechar(){
        buttonFecharModalCadastro.click();
    }
    public void pressionarBotaoVoltar(){
        buttonVoltar.click();
    }
}
