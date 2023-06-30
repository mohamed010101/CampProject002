package tn.spring.campproject.sywar.Controllers;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.spring.campproject.Entities.Produits;
import tn.spring.campproject.sywar.Services.IProduitServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("Produits")
@RestController
public class ProduitController {

    @Autowired
    public IProduitServiceImpl iProduitServiceImpl;
    @Operation(description = "Ajouter un produit")
    @PostMapping("/AddProduct")
    public Produits AddProduct(@RequestParam("file") MultipartFile file, @RequestParam("produit") String produitJson) {
        Produits produit = new Gson().fromJson(produitJson, Produits.class);
        return iProduitServiceImpl.addProduits(file, produit);
    }

    @Operation(description = "Retourner tous les produits")
    @GetMapping("GetAllProducts")
    public List<Produits> GetAllProducts() {
        return iProduitServiceImpl.GetAllProducts();
    }
    @Operation(description = "Supprimer un produit")
    @DeleteMapping("/{id}")
    public void DeleteProduct(@PathVariable Integer id) {
        iProduitServiceImpl.deleteProduits(id);
    }
    @Operation(description = "Modifier un produit")
    @PutMapping("UpdateProduct")
    public Produits UpdateProduct(@RequestBody Produits produit) {
        Produits P1 =  iProduitServiceImpl.updateProduits(produit);
        return P1;
    }


    @Operation(description = "Retourner un produit")
    @GetMapping("/Get/{id}")
    public Produits GetProduct(@PathVariable("id") Integer id) {
        return iProduitServiceImpl.GetProduit(id);
    }
}
