package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.controllers;

import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities.Centers;
import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.repositories.CentersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/centers")
public class CentersController {
    @Autowired
    CentersRepository vaccineCenterRepository;

    @PostMapping (path = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    Centers createACenter (@RequestParam String name, @RequestParam String contact){
        Centers center = new Centers();
        center.setName(name);
        center.setContact(contact);
        return vaccineCenterRepository.save(center);
    }

    @GetMapping(path = "/vaccinecenters")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    Iterable<Centers> getAllCenters(){
        return vaccineCenterRepository.findAll();
    }

    @GetMapping(path = "/vaccinecenter/{id}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    Optional<Centers> getCenterById(@PathVariable("id") Integer center_id){
        return vaccineCenterRepository.findById(center_id);
    }
}
