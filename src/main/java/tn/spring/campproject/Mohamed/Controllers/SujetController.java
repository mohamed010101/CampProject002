package tn.spring.campproject.Mohamed.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.campproject.Entities.Sujet;
import tn.spring.campproject.Mohamed.Services.ISujetServices;

import java.util.List;

@RestController
@RequestMapping("med")
public class SujetController {
    @Autowired
    ISujetServices sujetServices;
    @GetMapping("sujets")
    @ResponseBody
    public List<Sujet>getAllSujets(){
        return (List<Sujet>) sujetServices.GetAllSujets();
    }
    @PostMapping("add")
    @ResponseBody
    public Sujet addSujet(@RequestBody Sujet s) {return sujetServices.addSujet(s);}


    @DeleteMapping("/deleteSujet/{id}")
    public void deleteSujet(@PathVariable Integer id){
        sujetServices.deleteSujet(id);
    }




}
