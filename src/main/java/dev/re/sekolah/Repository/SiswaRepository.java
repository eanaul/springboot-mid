package dev.re.sekolah.Repository;

import dev.re.sekolah.Model.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiswaRepository extends JpaRepository<Siswa, Integer> {
}
