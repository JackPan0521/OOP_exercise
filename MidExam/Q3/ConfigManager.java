package Q3;

public class ConfigManager {
    public static ConfigManager instance;

    private ConfigManager(){}

    public static ConfigManager getInstance(){
        if(instance == null){
            instance = new ConfigManager();
        }return instance;
    }
    
}
