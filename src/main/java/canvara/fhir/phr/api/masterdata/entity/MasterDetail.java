package canvara.fhir.phr.api.masterdata.entity;

import canvara.fhir.pojos.dto.MasterDataDetail;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author amit pal
 */
@Document(collection = "canvara_master_data")
@Data
@NoArgsConstructor
@ToString
public class MasterDetail extends MasterDataDetail {

}
