/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;


/**
 *
 * @author JuanDiego
 */
public class eventReportRequest {
        
    
    private locationRequest location;
    
    private magnitude magnitude;
    
    private times times;
    

    public locationRequest getLocation() {
        return location;
    }

    public void setLocation(locationRequest location) {
        this.location = location;
    }

    public magnitude getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(magnitude magnitude) {
        this.magnitude = magnitude;
    }

    public times getTimes() {
        return times;
    }

    public void setTimes(times times) {
        this.times = times;
    }

    
    
    
}
