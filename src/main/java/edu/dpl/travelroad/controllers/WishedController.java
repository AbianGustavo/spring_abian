package edu.dpl.travelroad.controllers;

import edu.dpl.travelroad.models.Place;
import edu.dpl.travelroad.repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishedController {
    private final PlaceRepository placeRepository;

    @Autowired
    public WishedController(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @GetMapping("/wished")
    public String wished(Model model) {
        model.addAttribute("wished", placeRepository.findByVisited(false));
        return "wished";
    }
}
