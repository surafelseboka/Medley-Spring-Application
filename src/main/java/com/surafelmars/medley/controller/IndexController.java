package com.surafelmars.medley.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;

@Controller
public class IndexController {

//    private static Logger log = (Logger) LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value={"","/","index"})
    public String displayHome(){

        return "index.html";
    }

    @RequestMapping(value={"","/","single"})
    public String displaySingle(){
        return "single.html";

    }

//@RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String email,
//                                    @RequestParam String subject, @RequestParam String phone,
//                                    @RequestParam LocalDate date, @RequestParam LocalTime time,
//                                    @RequestParam String timeFrame, @RequestParam String party,
//                                    @RequestParam String message ){
//
//        log.info("Name : " + name);
//        log.info("email : " + email);
//        log.info("subject: " + subject);
//        log.info("phone : " + phone);
//        log.info("Date : " + date);
//        log.info("Time : " + time);
//        log.info("Time Frame : " + timeFrame);
//        log.info("party : " + party);
//        log.info("Message : " + message);
//        return new ModelAndView("redirect:/index");
//    }




}
