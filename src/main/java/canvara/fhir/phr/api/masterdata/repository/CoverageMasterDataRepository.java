package canvara.fhir.phr.api.masterdata.repository;

import canvara.fhir.phr.api.masterdata.entity.CoverageMasterDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoverageMasterDataRepository extends MongoRepository<CoverageMasterDetail, String> {
}
