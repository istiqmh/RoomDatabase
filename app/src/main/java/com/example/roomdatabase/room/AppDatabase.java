package com.example.roomdatabase.room;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.nio.file.attribute.UserDefinedFileAttributeView;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MahasiswaDao MahasiswaDao();

    private AppDatabase db;

    db = Room.databaseBuilder(getApplicationContext(),
    AppDatabase.class,"mahasiswadb").build();


    private void onDeleteMahasiswa (int position){
        db.MahasiswaDao().deleteUsers(daftarmahasiswa.get(position));
        daftaruser.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeRemoved(position, daftarBarang.size());
    }
    }
}
