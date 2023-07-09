package tn.spring.campproject.Wiem.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.spring.campproject.Entities.Espace;
import tn.spring.campproject.Wiem.Repositories.IEspaceRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class EspaceService implements IEspaceService{

    private IEspaceRepo espaceRepo;
    @Override
    public List<Espace> retrieveAllEspace() {
        return espaceRepo.findAll();
    }

    @Override
    public Espace addEspace(Espace e) {
        return espaceRepo.save(e);
    }

    @Override
    public void deleteEspace(Long id) {
        espaceRepo.deleteById(id);

    }
    @Override
    public Espace updateEspace(Espace e) {
        return espaceRepo.save(e);
    }
}
