package com.example.bankingapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String Dbname = "Main_data.db";
    public static final String table_name_1 = "Dummy_data";
    public static final String table_name_2 = "History_data";
    public DatabaseHelper(Context context)
    {
        super(context,Dbname,null,1);
        SQLiteDatabase db = this.getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String create_table_1 = "CREATE TABLE "+table_name_1+" (acno INTEGER PRIMARY KEY, name TEXT, email TEXT, mob_no INTEGER, balance INTEGER)";
        String create_table_2 = "CREATE TABLE "+table_name_2+" (transact_id INTEGER PRIMARY KEY AUTOINCREMENT,from_acno INTEGER, from_user TEXT, to_user TEXT, amount INTEGER, time TEXT)";
        db.execSQL(create_table_1);
        db.execSQL(create_table_2);
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(7860976, 'Oswin Anthony', 'oswin@gmail.com', 9111179167, 15000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(3872462, 'Aaron Biswas', 'aaron@gmail.com', 8995601238, 5000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(5882395, 'Piyush Srivastava', 'piyush@gmail.com', 7595645896, 10000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(8252458, 'Rohan Jain', 'rohan@gmail.com', 9995640038, 8000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(1424210, 'Ashu Verma', 'ashu@gmail.com', 9095648962, 7500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(8579029, 'Qunal Verma', 'qunal@gmail.com', 8855640238, 6500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(3606498, 'Sadiq Ali', 'sadiq@gmail.com', 8895640215, 4500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(7800253, 'Basil Victor', 'basil@gmail.com', 9985021539, 2500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(4531262, 'Shaik Akbar', 'akbar@gmail.com', 9309565238, 10500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(3002365, 'Muskaan Sharma', 'muskaan@gmail.com', 8292591201, 9900)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(7860975, 'Luna Anthony', 'luna@gmail.com', 9117417916, 15000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(3282462, 'Ayush Singh', 'ayush@gmail.com', 9725601238, 5000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(1042395, 'Guneet Kapoor', 'guneet@gmail.com', 7598252296, 10000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(8082458, 'Clara Masih', 'rohan@gmail.com', 7695640038, 8000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(1424900, 'Cecil Anthony', 'cecil@gmail.com', 9252238962, 60000)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(8523829, 'Robin Zakaria', 'robin@gmail.com', 9999928611, 6500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(8641298, 'Nelson Desouza', 'nelson@gmail.com', 87275272263, 4500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(8899253, 'Martinez Romero', 'martinez@gmail.com', 82531728221, 2500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(1234962, 'Alex Desouza', 'alex@gmail.com', 93925221854, 10500)");
        db.execSQL("INSERT INTO " + table_name_1 + " VALUES(3842265, 'Neha Singh', 'neha@gmail.com', 89385364292, 9900)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {
        db.execSQL("DROP TABLE IF EXISTS " + table_name_1);
        onCreate(db);
    }
    public Boolean insert_history(int ac_no, String sender_na, String receiver_na, int amt, String tm)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("from_acno", ac_no);
        contentValues.put("from_user", sender_na);
        contentValues.put("to_user", receiver_na);
        contentValues.put("amount", amt);
        contentValues.put("time", tm);
        long result = db.insert(table_name_2,null,contentValues);
        return result != -1;
    }
    public Boolean update_main(int amt, String na)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("balance", amt);
        db.update(table_name_1, contentValues, "name = ?", new String[] {na});
        return true;
    }
}