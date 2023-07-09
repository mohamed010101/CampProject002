package tn.spring.campproject.Wiem.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.campproject.Entities.Espace;
import tn.spring.campproject.Wiem.Services.EspaceService;

import java.util.List;

@AllArgsConstructor
@RestController
public class EspaceController {
    private EspaceService espaceService;

    @GetMapping("/listEspace")
    @ResponseBody
    public List<Espace> getEspace(){
        List<Espace> espaceList = espaceService.retrieveAllEspace();
        return espaceList;
    }

    @PostMapping("/addEspace")
    public Espace addEspace(@RequestBody Espace e){
        return  espaceService.addEspace(e);

    }

    @RequestMapping("/updateEspace")
    public Espace updateEspace(@RequestBody Espace e){
        return  espaceService.updateEspace(e);
    }

    @DeleteMapping("/deletEspace/{id}")
    public void deleteEspace(@PathVariable Long id){
        espaceService.deleteEspace(id);
    }


}
