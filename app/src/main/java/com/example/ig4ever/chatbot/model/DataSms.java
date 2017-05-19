package com.example.ig4ever.chatbot.model;

/**
 * Created by ig4ever on 5/3/2017.
 */

public class DataSms {

    private String nama;
    private String pesan;
    private String waktu;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getNama() {   return nama;    }

    public void setNama(String nama) {  this.nama = nama;   }
}
