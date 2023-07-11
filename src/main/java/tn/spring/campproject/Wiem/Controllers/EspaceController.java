package tn.spring.campproject.Wiem.Controllers;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.spring.campproject.Entities.Espace;
import tn.spring.campproject.Entities.Produits;
import tn.spring.campproject.Wiem.Services.EspaceService;

import java.util.List;

@CrossOrigin(origins = "*")
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
    public Espace addEspace(@RequestParam("file") MultipartFile file, @RequestParam("espace") String espaceJson){
        Espace espace = new Gson().fromJson(espaceJson, Espace.class);
        return espaceService.addEspace(file, espace);

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
