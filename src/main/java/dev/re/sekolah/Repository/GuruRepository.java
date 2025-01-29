package dev.re.sekolah.Repository;

import dev.re.sekolah.Model.Guru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuruRepository extends JpaRepository<Guru, Integer> {
}
