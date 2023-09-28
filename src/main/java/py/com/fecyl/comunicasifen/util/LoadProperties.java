package py.com.fecyl.comunicasifen.util;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.*;
import java.util.Properties;

@Singleton
@Startup
public class LoadProperties {

    private String ENVIRONMENT_VARIABLE = "CONFIGURATION_HOME";
    private String PROPERTIES_PATH = "config.properties";
    private String MESSAGE_INPUT = "la variable InputStream es: ";
    private String MESSAGE_READ = "Propiedades.";
    private String SIFEN_EVENTO_API_URL = "sifen_evento_api_url";
    private String SIFEN_RECIBE_API_URL = "sifen_recibe_api_url";
    private String SIFEN_RECIBE_LOTE_API_URL = "sifen_recibe_lote_api_url";
    private String USAR_URL_PRODUCCION = "usar_url_produccion";
    private String WILDFLY_CONFIG = System.getProperty("jboss.server.config.dir");
    private String KEY_STORE_URL = "keystore_url";
    private String KEY_PASS = "keypass_url";
    private String STORE_PASS = "storepass";
    private String ES_AMBIENTE_PRODUCCION = "es_ambiente_produccion";

    private Properties configProp;
    boolean local_enviroment_config = false;

    @PostConstruct
    public void init() {
        String fileName = WILDFLY_CONFIG + File.separator + PROPERTIES_PATH;
        try (FileInputStream fis = new FileInputStream(fileName)) {
            configProp = new Properties();
            try {
                configProp.load(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getSIFEN_EVENTO_API_URL() {
        return configProp.getProperty(SIFEN_EVENTO_API_URL);
    }

    public String getSIFEN_RECIBE_API_URL() {
        return configProp.getProperty(SIFEN_RECIBE_API_URL);
    }

    public String getSIFEN_RECIBE_LOTE_API_URL() {
        return configProp.getProperty(SIFEN_RECIBE_LOTE_API_URL);
    }

    public String getUSAR_URL_PRODUCCION() {
        return configProp.getProperty(ES_AMBIENTE_PRODUCCION);
    }

    public String getKEY_STORE_URL() {
        return configProp.getProperty(KEY_STORE_URL);
    }

    public String getKEY_PASS() {
        return configProp.getProperty(KEY_PASS);
    }

    public String getSTORE_PASS() {
        return configProp.getProperty(STORE_PASS);
    }
    
    public String getES_AMBIENTE_PRODUCCION() {
        return configProp.getProperty(ES_AMBIENTE_PRODUCCION);
    }
}
