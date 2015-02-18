package com.hiradimir.gaesample.controller;

import com.hiradimir.gaesample.PMF;
import com.hiradimir.gaesample.model.Sample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by yutaka on 2015/01/12.
 */
@Controller
@RequestMapping("/Sample")
public class SampleController {


    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String defaultPage(ModelMap model){
        return "Sample/new";
    }

    Sample getByKey(String key){
        PersistenceManager pm = PMF.persistenceManager();
        

        Sample sample = pm.getObjectById(Sample.class, key);
        return sample;
    }
    
    @RequestMapping(value = "/{key}", method= RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody
    public Object getSampleJson(@PathVariable String key){
        PersistenceManager pm = PMF.persistenceManager();

        Sample sample = getByKey(key);
        if(sample == null){
            throw new RuntimeException("Sample Not Found");
        }

        return sample;
    }
    
    @RequestMapping(value = "/{key}", method= RequestMethod.GET)
    public String getSample(@PathVariable String key, ModelMap model){

        return "Sample/get";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String addSample(HttpServletRequest request, ModelMap model){
        Sample sample = new Sample();

        sample.setName(request.getParameter("name"));
        sample.setEmail(request.getParameter("email"));
        sample.setDate(new Date());

        PersistenceManager pm = PMF.persistenceManager();

        pm.makePersistent(sample);
        pm.close();
        
        model.addAttribute("sample", sample);
        
        return "Sample/added";
    }

    @RequestMapping(value = "/{id}", method= RequestMethod.PUT)
    public String updateSample(@PathVariable String key, ModelMap model){
        return "Sample/updated";
    }
    
    @RequestMapping(value = "/{id}", method= RequestMethod.DELETE)
    public String deleteSample(ModelMap model){
        return "Sample/deleted";
    }



}
