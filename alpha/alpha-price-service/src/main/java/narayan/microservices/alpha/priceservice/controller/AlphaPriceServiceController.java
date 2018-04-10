package narayan.microservices.alpha.priceservice.controller;

import narayan.microservices.alpha.priceservice.domain.NomineeDetails;
import narayan.microservices.alpha.priceservice.repo.AlphaPriceServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aps")
public class AlphaPriceServiceController {

    @Autowired
    private AlphaPriceServiceRepo repo;

    @PostMapping("/persist")
    public String persist(@RequestBody NomineeDetails nomineeDetails) {
        return "ROWS EFFECTED :: " + repo.persistNominee(nomineeDetails);
    }

    @PostMapping("/update")
    public String update(@RequestBody NomineeDetails nomineeDetails) {
        return "ROWS EFFECTED :: " + repo.updateNominee(nomineeDetails);
    }

}
