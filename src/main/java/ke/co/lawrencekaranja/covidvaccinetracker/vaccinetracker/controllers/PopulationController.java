package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.controllers;

import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities.Centers;
import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities.Population;
import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.repositories.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping(path = "/population")
public class PopulationController {
    @Autowired
    private PopulationRepository populationRepository;

    @PostMapping(path="/create")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody
    Population createNewUser(@RequestParam String contact){
        UUID uuid = UUID.randomUUID();
        Population user = new Population();
        user.setContact(contact);
        user.setIdentifier(uuid.toString());
        return populationRepository.save(user);
    }

    @GetMapping(path = "/users")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    Iterable<Population> getAllUsers(){
        return populationRepository.findAll();
    }
}