package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Distribution {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer distribution_record;
    private LocalDateTime distribution_date;
    private Integer center_id;
    private Integer quantity;

    public Integer getDistribution_record() {
        return distribution_record;
    }

    public void setDistribution_record(Integer distribution_record) {
        this.distribution_record = distribution_record;
    }

    public LocalDateTime getDistribution_date() {
        return distribution_date;
    }

    public void setDistribution_date(LocalDateTime distribution_date) {
        this.distribution_date = distribution_date;
    }

    public Integer getCenter_id() {
        return center_id;
    }

    public void setCenter_id(Integer center_id) {
        this.center_id = center_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
