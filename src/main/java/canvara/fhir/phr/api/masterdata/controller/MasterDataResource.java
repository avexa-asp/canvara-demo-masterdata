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
        List<String> orgTypes = Arrays.asList("prov","dept","team","govt","ins","pay","edu","reli","crs","cg","bus","other");
        return ResponseEntity.ok(orgTypes);
    }
    @GetMapping(value = "/getContactSystem")
    public ResponseEntity<List<String>> getContactSystem(){
        List<String> contactSystems = Arrays.asList("phone","fax","email","paper","url","sms","other");
        return ResponseEntity.ok(contactSystems);
    }
    @GetMapping(value = "/getContactUse")
    public ResponseEntity<List<String>> getContactUse(){
        List<String> contactUse = Arrays.asList( "home", "work", "temp", "old", "mobile");
        return ResponseEntity.ok(contactUse);
    }
    @GetMapping(value = "/getAddressUses")
    public ResponseEntity<List<String>> getAddressUse(){
        List<String> addressUse = Arrays.asList( "home","work","temp","old","billing");
        return ResponseEntity.ok(addressUse);
    }

    @GetMapping(value = "/getAddressType")
    public ResponseEntity<List<String>> getAddressType(){
        List<String> addressType = Arrays.asList( "postal","physical","both");
        return ResponseEntity.ok(addressType);
    }

    @GetMapping(value = "/getContactPurpose")
    public ResponseEntity<List<String>> getContactPurpose(){
        List<String> contactPurpose = Arrays.asList("bill","admin","hr","payor","patinf","press");
        return ResponseEntity.ok(contactPurpose);
    }

    @GetMapping(value = "/getHumanNameUse")
    public ResponseEntity<List<String>> getHumanNameUse(){
        List<String> humanNameUse = Arrays.asList("USUAL","OFFICIAL","TEMP","NICKNAME","ANONYMOUS","OLD","MAIDEN");
        return ResponseEntity.ok(humanNameUse);
    }

    @GetMapping(value = "/getEndPointStatus")
    public ResponseEntity<List<String>> getEndPointStatus(){
        List<String> endPointStatus = Arrays.asList("active","suspended","error","off","entered_in_error","test");
        return ResponseEntity.ok(endPointStatus);
    }

}
