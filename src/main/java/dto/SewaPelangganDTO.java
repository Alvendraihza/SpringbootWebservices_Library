package dto;

import java.sql.Date;

public class SewaPelangganDTO {
    private String isbn;
    private String judul;
    private String nama;
    private Date tglsewa;
    private int lamasewa;
    private String keterangan;

    public SewaPelangganDTO(String isbn, String judul, String nama, Date tglsewa, int lamasewa, String keterangan) {
        this.isbn = isbn;
        this.judul = judul;
        this.nama = nama;
        this.tglsewa = tglsewa;
        this.lamasewa = lamasewa;
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

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    @Override
    public String toString() {
        return "{" +
            " isbn='" + getIsbn() + "'" +
            ", judul='" + getJudul() + "'" +
            ", nama='" + getNama() + "'" +
            ", tglsewa='" + getTglsewa() + "'" +
            ", lamasewa='" + getLamasewa() + "'" +
            ", keterangan='" + getKeterangan() + "'" +
            "}";
    }

}
