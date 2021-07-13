package com.amartek.restful_demo.repository;

import java.util.List;

import com.amartek.restful_demo.entity.SewaDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SewaDetailRepository extends JpaRepository<SewaDetail, Long> {
    
    @Query(value =
        "SELECT "
        + " s.id, s.tglsewa, s.lamasewa, s.keterangan, "
        + " s.isbn, b.judul, b.pengarang, "
        + " s.pelangganid, p.kodepel, p.nama, p.telp, p.email "
        + "FROM Sewa s "
        + "INNER JOIN Pelanggan p ON s.pelangganid=p.id "
        + "INNER JOIN Buku b ON s.isbn=b.isbn "
        + "WHERE s.id=:idSewa", nativeQuery = true)
    public List<SewaDetail> getSewaDetailById(@Param("idSewa") Long idSewa);
}
