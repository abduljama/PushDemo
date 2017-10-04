package com.example.demo;


import com.example.demo.model.Group;
import com.example.demo.model.Joke;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Elphas Khajira on 9/20/17.
 */

@FeignClient(url = "https://ics4-2018.now.sh/",name = "yi")
public interface StudentFeignClient {

    @RequestMapping(value = "/groups",method = RequestMethod.POST)
    Group createGroup(@RequestBody Group group);

    @RequestMapping(value = "{id}/jokes",method = RequestMethod.POST)
    Joke createJoke(@RequestBody Joke joke);
}
