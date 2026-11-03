package com.example.pokoj;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface FilmyDAO {
    @Insert
    public void wstawDoBazyFilm(Film fim);
    @Insert
    public void wstawListeFilmowDoBazy(Film ... film);
    @Delete
    public void usunZBazy(Film film);
    @Update
    public void aktualizujFilmWBazi(Film film);

    @Query("Select * from filmy")
    public List<Film> zwrocWszystkieFilmyZBazy();

    @Query("Select tytul from filmy where rok>:rokParametr")
    public List<String> zwrocTytulyFilmowODanymRoku(int rokParametr);
}
