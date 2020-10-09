package fr.efrei.car_project;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

public class RentId implements Serializable {
    //------------------------------------------------------------------------------------------------------------------
    private Date beginRent;
    private Date endRent;

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public RentId(Date beginRent, Date endRent)
    {
        this.beginRent=beginRent;
        this.endRent=endRent;
    }

    //------------------------------------------------------------------------------------------------------------------
}
