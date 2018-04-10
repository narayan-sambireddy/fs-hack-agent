package narayan.microservices.alpha.priceservice.domain;

import java.util.Date;

public class NomineeDetails {

    private Integer id;
    private String name;
    private String relation;
    private Date dob;
    private String guardianName;
    private Date guardianDob;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public Date getGuardianDob() {
        return guardianDob;
    }

    public void setGuardianDob(Date guardianDob) {
        this.guardianDob = guardianDob;
    }
}
