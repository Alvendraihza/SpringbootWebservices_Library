package com.amartek.restful_demo.repository;

import com.amartek.restful_demo.entity.PelangganSewa;
// import com.amartek.restful_demo.entity.SewaPelanggan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SewaPelangganRepository extends JpaRepository<PelangganSewa, Long> {
    
}
