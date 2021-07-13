package com.amartek.restful_demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sewa")
public class SewaDetail {
    @Id
    @SequenceGenerator(name = "SEWA_SEQ", allocationSize = 1)                     
    @GeneratedValue(generator = "SEWA_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TGLSEWA")
    private Date tglsewa;

    @Column(name = "LAMASEWA")
    private int lamasewa;

    @Column(name = "KETERANGAN")
    private String keterangan;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "JUDUL")
    private String judul;

    @Column(name = "PENGARANG")
    private String pengarang;

    @Column(name = "PELANGGANID")
    private Long pelangganid;

    @Column(name = "KODEPEL")
    private String kodepel;

    @Column(name = "NAMA")
    private String nama;

    @Column(name = "TELP")
    private String telp;

    @Column(name = "EMAIL")
    private String email;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public Long getPelangganid() {
        return this.pelangganid;
    }

    public void setPelangganid(Long pelangganid) {
        this.pelangganid = pelangganid;
    }

    public String getKodepel() {
        return this.kodepel;
    }

    public void setKodepel(String kodepel) {
        this.kodepel = kodepel;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return this.telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
