package com.amartek.restful_demo.entity;

// import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
// import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
// @Table(name = "pelanggan")
public class PelangganSewa {    
    @Id
    @SequenceGenerator(name = "PELANGGAN_SEQ", allocationSize = 1)                     
    @GeneratedValue(generator = "PELANGGAN_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;
    
    @Column(nullable = false, name = "NAMA")
    private String nama;
    
    @Column(nullable = false, name = "ALAMAT")
    private String alamat;

    @Column(nullable = true, name = "TELP")
    private String telp;

    @Column(nullable = false, name = "JK")
    private String jk;
    
    @Column(nullable = false, name = "EMAIL")
    private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pelangganid", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private SewaPelanggan sewaPelanggan;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return this.telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getJk() {
        return this.jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SewaPelanggan getSewaPelanggan() {
        return this.sewaPelanggan;
    }

    public void setSewaPelanggan(SewaPelanggan sewaPelanggan) {
        this.sewaPelanggan = sewaPelanggan;
    }

}