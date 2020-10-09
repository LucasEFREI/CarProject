package fr.efrei.CarProject;

import java.io.Serializable;
import java.util.Date;

public class RentId implements Serializable {
    private Date beginRent;
    private Date endRate;

    //------------------------------------------------------------------------------------------------------------------
    public RentId(Date beginRent, Date endRate)
    {
        this.beginRent=beginRent;
        this.endRate=endRate;
    }
}
