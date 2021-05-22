/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger.swagger.mapper;

import request.eventReportRequest;
import response.eventReport;
import response.location;

/**
 *
 * @author root
 */
public class mapper {
    
    public static eventReport mapperResponse(eventReportRequest request){
        
        location location = new location(request.getLocation().getLatt(),request.getLocation().getLongg());
        
        eventReport er = new eventReport(request.getMagnitude().getIntensity(),request.getMagnitude().getDepth(),
                request.getTimes().getDuration(),request.getTimes().getDatetime(),location);
        
        return er;
        
    }
    
}
