package com.example.pokoj;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "filmy")
public class Film {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String tytul;
    @ColumnInfo(name = "rok")
    private int rokProdukcji;
    private String kategoria;

    public Film(String tytul, int rokProdukcji, String kategoria) {
        this.tytul = tytul;
        this.rokProdukcji = rokProdukcji;
        this.kategoria = kategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public Film() {
    }
}
