package canvara.fhir.phr.api.masterdata.repository;

import canvara.fhir.phr.api.masterdata.entity.MasterDetailRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterData extends MongoRepository<MasterDetailRepository, String> {

}
