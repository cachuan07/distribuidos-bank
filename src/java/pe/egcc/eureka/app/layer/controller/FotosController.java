/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.eureka.app.layer.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.stereotype.Component;


public class FotosController {
    private List<String> images; 

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
    
    @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
        for(int i=1;i<=7;i++) {  
            images.add(i + ".jpg");  
        }  
    
    }
    
}
