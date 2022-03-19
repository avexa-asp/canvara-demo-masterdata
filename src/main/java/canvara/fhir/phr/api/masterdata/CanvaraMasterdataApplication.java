package canvara.fhir.phr.api.masterdata;

import canvara.fhir.phr.api.masterdata.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CanvaraMasterdataApplication {
    @Autowired
    private MasterService masterService;

    public static void main(String[] args) {
        SpringApplication.run(CanvaraMasterdataApplication.class, args);
    }

    @PostConstruct
    public void insertMasterData() {
        masterService.insertMasterData();
    }

}
