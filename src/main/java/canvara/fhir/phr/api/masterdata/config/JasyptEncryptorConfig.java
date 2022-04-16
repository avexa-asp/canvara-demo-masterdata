package canvara.fhir.phr.api.masterdata.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptEncryptorConfig {

    private final String JASYPT_BEAN_NAME = "jasyptStringEncryptor";
    private final String ENCRYPTOR_KEY = "avexa_canvara";
    private final String ENCRYPTOR_ALGORITHM = "PBEWithMD5AndDES";
    private final String ENCRYPTOR_ITERATION = "1000";
    private final String ENCRYPTOR_POOL_SIZE = "1";
    private final String ENCRYPTOR_PROVIDER_NAME = "SunJCE";
    private final String ENCRYPTOR_SALT_GENERATOR_CLASS_NAME = "org.jasypt.salt.RandomSaltGenerator";
    private final String ENCRYPTOR_OUTPUT_TYPE = "base64";

    @Bean(name = JASYPT_BEAN_NAME)
    public StringEncryptor passwordEncryptor(){
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(ENCRYPTOR_KEY);
        config.setAlgorithm(ENCRYPTOR_ALGORITHM);
        config.setKeyObtentionIterations(ENCRYPTOR_ITERATION);
        config.setPoolSize(ENCRYPTOR_POOL_SIZE);
        config.setProviderName(ENCRYPTOR_PROVIDER_NAME);
        config.setSaltGeneratorClassName(ENCRYPTOR_SALT_GENERATOR_CLASS_NAME);
        config.setStringOutputType(ENCRYPTOR_OUTPUT_TYPE);
        encryptor.setConfig(config);
        return  encryptor;
    }

}
