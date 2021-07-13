package com.amartek.restful_demo.controller;

import java.util.List;

import com.amartek.restful_demo.entity.PelangganSewa;
import com.amartek.restful_demo.entity.Sewa;
import com.amartek.restful_demo.entity.SewaDetail;
// import com.amartek.restful_demo.entity.SewaPelanggan;
import com.amartek.restful_demo.service.SewaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sewa")
public class SewaController {
    private SewaService sewaService;

    //Constructor
    public SewaController(SewaService sewaService) {
        this.sewaService = sewaService;
    }

    @GetMapping("/gets")
    public List<Sewa> getAll() {
        return sewaService.getAll();
    }

    @GetMapping("/getsid/{idSewa}")
    public Sewa get(@PathVariable final Long idSewa) {
        return sewaService.getById(idSewa);
    }

    @GetMapping("/getdetailarray/{idSewa}")
    public List<Object[]> getSewaDetailArrayById (@PathVariable final Long idSewa) {
        return sewaService.getSewaDetailArrayById(idSewa);
    }

    @GetMapping("/getdetail/{idSewa}")
    public List<SewaDetail> getSewaDetailById (@PathVariable final Long idSewa) {
        return sewaService.getSewaDetailById(idSewa);
    }

    @GetMapping("/pelanggan/")
    public List<PelangganSewa> getAllSewaPelanggan () {
        return sewaService.getAllSewaPelanggan();
    }

    @PostMapping("/create")
    public void createSewa(@RequestBody final Sewa sewa) {
        sewaService.save(sewa);
    }

    @DeleteMapping("/delete/{idSewa}")
    public void deleteSewa(@PathVariable final Long idSewa) {
        sewaService.delete(idSewa);
    }

}