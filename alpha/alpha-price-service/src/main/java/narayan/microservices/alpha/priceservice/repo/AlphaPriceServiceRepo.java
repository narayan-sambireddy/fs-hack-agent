package narayan.microservices.alpha.priceservice.repo;

import narayan.microservices.alpha.priceservice.domain.NomineeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import static narayan.microservices.alpha.priceservice.repo.Mappers.NOMINEE_DETAILS_QUERY_PARAMS;
import static narayan.microservices.alpha.priceservice.repo.Queries.INSERT_NOMINEE;
import static narayan.microservices.alpha.priceservice.repo.Queries.UPDATE_NOMINEE;

@Repository
public class AlphaPriceServiceRepo {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public int persistNominee(NomineeDetails nomineeDetails) {
       return jdbcTemplate.update(INSERT_NOMINEE, NOMINEE_DETAILS_QUERY_PARAMS.apply(nomineeDetails));
    }

    public int updateNominee(NomineeDetails nomineeDetails) {
        return jdbcTemplate.update(UPDATE_NOMINEE, NOMINEE_DETAILS_QUERY_PARAMS.apply(nomineeDetails));
    }

    // m12-572-166
}
