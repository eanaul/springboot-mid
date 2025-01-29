package dev.re.sekolah.Service;

import dev.re.sekolah.Model.Guru;
import dev.re.sekolah.Repository.GuruRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuruService {
    private final GuruRepository guruRepository;

    public List<Guru> findAll()
    {
        return guruRepository.findAll();
    }

    public Guru createGuru(Guru guru)
    {
        return guruRepository.save(guru);
    }

    public Guru findGuruById(Integer id)
    {
        return guruRepository.findById(id).orElseThrow();
    }

    public void deleteGuruById(Integer id)
    {
        guruRepository.deleteById(id);
    }
}
