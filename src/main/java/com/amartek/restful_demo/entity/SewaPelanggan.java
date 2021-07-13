package com.amartek.restful_demo.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
// import javax.persistence.Table;

@Entity
// @Table(name = "sewa")
public class SewaPelanggan {
    @Id
    @SequenceGenerator(name = "SEWA_SEQ", allocationSize = 1)                     
    @GeneratedValue(generator = "SEWA_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "ISBN")
    private String isbn;
    
    @Column(name = "PELANGGANID")
    private Long pelangganid;

    @Column(name = "TGLSEWA")
    private Date tglsewa;

    @Column(name = "LAMASEWA")
    private int lamasewa;

    @Column(name = "KETERANGAN")
    private String keterangan;

    @OneToMany(targetEntity = PelangganSewa.class, mappedBy = "id", fetch = FetchType.LAZY, orphanRemoval = false)
    private Set<PelangganSewa> pelangganSewas;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getPelangganid() {
        return this.pelangganid;
    }

    public void setPelangganid(Long pelangganid) {
        this.pelangganid = pelangganid;
    }

    public Date getTglsewa() {
        return this.tglsewa;
    }

    public void setTglsewa(Date tglsewa) {
        this.tglsewa = tglsewa;
    }

    public int getLamasewa() {
        return this.lamasewa;
    }

    public void setLamasewa(int lamasewa) {
        this.lamasewa = lamasewa;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Set<PelangganSewa> getPelangganSewas() {
        return this.pelangganSewas;
    }

    public void setPelangganSewas(Set<PelangganSewa> pelangganSewas) {
        this.pelangganSewas = pelangganSewas;
    }

}