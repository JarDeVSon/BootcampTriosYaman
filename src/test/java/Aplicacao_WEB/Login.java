package Aplicacao_WEB;

import Pages.Cadastro.CadastroPage;
import Pages.Login.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Login {

    static WebDriver driver;
    static LoginPage loginPage;

    @Before
    public void setLoginPageOpen(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jarde\\IdeaProjects\\Bootcamp-Turma1-SegEQuarta\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://triosdecapacitacao.eadplataforma.com/login/");
        loginPage = new LoginPage(driver);
    }
    @After
    public void setLoginPageClose(){
        driver.quit();
    }
    @Test
    public void testVerificarOPreenchimentoDoEmail(){
        loginPage.verificarOPreenchimentoDoEmail();
    }
    @Test
    public void testVerificarOPreenchimentoDaSenha(){
        loginPage.verificarOPreenchimentoDaSenha();
    }
    @Test
    public void testValidarOLembreMeDaConta(){
        loginPage.validarOLembreMeDaConta();
    }
    @Test
    public void testValidarOAcessoAContaNoSiteDaTrios(){
        loginPage.validarOAcessoAContaNoSiteDaTrios();
    }
    @Test
    public void testValidarORedirecionamentoDeEsqueceuSuaSenha() { loginPage.validarORedirecionamentoDeEsqueceuSuaSenha();
    }
    @Test
    public void testValidarORedirecionamentoDeNaoConsegueSeAutenticar() { loginPage.validarORedirecionamentoDeNaoConsegueSeAutenticar();
    }
}
