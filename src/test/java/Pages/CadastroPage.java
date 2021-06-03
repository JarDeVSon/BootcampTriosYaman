package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {
    static WebDriver driver;


    public CadastroPage(WebDriver driver){
        CadastroPage.driver = driver;
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

        WebElement captcha = driver.findElement(By.cssSelector("input[maxlength='6']"));
        captcha.sendKeys("KNGI3L");

        WebElement entrar = driver.findElement(By.cssSelector("#btn_cadastro"));
        entrar.click();

    }

}
