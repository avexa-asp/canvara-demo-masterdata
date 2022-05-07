package canvara.fhir.phr.api.masterdata.controller;

import canvara.fhir.phr.api.masterdata.service.MasterService;
import canvara.fhir.pojos.constant.MasterDataConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/masterData")
public class MasterDataController {

   @Autowired
   private MasterService masterService;

    @GetMapping(value = "/getOrgType")
    public ResponseEntity<List<String>> getOrganizationType() {
        List<String> orgTypes = masterService.getMasterData(MasterDataConstant.ORG_TYPE_KEY);
        return ResponseEntity.ok(orgTypes);
    }

    @GetMapping(value = "/getMasterData")
    public ResponseEntity<Map<String, List<String>>> getMasterData(@RequestBody List<String> masterKeys) {
        return null;
    }
}
