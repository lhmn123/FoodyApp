package hcmute.edu.vn.nhom07.foodyapp_group07;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StoreDatabaseHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "storeManager";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "stores";

    private static final String KEY_IMG = "storeImg";
    private static final String KEY_NAME = "storeName";
    private static final String KEY_RATE = "storeRate";
    private static final String KEY_REVIEWS = "storeReviews";
    private static final String KEY_ADDRESS = "storeAddress";
    private static final String KEY_DISTANCE = "storeDistance";
    private static final String KEY_DEAL = "isDeal";

    public StoreDatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
//    public StoreDatabaseHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
