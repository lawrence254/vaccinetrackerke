package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.entities;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer person_id;
    private String identifier;
    private String contact;

    public Integer getPerson_id(){
         return person_id;
     }

     public void setPerson_id(Integer person_id){
        this.person_id = person_id;
     }

    public String getIdentifier(){
        return identifier;
    }

    public void setIdentifier(String identifierUUID){
        this.identifier = identifierUUID;

    }

    public String getContact(){
        return contact;
    }

    public void setContact(String contact){
        this.contact = contact;
    }
}