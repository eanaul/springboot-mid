package dev.re.sekolah.Controller;

import dev.re.sekolah.Model.Siswa;
import dev.re.sekolah.Service.SiswaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/siswa")
public class SiswaController {
    private final SiswaService siswaService;

    @GetMapping("/create")
    public String createSiswa(Model model){
        Siswa siswa = new Siswa();
        model.addAttribute("dataSiswa", siswa);

        return "siswa/create";
    }

    @PostMapping
    public String saveSiswa(@ModelAttribute Siswa siswa){
        siswaService.createSiswa(siswa);
        return "redirect:/siswa/";
    }

    @GetMapping("/")
    public String listSiswa(Model model){
        model.addAttribute("dataSiswa", siswaService.listOfSiswa());

        return "siswa/index";
    }

    @GetMapping("/edit/{id}")
    public String editSiswa(@PathVariable Integer id, Model model){
        model.addAttribute("dataSiswa", siswaService.findSiswaById(id));
        return "siswa/update";
    }

    @PostMapping("/update/{id}")
    public String updateSiswa(@PathVariable Integer id, @ModelAttribute Siswa siswa){
        siswa.setId(id);
        siswaService.createSiswa(siswa);
        return "redirect:/siswa/";
    }

    @GetMapping("/delete/{id}")
    public String deleteSiswa(@PathVariable Integer id){
        siswaService.deleteSiswaById(id);
        return "redirect:/siswa/";
    }


}
