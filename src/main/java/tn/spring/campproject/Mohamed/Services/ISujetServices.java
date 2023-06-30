package tn.spring.campproject.Mohamed.Services;

import tn.spring.campproject.Entities.Sujet;

import java.util.List;

public interface ISujetServices {

    List <Sujet> GetAllSujets();
    Sujet addSujet(Sujet s);
    void deleteSujet(Integer id);


}
