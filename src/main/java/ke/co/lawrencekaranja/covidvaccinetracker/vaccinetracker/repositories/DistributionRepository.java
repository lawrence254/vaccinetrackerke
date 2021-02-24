package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.repositories;

import ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities.Distribution;
import org.springframework.data.repository.CrudRepository;

public interface DistributionRepository extends CrudRepository<Distribution, Integer> {
}
