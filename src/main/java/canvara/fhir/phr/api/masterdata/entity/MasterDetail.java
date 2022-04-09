package canvara.fhir.phr.api.masterdata.entity;

import canvara.fhir.pojos.dto.MasterDataDetail;
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
public class MasterDetail extends MasterDataDetail {

}
