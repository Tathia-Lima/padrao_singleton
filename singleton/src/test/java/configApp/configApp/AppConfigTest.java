package configApp.configApp;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppConfigTest {
    @Test
    public void testSingleton() {
        AppConfig instance1 = AppConfig.getInstance();
        AppConfig instance2 = AppConfig.getInstance();
        Assertions.assertSame(instance1, instance2, "As instâncias devem ser as mesmas");
    }
    @Test
    public void testGetAppName() {
        AppConfig.getInstance().setAppName("MyApp");
        assertEquals("MyApp", AppConfig.getInstance().getAppName());
    }

    @Test
    public void testGetAppVersion() {
        AppConfig.getInstance().setAppVersion("1.0");
        assertEquals("1.0", AppConfig.getInstance().getAppVersion());
    }

    @Test
    public void testGetApiUrl() {
        AppConfig appConfig = AppConfig.getInstance();
        Assertions.assertEquals("https://api.com", appConfig.getApiUrl(), "URL da API deve ser https://api.com");
    }
}