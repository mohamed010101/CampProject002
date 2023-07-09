package tn.spring.campproject.Wiem.Services;

import tn.spring.campproject.Entities.Espace;

import java.util.List;

public interface IEspaceService {

    List<Espace> retrieveAllEspace();

    Espace addEspace(Espace e);

    void deleteEspace(Long id);

    Espace updateEspace(Espace e);
}
