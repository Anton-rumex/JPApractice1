package com.work1.app1.webber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class web1controller {

    @Autowired
    private webService WS1;

    @RequestMapping ("/Menu")
    public List<Menu> alltopics(){
        return webService.getallTopics();
    }

    @RequestMapping("/Menu/{num}")
    public Menu getMenu(@PathVariable("num") String id){ // noneed to define path
                                                          // variable if it is the same name
        return webService.getMenu(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/Menu")
    public void addMenu(@RequestBody Menu topic){
        webService.addtopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Menu/{id}")
    public void updateMenu(@RequestBody Menu topic, @PathVariable String id){
        webService.updatetopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Menu/{id}")
    public void deleteMenu(@PathVariable String id){
        // variable if it is the same name
        webService.deleteMenu(id);
    }

}
