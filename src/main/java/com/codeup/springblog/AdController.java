package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {
    // Set the property there
    private final AdRepository adDao;

    //Set the constructor
    public AdController(AdRepository adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ads", adDao.findAll());// find all method to display all of the ads from the Databases.
        model.addAttribute("topAd", adDao.findByTitle("bicycle north side"));
        model.addAttribute("searchAd", adDao.findByTitleLike("%childcare"));
        //ALSO you can use the other methods to do the crud action
        return "adindex";// Make sure that this return to the correct html file
    }
}

/*
INSERT INTO ads(description, title) VALUES ('slightly used bike', 'bicycle north side'), ('brand new fridge - smaller than expected, want a new one', 'fridge military / 410 area'), ('CHILDCARE SERVICES FROM RITA - 20 YEARS IN BUSINESS - HOME ENIVRONMENT WITH AMPLE ATTENTION AND CARE', 'home childcare services needed? click!');

This is what is used to insert properties in the tables.
 */