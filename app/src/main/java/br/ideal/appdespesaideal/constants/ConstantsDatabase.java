package br.ideal.appdespesaideal.constants;

/**
 *      Criado por Claudio Gonçalves em 06/01/2018.
 */

public class ConstantsDatabase {

    public static final String DATABASE_NAME = "DB_DESPESA_IDEAL";

    public static final Integer DATABASE_VERSION = 1;

    public static final String TABLE_NAME_DESPESA = "TB_DESPESA";
    public static final String CREATE_TABLE_DESPESA = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME_DESPESA + " ( codigo INTEGER PRIMARY KEY AUTOINCREMENT, descricao TEXT, tipo_despesa TEXT, valor TEXT, data TEXT )";
    public static final String INSERT_TABLE_DESPESA = "INSERT INTO ";
    public static final String DELETE_TABLE_DESPESA = "DELETE " + TABLE_NAME_DESPESA + " ";
    public static final String DROP_TABLE_DESPESA = "DROP TABLE " + TABLE_NAME_DESPESA;
}
