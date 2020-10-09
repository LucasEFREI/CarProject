package fr.efrei.CarProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Rent {
    @Id
    private Date beginRent;
    @Id
    private Date endRent;

    //------------------------------------------------------------------------------------------------------------------
    @Id
    public Date getBeginRent() {
        return beginRent;
    }

    @Id
    public Date getEndRent() {
        return endRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }
}
