/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

/**
 *
 * @author LENOVO
 */
public class Produk {
    private int id;
    private String nama;
    private long harga;
    private int jumlah;

    public Produk(int id, String nama, long harga, int jumlah ) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getHarga() {
        return harga;
    }
    public void setHarga(long harga) {
        this.harga = harga;
    }

    public int getjumlah() {
        return jumlah;
    }
    public void setjumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

