package com.idnp.lab07_idnp_sqlite.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.idnp.lab07_idnp_sqlite.User;

public class UsersDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=1;
    public static final String CREATE_DATABASE = "CREATE TABLE "+ UsersContract.UserEntry.TABLE_NAME+" ("
            + UsersContract.UserEntry._ID+ "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.UserEntry.ID+ "TEXT NOT NULL,"
            + UsersContract.UserEntry.NAME+ "TEXT NOT NULL,"
            + UsersContract.UserEntry.LASTNAME+ "TEXT NOT NULL,"
            + UsersContract.UserEntry.DNI+ "TEXT NOT NULL,"
            + UsersContract.UserEntry.EMAIL+ "TEXT NOT NULL,"
            + UsersContract.UserEntry.PHONE_NUMBER+ "TEXT NOT NULL,"
            + UsersContract.UserEntry.BIRTH_DATE+ "TEXT NOT NULL,"
            + "UNIQUE (" + UsersContract.UserEntry.ID + "))";
    public static final String DATABASE_NAME="Users.db";

    public UsersDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(CREATE_DATABASE);
        ContentValues contentValues= new ContentValues();

        //Creando pares clave valor para insertar datos
        contentValues.put(UsersContract.UserEntry.ID,"U-001");
        contentValues.put(UsersContract.UserEntry.ID,"Cosme");
        contentValues.put(UsersContract.UserEntry.ID,"Fulanito Simpson");
        contentValues.put(UsersContract.UserEntry.ID,"74587845");
        contentValues.put(UsersContract.UserEntry.ID,"micorreo@gmail.com");
        contentValues.put(UsersContract.UserEntry.ID,"968574578");
        contentValues.put(UsersContract.UserEntry.ID,"01-05-1995");

        //insertar objeto
        sqLiteDatabase.insert(UsersContract.UserEntry.TABLE_NAME,null,contentValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public long saveUser(User user){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.insert(UsersContract.UserEntry.TABLE_NAME,null,user.toContentValues());
    }

    public Cursor getAllUsers(){
        return getReadableDatabase().query(UsersContract.UserEntry.TABLE_NAME,null,null,null,null,null,null,null);
    }

    public Cursor getUserById(String userId){
        Cursor cursor = getReadableDatabase().query(
                UsersContract.UserEntry.TABLE_NAME,
                null,
                UsersContract.UserEntry.ID + " LIKE ?",
                new String[]{userId},null,null,null);
        return cursor;
    }

}
