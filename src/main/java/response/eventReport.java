/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response;


/**
 *
 * @author JuanDiego
 */
public class eventReport {
    
    private float magnitude;
    
    private location location;
    
    private String time;
    
    private float depth;
    
    private float duration;
    
    public eventReport(float magnitude,float depth, float duration,  String time, location location){
        
        this.magnitude = magnitude;
        this.depth = depth;
        this.duration = duration;
        this.location = location;
        this.time = time;
        
    }

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
    
    
    
    
}
