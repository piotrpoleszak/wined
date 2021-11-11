package com.application.wined.controller;

import com.application.wined.entity.Wine;
import com.application.wined.service.WineService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WineController
{

    private WineService wineService;

    public WineController(WineService wineService)
    {
        super();
        this.wineService = wineService;
    }

    @GetMapping("/wines")
    public String listWines(Model model)
    {
        model.addAttribute("wines", wineService.getAllWines());
        return "wine";
    }

    @GetMapping("/wines/new")
    public String createWineForm(Model model)
    {
        Wine wine = new Wine();
        model.addAttribute("wine", wine);
        return "create_wine";

    }

    @PostMapping("/wines")
    public String saveWine(@ModelAttribute("wine") Wine wine) {
        wineService.saveWine(wine);
        return "redirect:/wines";
    }

    @GetMapping("/wines/edit/{id}")
    public String editWineForm(@PathVariable Long id, Model model)
    {
        model.addAttribute("wine", wineService.getWineById(id));
        return "edit_wine";
    }

    @PostMapping("/wines/{id}")
    public String updateWine(@PathVariable Long id, @ModelAttribute("wine") Wine wine, Model model)
    {
        Wine existingWine = wineService.getWineById(id);
        existingWine.setId(id);
        existingWine.setName(wine.getName());
        existingWine.setColor(wine.getColor());
        existingWine.setVintage(wine.getVintage());
        existingWine.setCountry(wine.getCountry());
        existingWine.setStrain(wine.getStrain());
        existingWine.setRating(wine.getRating());

        wineService.updateWine(existingWine);
        return "redirect:/wines";
    }

    @GetMapping("/wines/{id}")
    public String deleteWine(@PathVariable Long id) {
        wineService.deleteWineById(id);
        return "redirect:/wines";
    }
}
