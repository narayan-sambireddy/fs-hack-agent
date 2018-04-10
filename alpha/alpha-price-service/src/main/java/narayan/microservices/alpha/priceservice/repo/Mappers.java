package narayan.microservices.alpha.priceservice.repo;
import narayan.microservices.alpha.priceservice.domain.NomineeDetails;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.util.function.Function;

public interface Mappers {

    Function<NomineeDetails, MapSqlParameterSource> NOMINEE_DETAILS_QUERY_PARAMS = nd -> {
      MapSqlParameterSource paramMap = new MapSqlParameterSource();
      paramMap.addValue("id", nd.getId());
      paramMap.addValue("name", nd.getName());
      paramMap.addValue("relation", nd.getRelation());
      paramMap.addValue("dob", nd.getDob());
      paramMap.addValue("guardianName", nd.getGuardianName());
      paramMap.addValue("guardianDob", nd.getGuardianDob());
      return paramMap;
    };


    RowMapper<NomineeDetails> NOMINEE_DETAILS_ROW_MAPPER = (rs, rn) -> {
      NomineeDetails nomineeDetails = new NomineeDetails();
      nomineeDetails.setName(rs.getString("name"));
      nomineeDetails.setRelation(rs.getString("relation"));
      nomineeDetails.setDob(rs.getDate("dob"));
      nomineeDetails.setGuardianName(rs.getString("guardian_name"));
      nomineeDetails.setGuardianDob(rs.getDate("guardian_dob"));
      return nomineeDetails;
    };

}
