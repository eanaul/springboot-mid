package dev.re.sekolah.Service;

import dev.re.sekolah.Model.Siswa;
import dev.re.sekolah.Repository.SiswaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SiswaService {
    private final SiswaRepository siswaRepository;

    public Siswa createSiswa(Siswa siswa)
    {
        return siswaRepository.save(siswa);
    }

    public List<Siswa> listOfSiswa(){
        return siswaRepository.findAll();
    }

    public Siswa findSiswaById(Integer id)
    {
        return siswaRepository.findById(id).orElseThrow();
    }

    public void deleteSiswaById(Integer id) {
        siswaRepository.deleteById(id);
    }
}
