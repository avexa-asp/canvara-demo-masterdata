package canvara.fhir.phr.api.masterdata.repository;

import canvara.fhir.phr.api.masterdata.entity.MasterDetail;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterDataRepository extends MongoRepository<MasterDetail, String> {

    @Override
    <S extends MasterDetail> List<S> findAll(Example<S> example);
}
