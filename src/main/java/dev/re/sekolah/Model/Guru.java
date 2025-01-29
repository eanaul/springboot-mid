package dev.re.sekolah.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "guru")
public class Guru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nuptk")
    private String nuptk;

    @Column(name = "name")
    private String name;

    @Column(name = "mapel")
    private String mapel;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
}
