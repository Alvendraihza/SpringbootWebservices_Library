package com.amartek.restful_demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Sewa {
    @Id
    @SequenceGenerator(name = "SEWA_SEQ", allocationSize = 1)                     
    @GeneratedValue(generator = "SEWA_SEQ", strategy = GenerationType.SEQUENCE)    
    private Long ID;

    @Column(nullable = false)    
    private String ISBN;

    @Column(nullable = false)
    private Long PELANGGANID;
    
    @Column(nullable = false)
    private Date TGLSEWA;
    
    @Column(nullable = false)
    private int LAMASEWA;
    
    private String KETERANGAN;

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Long getPELANGGANID() {
        return this.PELANGGANID;
    }

    public void setPELANGGANID(Long PELANGGANID) {
        this.PELANGGANID = PELANGGANID;
    }

    public Date getTGLSEWA() {
        return this.TGLSEWA;
    }

    public void setTGLSEWA(Date TGLSEWA) {
        this.TGLSEWA = TGLSEWA;
    }

    public int getLAMASEWA() {
        return this.LAMASEWA;
    }

    public void setLAMASEWA(int LAMASEWA) {
        this.LAMASEWA = LAMASEWA;
    }

    public String getKETERANGAN() {
        return this.KETERANGAN;
    }

    public void setKETERANGAN(String KETERANGAN) {
        this.KETERANGAN = KETERANGAN;
    }

}

