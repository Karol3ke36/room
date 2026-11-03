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
}
