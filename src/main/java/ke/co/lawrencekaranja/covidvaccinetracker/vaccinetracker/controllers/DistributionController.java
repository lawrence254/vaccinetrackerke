package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.controllers;

import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities.Distribution;
import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.repositories.DistributionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.format.DateTimeFormatter.ofPattern;

@Controller
@RequestMapping(path = "/distribution")
public class DistributionController {
    @Autowired
    private DistributionRepository distributionRepository;

    @PostMapping(path = "/create")
    public @ResponseBody
    Distribution createDistributionRecord (@RequestParam Integer centerId, @RequestParam Integer quantity){
        Distribution distribution = new Distribution();
        LocalDateTime unformattedDate = LocalDateTime.now();
        distribution.setDistribution_date(unformattedDate);
        distribution.setCenter_id(centerId);
        distribution.setQuantity(quantity);

        return distributionRepository.save(distribution);
    }

    @GetMapping (path = "distributions")
    public @ResponseBody
    Iterable<Distribution> getAllDistributionRecords(){
        return distributionRepository.findAll();
    }

}
