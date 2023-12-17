package generalstore.tests;

import generalstore.pages.FormSayfasi;
import org.testng.annotations.Test;

import static generalstore.utils.Driver.uygulamayiKapat;

public class TC02_NegatifTest {
    @Test
    public void tc02NegatifTest() {
        FormSayfasi formSayfasi = new FormSayfasi();
        formSayfasi.letsShopButonunaTikla();
        formSayfasi.hataMesajininGorundugunuDogrula("Please enter your name");
        uygulamayiKapat();
    }
}


   /*
    Uygulama: GeneralStore
        GeneralStore uygulamasına gir
        Menüden Angola seçeneğini seç
        Your Name kutusunu boş bırak
        Let’s Shop butonuna tıkla
        Hata mesajını doğrula (Toast Message)
     */