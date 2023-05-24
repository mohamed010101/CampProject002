package tn.spring.campproject.sywar.Services;

import org.springframework.web.multipart.MultipartFile;
import tn.spring.campproject.Entities.Produits;

import java.util.List;

public interface IProduitServiceImpl {

    List<Produits> GetAllProducts();
    Produits addProduits(MultipartFile file, Produits c);
    void deleteProduits(Integer id);
    Produits updateProduits(Produits produit);
    Produits GetProduit(Integer id);
}
