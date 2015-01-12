package jp.enrapt.yutaka.gaesample.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yutaka on 2015/01/12.
 */
@Controller
@RequestMapping("/Sample")
public class Sample {
    
    
    @RequestMapping(method= RequestMethod.GET)
    public String defaultPage(ModelMap model){
        return "Sample/view";
    }

}
