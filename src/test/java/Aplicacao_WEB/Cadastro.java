package Aplicacao_WEB;


import Pages.Cadastro.CadastroPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Cadastro {

    static WebDriver driver;
    static CadastroPage cadastroPage;

    @Before
    public void setCadastroPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jarde\\IdeaProjects\\Bootcamp-Turma1-SegEQuarta\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://triosdecapacitacao.eadplataforma.com/cadastro/");

        cadastroPage = new CadastroPage(driver);
    }
    @Test
    public void test(){
        cadastroPage.preencherCadastro();
    }
}
