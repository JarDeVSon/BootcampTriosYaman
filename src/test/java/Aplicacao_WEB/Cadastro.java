package Aplicacao_WEB;


import Pages.Cadastro.CadastroPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cadastro {

    static WebDriver driver;
    static CadastroPage cadastroPage;
    static Object preencherCadastro;

    @Before
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jarde\\IdeaProjects\\Bootcamp-Turma1-SegEQuarta\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://triosdecapacitacao.eadplataforma.com/cadastro/");

        cadastroPage = new CadastroPage(driver,preencherCadastro);
    }
    @Test
    public void test(){
        cadastroPage.preencherCadastro();
    }
}
