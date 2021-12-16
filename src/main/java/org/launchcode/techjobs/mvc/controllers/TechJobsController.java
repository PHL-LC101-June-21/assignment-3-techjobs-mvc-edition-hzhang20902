package org.launchcode.techjobs.mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");


    }

    @ModelAttribute("actions")

    public HashMap getActionChoices(HashMap actions){
        return actions;
    }

    @ModelAttribute("columns")

    public HashMap getColumnChoices(HashMap columns){
        return columns;
    }


}
