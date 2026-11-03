package com.example.pokoj;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Film.class}, version = 1)
public abstract class FilmyDataBase extends RoomDatabase {
    public abstract FilmyDAO zwrocFilmyDAO();
}
