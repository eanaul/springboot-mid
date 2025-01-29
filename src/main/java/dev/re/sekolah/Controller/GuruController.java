package dev.re.sekolah.Controller;

import dev.re.sekolah.Model.Guru;
import dev.re.sekolah.Service.GuruService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;

import java.util.List;

@Controller
@RequestMapping("/guru")
@RequiredArgsConstructor
public class GuruController {
    private final GuruService guruService;

    @GetMapping("/create")
    public String createGuru(Model model)
    {
        Guru guru = new Guru();
        List<String> mapels = Arrays.asList("Matematika", "Bahasa Indonesia", "Bahasa Inggris", "IPA", "IPS", "KAPROG");
        model.addAttribute("dataMapel", mapels);
        model.addAttribute("dataGuru", guru);
        return "guru/create";
    }

    @PostMapping
    public String saveGuru(@ModelAttribute Guru guru)
    {
        guruService.createGuru(guru);
        return "redirect:/guru/";
    }

    @GetMapping("/")
    public String listGuru(Model model)
    {
        model.addAttribute("dataGuru", guruService.findAll());
        return "guru/index";
    }

    @GetMapping("/edit/{id}")
    public String editGuru(@PathVariable Integer id, Model model)
    {
        model.addAttribute("dataGuru", guruService.findGuruById(id));
        List<String> mapels = Arrays.asList("Matematika", "Bahasa Indonesia", "Bahasa Inggris", "IPA", "IPS", "KAPROG");
        model.addAttribute("dataMapel", mapels);
        return "guru/update";
    }

    @PostMapping("/update/{id}")
    public String updateGuru(@PathVariable Integer id, @ModelAttribute Guru guru)
    {
        guru.setId(id);
        guruService.createGuru(guru);
        return "redirect:/guru/";
    }

    @GetMapping("/delete/{id}")
    public String deleteGuru(@PathVariable Integer id){
        guruService.deleteGuruById(id);
        return "redirect:/guru/";
    }

}
