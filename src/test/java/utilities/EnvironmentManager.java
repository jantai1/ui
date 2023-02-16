package utilities;

public class EnvironmentManager {
    public static String baseUrl;
    public static String username;
    public static String password;

    public static void setUpEnvironment() throws Exception{
        switch (ConfigReader.getProperty("environment").toLowerCase()){
            case "dev":
                DEV();
                break;
            case "qa":
                QA();
                break;
            case "prod":
                PROD();
                break;
            default:
                throw new Exception("Invalid environment in configuration.properties.\n"+
                        "Please select from Dev, Qa, Prod");
        }
    }

    private static void DEV(){
        baseUrl = "https://www.dev-meetup.com/";
        username = "TestUserDev";
        password = "test123";
    }
    private static void QA(){
        baseUrl = "https://www.qa-meetup.com/";
        username = "TestUserQa";
        password = "test123";
    }
    private static void PROD(){
        baseUrl = "https://www.meetup.com/";
        username = "ProdUser";
        password = "test123";
    }

}
