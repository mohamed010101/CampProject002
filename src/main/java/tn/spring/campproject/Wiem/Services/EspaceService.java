package tn.spring.campproject.Wiem.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import tn.spring.campproject.Entities.Espace;
import tn.spring.campproject.Wiem.Repositories.IEspaceRepo;

import java.io.IOException;
import java.util.Base64;
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
    public Espace addEspace(MultipartFile file, Espace espace) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if(fileName.contains(".."))
        {
            System.out.println("not a a valid file");
        }
        try {
            espace.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return espaceRepo.save(espace);
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
