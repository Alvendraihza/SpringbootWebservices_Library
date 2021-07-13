package com.amartek.restful_demo.service;

import java.util.List;
import java.util.Optional;

import com.amartek.restful_demo.entity.PelangganSewa;
import com.amartek.restful_demo.entity.Sewa;
import com.amartek.restful_demo.entity.SewaDetail;
// import com.amartek.restful_demo.entity.SewaPelanggan;
import com.amartek.restful_demo.repository.SewaDetailRepository;
import com.amartek.restful_demo.repository.SewaPelangganRepository;
import com.amartek.restful_demo.repository.SewaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class SewaService {
    @Autowired
    private SewaRepository sewaRepository;

    @Autowired
    private SewaDetailRepository sewaDetailRepository;

    @Autowired
    private SewaPelangganRepository sewaPelangganRepository;

    public List<Sewa> getAll() {
        return sewaRepository.findAll();
    }

    public Sewa getById(Long idSewa) {
        Optional<Sewa> sewaOptional = sewaRepository.findById(idSewa);

        if(sewaOptional.isPresent()){
            return sewaOptional.get();
		}
		else {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SEWA TIDAK DITEMUKAN !");
		}
    }

    public void save(Sewa sewa) {
        Optional<Sewa> sewaOptional = sewaRepository.findByISBN(sewa.getISBN());

        if (sewaOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "TELAH DITEMUKAN KESAMAAN PADA DATA ISBN !");
        }
        else {
            sewaRepository.save(sewa);
            throw new ResponseStatusException(HttpStatus.OK, "DATA TELAH BERHASIL DITAMBAHKAN !");
        }
    }

    public void delete(Long idSewa) {
        Optional<Sewa> sewaOptional = sewaRepository.findById(idSewa);

        if(sewaOptional.isPresent()){
            sewaRepository.deleteById(idSewa);
			throw new ResponseStatusException(HttpStatus.OK, "DATA TELAH BERHASIL DIHAPUS !");
		}
		else {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SEWA TIDAK DITEMUKAN !");
		}
    }

    public List<PelangganSewa> getAllSewaPelanggan() {
        List<PelangganSewa> result = sewaPelangganRepository.findAll();
        return result;
    }

    public List<SewaDetail> getSewaDetailById(Long idSewa) {
        List<SewaDetail> result = sewaDetailRepository.getSewaDetailById(idSewa);
        
        if (result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Sewa tidak ada!");
        }

        return result;
    }

    public List<Object[]> getSewaDetailArrayById(Long idSewa) {
        List<Object[]> result = sewaRepository.getSewaDetailById(idSewa);
        
        if (result.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Sewa tidak ada!");
        }

        return result;
    }
}