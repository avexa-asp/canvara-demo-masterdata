package canvara.fhir.phr.api.masterdata.service;

import canvara.fhir.phr.api.masterdata.entity.MasterDetail;
import canvara.fhir.phr.api.masterdata.repository.MasterDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import canvara.fhir.pojos.constant.MasterDataConstant;

@Component
public class MasterService {
    private static final Logger logger = LoggerFactory.getLogger(MasterService.class);
    public HashMap<String, List<String>> masterDataMap = new HashMap<>();
    @Autowired
    private MasterDataRepository masterDataRepository;

    List<String> orgTypes = Arrays.asList("prov", "dept", "team", "govt", "ins", "pay", "edu", "reli", "crs", "cg", "bus", "other");
    List<String> contactSystems = Arrays.asList("phone", "fax", "email", "paper", "url", "sms", "other");
    List<String> contactUse = Arrays.asList("home", "work", "temp", "old", "mobile");
    List<String> addressUse = Arrays.asList("home", "work", "temp", "old", "billing");
    List<String> addressType = Arrays.asList("postal", "physical", "both");
    List<String> contactPurpose = Arrays.asList("bill", "admin", "hr", "payor", "patinf", "press");
    List<String> humanNameUse = Arrays.asList("usual", "official", "temp", "nickname", "anonymous", "old", "maiden");
    List<String> endPointStatus = Arrays.asList("mock-status", "active", "suspended", "error", "off", "entered_in_error", "test");
    List<String> locStatus = Arrays.asList("active", "suspended", "inactive");
    List<String> locModes = Arrays.asList("instance", "kind");
    List<String> days = Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun");
    List<String> genders = Arrays.asList("male", "female", "other", "unknown");
    List<String> assurance = Arrays.asList("level1", "level2", "level3", "level4");
    List<String> maritalStatus = Arrays.asList("a", "d", "i", "l", "m", "c", "p", "t", "u", "s", "w", "unk");
    List<String> langCodes = Arrays.asList("ar", "bn", "cs", "da", "de", "de-AT");
    //https://terminology.hl7.org/3.1.0/ValueSet-v2-0360.html
    List<String> qualificationCodes = Arrays.asList("pn", "aas", "aa", "aba");
    List<String> practitionerRoleCode = Arrays.asList("doctor", "nurse", "pharmacist", "researcher", "...remaining");
    List<String> practitionerRoleSpecialty = Arrays.asList("408467006", "394577000", "...remaining");
    List<String> endpointConnectionType = Arrays.asList("mock-connectionType");
    List<String> endpointPayloadType = Arrays.asList("mock-payload-type");
    List<String> endpointPayloadMimeType = Arrays.asList("mock-mime-type");
    
    public void insertMasterData() {
        MasterDetail masterDetail = new MasterDetail();
        try {
            masterDetail.setOrgType(orgTypes);
            masterDetail.setContactSystem(contactSystems);
            masterDetail.setContactUse(contactUse);
            masterDetail.setAddressUse(addressUse);
            masterDetail.setAddressType(addressType);
            masterDetail.setContactPurpose(contactPurpose);
            masterDetail.setHumanNameUse(humanNameUse);
            masterDetail.setEndPointStatus(endPointStatus);
            masterDetail.setLocStatus(locStatus);
            masterDetail.setLocMode(locModes);
            masterDetail.setDays(days);
            masterDetail.setGender(genders);
            masterDetail.setAssurance(assurance);
            masterDetail.setMaritalStatus(maritalStatus);
            masterDetail.setLangCodes(langCodes);
            masterDetail.setQualificationCodes(qualificationCodes);
            masterDetail.setPractitionerRoleCode(practitionerRoleCode);
            masterDetail.setPractitionerRoleSpecialty(practitionerRoleSpecialty);
            masterDetail.setEndPointConnectionType(endpointConnectionType);
            masterDetail.setEndPointPayloadType(endpointPayloadType);
            masterDetail.setEndPointPayloadMimeType(endpointPayloadMimeType);
            if ((masterDataRepository.findAll().size() > 0)) {
                masterDataRepository.deleteAll();
            }
            masterDataRepository.save(masterDetail);
        } catch (Exception exp) {
            logger.error("Create Operation Failed ", exp);
        }
    }

    public void insertDataInMasterMap(String key, List<String> value) {
        masterDataMap.put(key, value);
    }

    public List<String> getMasterData(String key) {
        return masterDataMap.get(key);
    }

    /**
     * key is master field name
     *
     * @param key
     * @return
     */
    public void loadMasterData(String key) throws Exception {
        logger.info("Master Data Loading...");
        AtomicReference<Boolean> isDataPresent = new AtomicReference<>(true);
        masterDataRepository.findAll().stream().findFirst().ifPresentOrElse(masterDetail -> {
            insertDataInMasterMap(MasterDataConstant.GENDER_KEY, masterDetail.getGender());
            insertDataInMasterMap(MasterDataConstant.ASSURANCE_KEY, masterDetail.getAssurance());
            insertDataInMasterMap(MasterDataConstant.MARITAL_KEY, masterDetail.getMaritalStatus());
            insertDataInMasterMap(MasterDataConstant.LANG_KEY, masterDetail.getLangCodes());
            insertDataInMasterMap(MasterDataConstant.ORG_TYPE_KEY, masterDetail.getOrgType());
            insertDataInMasterMap(MasterDataConstant.CONTACT_SYSTEM_KEY, masterDetail.getContactSystem());
            insertDataInMasterMap(MasterDataConstant.CONTACT_USE_KEY, masterDetail.getContactUse());
            insertDataInMasterMap(MasterDataConstant.ADDRESS_USE_KEY, masterDetail.getAddressUse());
            insertDataInMasterMap(MasterDataConstant.ADDRESS_TYPE_KEY, masterDetail.getAddressType());
            insertDataInMasterMap(MasterDataConstant.CONTACT_PURPOSE_KEY, masterDetail.getContactPurpose());
            insertDataInMasterMap(MasterDataConstant.HUMAN_NAME_USE_KEY, masterDetail.getHumanNameUse());
            insertDataInMasterMap(MasterDataConstant.ENDPOINT_STATUS_KEY, masterDetail.getEndPointStatus());
            insertDataInMasterMap(MasterDataConstant.LOC_STATUS_KEY, masterDetail.getLocStatus());
            insertDataInMasterMap(MasterDataConstant.LOC_MODE_KEY, masterDetail.getLocMode());
            insertDataInMasterMap(MasterDataConstant.DAYS_KEY, masterDetail.getDays());
            insertDataInMasterMap(MasterDataConstant.PAYLOAD_TYPE_KEY, masterDetail.getEndPointPayloadType());
        }, () -> isDataPresent.set(false));

        if (!isDataPresent.get()) throw new EmptyStackException();
        logger.info("Master Data Loaded Successfully");

    }
}
