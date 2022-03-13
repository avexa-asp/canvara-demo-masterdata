package canvara.fhir.phr.api.masterdata.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/masterData")
public class MasterDataResource {

    @GetMapping(value = "/getOrgType")
    public ResponseEntity<List<String>> getOrganizationType() {
        List<String> orgTypes = Arrays.asList("prov", "dept", "team", "govt", "ins", "pay", "edu", "reli", "crs", "cg", "bus", "other");
        return ResponseEntity.ok(orgTypes);
    }

    @GetMapping(value = "/getContactSystem")
    public ResponseEntity<List<String>> getContactSystem() {
        List<String> contactSystems = Arrays.asList("phone", "fax", "email", "paper", "url", "sms", "other");
        return ResponseEntity.ok(contactSystems);
    }

    @GetMapping(value = "/getContactUse")
    public ResponseEntity<List<String>> getContactUse() {
        List<String> contactUse = Arrays.asList("home", "work", "temp", "old", "mobile");
        return ResponseEntity.ok(contactUse);
    }

    @GetMapping(value = "/getAddressUses")
    public ResponseEntity<List<String>> getAddressUse() {
        List<String> addressUse = Arrays.asList("home", "work", "temp", "old", "billing");
        return ResponseEntity.ok(addressUse);
    }

    @GetMapping(value = "/getAddressType")
    public ResponseEntity<List<String>> getAddressType() {
        List<String> addressType = Arrays.asList("postal", "physical", "both");
        return ResponseEntity.ok(addressType);
    }

    @GetMapping(value = "/getContactPurpose")
    public ResponseEntity<List<String>> getContactPurpose() {
        List<String> contactPurpose = Arrays.asList("bill", "admin", "hr", "payor", "patinf", "press");
        return ResponseEntity.ok(contactPurpose);
    }

    @GetMapping(value = "/getHumanNameUse")
    public ResponseEntity<List<String>> getHumanNameUse() {
        List<String> humanNameUse = Arrays.asList("usual", "official", "temp", "nickname", "anonymous", "old", "maiden");
        return ResponseEntity.ok(humanNameUse);
    }

    @GetMapping(value = "/getEndPointStatus")
    public ResponseEntity<List<String>> getEndPointStatus() {
        List<String> endPointStatus = Arrays.asList("active", "suspended", "error", "off", "entered_in_error", "test");
        return ResponseEntity.ok(endPointStatus);
    }

    // location api specific
    @GetMapping(value = "/getLocStatus")
    public ResponseEntity<List<String>> getLocationStatus() {
        List<String> locStatus = Arrays.asList("active", "suspended", "inactive");
        return ResponseEntity.ok(locStatus);
    }

    @GetMapping(value = "/getLocMode")
    public ResponseEntity<List<String>> getLocationModes() {
        List<String> locModes = Arrays.asList("instance", "kind");
        return ResponseEntity.ok(locModes);
    }

    @GetMapping(value = "/getDays")
    public ResponseEntity<List<String>> getDays() {
        List<String> days = Arrays.asList("mon", "tue", "wed", "thu", "fri", "sat", "sun");
        return ResponseEntity.ok(days);
    }

    //person api specific
    @GetMapping(value = "/getGender")
    public ResponseEntity<List<String>> getGender(){
        List<String> genders = Arrays.asList("male", "female", "other", "unknown");
        return ResponseEntity.ok(genders);
    }

    @GetMapping(value = "/getAssurance")
    public ResponseEntity<List<String>> getAssurance(){
        List<String> genders = Arrays.asList("level1", "level2", "level3", "level4");
        return ResponseEntity.ok(genders);
    }

    @GetMapping(value = "/getMaritalStatus")
    public ResponseEntity<List<String>> getMaritalStatus(){
        List<String> maritalStatus = Arrays.asList("a", "d", "i", "l", "m", "c", "p", "t", "u", "s", "w", "unk");
        return ResponseEntity.ok(maritalStatus);
    }

    @GetMapping(value = "/getLangCodes")
    public ResponseEntity<List<String>> getLanguageCode(){
        List<String> langCodes = Arrays.asList("ar","bn", "cs", "da", "de", "de-AT", "de-CH", "de-DE", "el", "en", "en-AU",
                "en-CA", "en-GB", "en-IN", "en-NZ", "en-SG", "en-US", "es", "es-AR", "es-ES", "es-UY", "fi", "fr", "fr-BE",
                "fe-CH", "fr-FR", "fy", "fy-NL", "hi", "hr", "it", "it-CH", "it-IT", "ja", "ko", "nl", "nl-BE", "nl-Nl", "no",
                "no-NO");
        return ResponseEntity.ok(langCodes);
    }
}
