package fr.efrei.car_project;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@IdClass(RentId.class)
@Entity
public class Rent {
    //------------------------------------------------------------------------------------------------------------------
    private Date beginRent;
    @Id
    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    private Date endRent;
    @Id
    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }
    //------------------------------------------------------------------------------------------------------------------
    @ManyToMany
    private List<Vehicule> vehiculeList;

    @OneToMany
    private List<Person> personList;
}
