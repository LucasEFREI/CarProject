package fr.efrei.CarProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

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
}
