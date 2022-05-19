package hcmute.edu.vn.nhom07.foodyapp_group07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private SQLiteDatabase db;

    Button signIn_btn, skip_btn;
    TextView txt_signUp;

//    ListView lvMonAnTrongGioHang;
//    ArrayList<MonAnTrongGioHang> mangMonAnTrongGioHang;

//    private void initData() {
//        db = openOrCreateDatabase("foody.db", MODE_PRIVATE, null);
//
//        String sqlStore = "CREATE TABLE IF NOT EXISTS tbStore (storeID INTEGER PRIMARY KEY, storeName TEXT, storeImg TEXT, storeRate REAL, storeReviews INTEGER, storeAddress TEXT, storeDistance REAL, isDeal NUMERIC)";
//        db.execSQL(sqlStore);
//    }
//
//    private void insertTest(){
//        String dataStore1 = "INSERT INTO tbStore(storeID, storeName, storeImg, storeRate, storeReviews, storeAddress, storeDistance, isDeal) VALUES (\"K-Food Chicken\", \"@drawable/img_chicken\", 4.5, 500, \"106 Tô Vĩnh Diện, Linh Trung, Thủ Đức, TP.Hồ Chí Minh\", 1.9, 1)";
//        db.execSQL(dataStore1);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initData();
//        insertTest();

        signIn_btn = (Button) findViewById(R.id.signIn_btn);
        skip_btn = (Button) findViewById(R.id.skip_btn);
        txt_signUp = (TextView) findViewById(R.id.txt_signUp);

        txt_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

        signIn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignIn.class);
                startActivity(intent);
            }
        });

        skip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });




//        lvMonAnTrongGioHang = (ListView) findViewById(R.id.listViewMonAnTrongGioHang);
//        mangMonAnTrongGioHang = new ArrayList<MonAnTrongGioHang>();
//
//        mangMonAnTrongGioHang.add(new MonAnTrongGioHang(1,"Cơm ốp la xúc xích kim chi sốt Gojuchang", 50000));
//        mangMonAnTrongGioHang.add(new MonAnTrongGioHang(2,"Kimbap chiên xù", 30000));
//        mangMonAnTrongGioHang.add(new MonAnTrongGioHang(1,"Chả cá hàn quốc", 20000));
//
//        MonAnTrongGioHangAdapter anAdapter = new MonAnTrongGioHangAdapter(
//                MainActivity.this,
//                R.layout.dong_mon_an_trong_gio_hang,
//                mangMonAnTrongGioHang
//        );
//
//        lvMonAnTrongGioHang.setAdapter(anAdapter);

    }
}