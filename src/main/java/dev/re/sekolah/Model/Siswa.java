package dev.re.sekolah.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "siswa")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Siswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nama")
    private String name;

    @Column(name = "rombel")
    private String rombel;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
}
