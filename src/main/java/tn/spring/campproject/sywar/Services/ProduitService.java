package tn.spring.campproject.sywar.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import tn.spring.campproject.Entities.Produits;
import tn.spring.campproject.sywar.Repositories.IProduitsRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@Service
public class ProduitService implements IProduitServiceImpl {
    public IProduitsRepository iProduitsRepository;

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Produits> GetAllProducts() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Produits> cq = cb.createQuery(Produits.class);
        Root<Produits> root = cq.from(Produits.class);
        cq.select(root);
        TypedQuery<Produits> query = entityManager.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public Produits addProduits(MultipartFile file, Produits produit) {
        produit.setDateCreation(new Date());
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if(fileName.contains(".."))
        {
            System.out.println("not a a valid file");
        }
        try {
            produit.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(produit.getPrix());
        return iProduitsRepository.save(produit);
    }

    @Override
    public void deleteProduits(Integer id) {
        iProduitsRepository.deleteById(id);
    }

    @Override
    public Produits updateProduits(Produits produit) {
        return iProduitsRepository.save(produit);
    }

    @Override
    public Produits GetProduit(Integer id) {
        return iProduitsRepository.findById(id).get();
    }
}
