package tn.spring.campproject.Mohamed.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.campproject.Entities.Sujet;
import tn.spring.campproject.Mohamed.Repositories.ISujetRepository;

import java.util.List;

@Service
public class SujetServicesImpl implements ISujetServices {
    @Autowired
public ISujetRepository sujetRepository;
    @Override
    public List<Sujet> GetAllSujets() {
        return sujetRepository.findAll();
    }

    @Override
    public Sujet addSujet(Sujet s) {
        return (Sujet) sujetRepository.save(s);
    }

    @Override
    public void deleteSujet(Integer id) {

        sujetRepository.deleteById(id);
    }

}
