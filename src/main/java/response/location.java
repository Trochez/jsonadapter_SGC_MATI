/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response;

import javax.xml.bind.annotation.*;

/**
 *
 * @author JuanDiego
 */
public class location {
    
    private float latitude;
    
    private float longitude;
    
    public location(float latitude,float longitude){
        
        this.latitude = latitude;
        this.longitude = longitude;
        
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    
    
    
}
