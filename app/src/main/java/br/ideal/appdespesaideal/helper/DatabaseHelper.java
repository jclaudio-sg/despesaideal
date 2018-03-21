package br.ideal.appdespesaideal.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.ideal.appdespesaideal.constants.ConstantsDatabase;

/**
 *      Criado por Claudio Gonçalves em 07/01/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static DatabaseHelper instance;

    public static DatabaseHelper getInstance(Context context) {
        if( instance == null ) {
            instance = new DatabaseHelper(context);
        }
        return instance;
    }

    private DatabaseHelper(Context context) {
        super(context, ConstantsDatabase.DATABASE_NAME, null, ConstantsDatabase.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL( ConstantsDatabase.CREATE_TABLE_DESPESA );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL( ConstantsDatabase.DROP_TABLE_DESPESA );
        onCreate(db);
    }
}
