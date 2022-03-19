package canvara.fhir.phr.api.masterdata.controller;

import canvara.fhir.phr.api.masterdata.repository.MasterDataRepository;
import canvara.fhir.phr.api.masterdata.service.MasterService;
import canvara.fhir.pojos.constant.MasterDataConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/masterData")
public class MasterDataController {

   @Autowired
   private MasterService masterService;

    @GetMapping(value = "/getOrgType")
    public ResponseEntity<List<String>> getOrganizationType() {
//        List<String> orgTypes = Arrays.asList("prov", "dept", "team", "govt", "ins", "pay", "edu", "reli", "crs", "cg", "bus", "other");
        List<String> orgTypes = masterService.getMasterData(MasterDataConstant.ORG_TYPE_KEY);
        return ResponseEntity.ok(orgTypes);
    }

    @GetMapping(value = "/getContactSystem")
    public ResponseEntity<List<String>> getContactSystem() {
//        List<String> contactSystems = Arrays.asList("phone", "fax", "email", "paper", "url", "sms", "other");
        List<String> contactSystems = masterService.getMasterData(MasterDataConstant.CONTACT_SYSTEM_KEY);
        return ResponseEntity.ok(contactSystems);
    }

    @GetMapping(value = "/getContactUse")
    public ResponseEntity<List<String>> getContactUse() {
//        List<String> contactUse = Arrays.asList("home", "work", "temp", "old", "mobile");
        List<String> contactUse = masterService.getMasterData(MasterDataConstant.CONTACT_USE_KEY);
        return ResponseEntity.ok(contactUse);
    }

    @GetMapping(value = "/getAddressUses")
    public ResponseEntity<List<String>> getAddressUse() {
//        List<String> addressUse = Arrays.asList("home", "work", "temp", "old", "billing");
        List<String> addressUse = masterService.getMasterData(MasterDataConstant.ADDRESS_USE_KEY);
        return ResponseEntity.ok(addressUse);
    }

    @GetMapping(value = "/getAddressType")
    public ResponseEntity<List<String>> getAddressType() {
//        List<String> addressType = Arrays.asList("postal", "physical", "both");
        List<String> addressType = masterService.getMasterData(MasterDataConstant.ADDRESS_TYPE_KEY);
        return ResponseEntity.ok(addressType);
    }

    @GetMapping(value = "/getContactPurpose")
    public ResponseEntity<List<String>> getContactPurpose() {
//        List<String> contactPurpose = Arrays.asList("bill", "admin", "hr", "payor", "patinf", "press");
        List<String> contactPurpose = masterService.getMasterData(MasterDataConstant.CONTACT_PURPOSE_KEY);
        return ResponseEntity.ok(contactPurpose);
    }

    @GetMapping(value = "/getHumanNameUse")
    public ResponseEntity<List<String>> getHumanNameUse() {
//        List<String> humanNameUse = Arrays.asList("usual", "official", "temp", "nickname", "anonymous", "old", "maiden");
        List<String> humanNameUse = masterService.getMasterData(MasterDataConstant.HUMAN_NAME_USE_KEY);
        return ResponseEntity.ok(humanNameUse);
    }

    @GetMapping(value = "/getEndPointStatus")
    public ResponseEntity<List<String>> getEndPointStatus() {
//        List<String> endPointStatus = Arrays.asList("active", "suspended", "error", "off", "entered_in_error", "test");
        List<String> endPointStatus = masterService.getMasterData(MasterDataConstant.ENDPOINT_STATUS_KEY);
        return ResponseEntity.ok(endPointStatus);
    }

    // location api specific
    @GetMapping(value = "/getLocStatus")
    public ResponseEntity<List<String>> getLocationStatus() {
//        List<String> locStatus = Arrays.asList("active", "suspended", "inactive");
        List<String> locStatus = masterService.getMasterData(MasterDataConstant.LOC_STATUS_KEY);
        return ResponseEntity.ok(locStatus);
    }

    @GetMapping(value = "/getLocMode")
    public ResponseEntity<List<String>> getLocationModes() {
//        List<String> locModes = Arrays.asList("instance", "kind");
        List<String> locModes = masterService.getMasterData(MasterDataConstant.LOC_MODE_KEY);
        return ResponseEntity.ok(locModes);
    }

    @GetMapping(value = "/getDays")
    public ResponseEntity<List<String>> getDays() {
//        List<String> days = Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun");
        List<String> days = masterService.getMasterData(MasterDataConstant.DAYS_KEY);
        return ResponseEntity.ok(days);
    }

    //person api specific
    @GetMapping(value = "/getGender")
    public ResponseEntity<List<String>> getGender() {
//        List<String> genders = Arrays.asList("male", "female", "other", "unknown");
        List<String> genders = masterService.getMasterData(MasterDataConstant.GENDER_KEY);
        return ResponseEntity.ok(genders);
    }

    @GetMapping(value = "/getAssurance")
    public ResponseEntity<List<String>> getAssurance() {
//        List<String> assurance = Arrays.asList("level1", "level2", "level3", "level4");
        List<String> assurance = masterService.getMasterData(MasterDataConstant.ASSURANCE_KEY);
        return ResponseEntity.ok(assurance);
    }

    @GetMapping(value = "/getMaritalStatus")
    public ResponseEntity<List<String>> getMaritalStatus() {
//        List<String> maritalStatus = Arrays.asList("a", "d", "i", "l", "m", "c", "p", "t", "u", "s", "w", "unk");
        List<String> maritalStatus = masterService.getMasterData(MasterDataConstant.MARITAL_KEY);
        return ResponseEntity.ok(maritalStatus);
    }

    @GetMapping(value = "/getLangCodes")
    public ResponseEntity<List<String>> getLanguageCode() {
//        List<String> langCodes = Arrays.asList("ar", "bn", "cs", "da", "de", "de-AT", "de-CH", "de-DE", "el", "en", "en-AU",
//                "en-CA", "en-GB", "en-IN", "en-NZ", "en-SG", "en-US", "es", "es-AR", "es-ES", "es-UY", "fi", "fr", "fr-BE",
//                "fe-CH", "fr-FR", "fy", "fy-NL", "hi", "hr", "it", "it-CH", "it-IT", "ja", "ko", "nl", "nl-BE", "nl-Nl", "no",
//                "no-NO");
        List<String> langCodes = masterService.getMasterData(MasterDataConstant.LANG_KEY);
        return ResponseEntity.ok(langCodes);
    }
}
