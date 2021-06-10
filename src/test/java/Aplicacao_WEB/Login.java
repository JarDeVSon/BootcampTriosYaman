package Aplicacao_WEB;

import Pages.Cadastro.CadastroPage;
import Pages.Login.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    static WebDriver driver;
    static LoginPage loginPage;
    static Object validarOAcessoAContaNoSiteDaTrios;

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jarde\\IdeaProjects\\Bootcamp-Turma1-SegEQuarta\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://triosdecapacitacao.eadplataforma.com/login/");

        loginPage = new LoginPage(driver,validarOAcessoAContaNoSiteDaTrios);
    }
    @Test
    public void test(){
        loginPage.validarOAcessoAContaNoSiteDaTrios();
    }
}
