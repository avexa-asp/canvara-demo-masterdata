package canvara.fhir.phr.api.masterdata.entity;

import canvara.fhir.pojos.dto.master.data.CoverageMasterDataDetail;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author amit pal
 */
@Document(collection = "canvara_coverage_master_data")
@Data
@NoArgsConstructor
@ToString
public class CoverageMasterDetail extends CoverageMasterDataDetail {
}
