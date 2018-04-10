package narayan.microservices.alpha.priceservice.repo;

public interface Queries {

    String INSERT_NOMINEE = "INSERT INTO nominee_details " +
            "(name, relation, dob, guardian_name, guardian_dob) VALUES " +
            "(:name, :relation, :dob, :guardianName, :guardianDob)";

    String UPDATE_NOMINEE = "UPDATE nominee_details SET " +
            "name = :name, " +
            "dob = :dob, " +
            "relation = :relation, " +
            "guardian_name = :guardianName, " +
            "guardian_dob = :guardianDob " +
            "WHERE id = :id";


}

