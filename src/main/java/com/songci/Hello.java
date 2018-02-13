package com.songci;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SongLiuxin on 2018/2/8.
 */@RestController
public class Hello {
     @RequestMapping(value = "/hello",method = RequestMethod.GET)
     public String hello(){
         return "Hello SpringBooot";
     }
}
