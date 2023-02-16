package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model){
        events.put("Code Til Dawn", "Yaba daba doo");
        events.put("WWDC", "Jinkies");
        events.put("Code With Pride", "Yass");
        model.addAttribute("events", events);
        return "events/index";

    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

    // lives at /events/create
//    @PostMapping("create")
//    public String createEvent(@RequestParam String eventName){
//        events.add(eventName);
//        return "redirect:";
//    }

}
