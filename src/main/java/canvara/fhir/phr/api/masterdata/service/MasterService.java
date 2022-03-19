package canvara.fhir.phr.api.masterdata.service;

import canvara.fhir.phr.api.masterdata.entity.MasterDetailRepository;
import canvara.fhir.phr.api.masterdata.repository.MasterData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MasterService {
    private static final Logger logger = LoggerFactory.getLogger(MasterService.class);
    @Autowired
    private MasterData masterData;
    List<String> orgTypes = Arrays.asList("prov", "dept", "team", "govt", "ins", "pay", "edu", "reli", "crs", "cg", "bus", "other");
    List<String> contactSystems = Arrays.asList("phone", "fax", "email", "paper", "url", "sms", "other");
    List<String> contactUse = Arrays.asList("home", "work", "temp", "old", "mobile");
    List<String> addressUse = Arrays.asList("home", "work", "temp", "old", "billing");
    List<String> addressType = Arrays.asList("postal", "physical", "both");
    List<String> contactPurpose = Arrays.asList("bill", "admin", "hr", "payor", "patinf", "press");
    List<String> humanNameUse = Arrays.asList("usual", "official", "temp", "nickname", "anonymous", "old", "maiden");
    List<String> endPointStatus = Arrays.asList("active", "suspended", "error", "off", "entered_in_error", "test");
    List<String> locStatus = Arrays.asList("active", "suspended", "inactive");
    List<String> locModes = Arrays.asList("instance", "kind");
    List<String> days = Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun");
    List<String> genders = Arrays.asList("male", "female", "other", "unknown");
    List<String> assurance = Arrays.asList("level1", "level2", "level3", "level4");
    List<String> maritalStatus = Arrays.asList("a", "d", "i", "l", "m", "c", "p", "t", "u", "s", "w", "unk");
    List<String> langCodes = Arrays.asList("ar", "bn", "cs", "da", "de", "de-AT", "de-CH", "de-DE", "el", "en", "en-AU",
            "en-CA", "en-GB", "en-IN", "en-NZ", "en-SG", "en-US", "es", "es-AR", "es-ES", "es-UY", "fi", "fr", "fr-BE",
            "fe-CH", "fr-FR", "fy", "fy-NL", "hi", "hr", "it", "it-CH", "it-IT", "ja", "ko", "nl", "nl-BE", "nl-Nl", "no",
            "no-NO");

    public void insertMasterData() {
        MasterDetailRepository masterDetailRepository = new MasterDetailRepository();
        try {
            masterDetailRepository.setOrgType(orgTypes);
            masterDetailRepository.setContactSystem(contactSystems);
            masterDetailRepository.setContactUse(contactUse);
            masterDetailRepository.setAddressUse(addressUse);
            masterDetailRepository.setAddressType(addressType);
            masterDetailRepository.setContactPurpose(contactPurpose);
            masterDetailRepository.setHumanNameUse(humanNameUse);
            masterDetailRepository.setEndPointStatus(endPointStatus);
            masterDetailRepository.setLocStatus(locStatus);
            masterDetailRepository.setLocMode(locModes);
            masterDetailRepository.setDays(days);
            masterDetailRepository.setGender(genders);
            masterDetailRepository.setAssurance(assurance);
            masterDetailRepository.setMaritalStatus(maritalStatus);
            masterDetailRepository.setLangCodes(langCodes);
            masterData.save(masterDetailRepository);
        } catch (Exception exp) {
            logger.error("Create Operation Failed ", exp);
        }
    }
}
