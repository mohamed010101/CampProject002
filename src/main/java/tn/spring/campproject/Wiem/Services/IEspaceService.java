package tn.spring.campproject.Wiem.Services;

import org.springframework.web.multipart.MultipartFile;
import tn.spring.campproject.Entities.Espace;

import java.util.List;

public interface IEspaceService {

    List<Espace> retrieveAllEspace();

    Espace addEspace(MultipartFile file, Espace e);

    void deleteEspace(Long id);

    Espace updateEspace(Espace e);
}
