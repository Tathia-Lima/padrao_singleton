package configApp.configApp;
public class AppConfig {

    private static AppConfig instance = new AppConfig();
    public static AppConfig getInstance()
    {
        return instance;
    }

    private String appName;
    private String appVersion;
    private String apiUrl;

    private AppConfig() {
      this.apiUrl = "https://api.com";
    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}