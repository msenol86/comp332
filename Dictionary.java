import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class Dictionary extends SQLiteOpenHelper {

	//database name
	public static final String databaseName = "dictionary.db";
	public static int SURUM = 1 ;
	//table name
	public static final String tableName = "ing_turk";
	//column names
	public static final String Word_id = "Word_id";
	public static final String T_W = "Turkish_word";
	public static final String I_W = "inglish_word";
	
	//creation of the table 
	public static final String Create_Table_Dictionary = "create_table" 
	+ tableName
	+ " ( " + Word_id + "integer primery key autoincrement," 
	+ T_W + "text," 
	+ I_W + "text);";

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(Create_Table_Dictionary);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS tableName");
		onCreate(db);
		// TODO Auto-generated method stub
	}
	
	public Dictionary(Context cnn){
		super(cnn,databaseName,null,SURUM);
	}
	
	public void gir(SQLiteDatabase db){
	final String insert_data = "INSERT  INTO ing_turk VALUES (1 ,'elma' , 'apple')";
	db.execSQL(insert_data);
	}
}
