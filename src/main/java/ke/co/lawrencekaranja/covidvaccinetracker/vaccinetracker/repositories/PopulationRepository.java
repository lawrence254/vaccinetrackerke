package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.repositories;

import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities.Population;
import org.springframework.data.repository.CrudRepository;

public interface PopulationRepository extends CrudRepository<Population, Integer> {
}