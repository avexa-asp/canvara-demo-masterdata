package canvara.fhir.phr.api.masterdata.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author amit pal
 */
@Document(collection = "canvara_master_data")
@Data
@NoArgsConstructor
@ToString
public class MasterDetailRepository {
    @Id
    private String id;

    private List<String> orgType;

    private List<String> contactSystem;

    private List<String> contactUse;

    private List<String> addressUse;

    private List<String> addressType;

    private List<String> contactPurpose;

    private List<String> humanNameUse;

    private List<String> endPointStatus;

    private List<String> locMode;

    private List<String> locStatus;

    private List<String> days;

    private List<String> gender;

    private List<String> assurance;

    private List<String> maritalStatus;

    private List<String> langCodes;
}
