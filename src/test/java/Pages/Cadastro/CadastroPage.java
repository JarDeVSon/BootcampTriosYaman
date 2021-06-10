package Pages.Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage {

    static Object preencherCadastro;
    static WebDriver driver;


    public CadastroPage(WebDriver driver, Object preencherCadastro){
        CadastroPage.driver = driver;
        CadastroPage.preencherCadastro = preencherCadastro;
    }
    public void preencherCadastro(){
        WebElement nomeCompleto = driver.findElement(By.cssSelector("#nome"));
        nomeCompleto.sendKeys("Trios");

        WebElement telefone = driver.findElement(By.cssSelector("#telefone"));
        telefone.sendKeys("(19)99999999");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("triosdecapacitacao@gmail.com");

        WebElement senha = driver.findElement(By.cssSelector("#senha"));
        senha.sendKeys("pwd@123");

        WebElement captcha = driver.findElement(By.cssSelector("input[name='e-captcha']"));
        captcha.sendKeys("SC9N05");

        WebElement criarConta = driver.findElement(By.cssSelector("#btn_cadastro"));
        criarConta.click();

    }

}
