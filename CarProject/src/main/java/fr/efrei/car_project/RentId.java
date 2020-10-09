package fr.efrei.car_project;

import java.io.Serializable;
import java.util.Date;

public class RentId implements Serializable {
    //------------------------------------------------------------------------------------------------------------------
    private Date beginRent;
    private Date endRent;
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public RentId(Date beginRent, Date endRent)
    {
        this.beginRent=beginRent;
        this.endRent=endRent;
    }
    //------------------------------------------------------------------------------------------------------------------
}
