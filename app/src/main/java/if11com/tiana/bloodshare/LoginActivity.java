package if11com.tiana.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// NIM      : 10116473
// Nama     : Tian Anugerah Mulyana
// Kelas    : IF 11 - AKB 11
// Pemuatan : 19-4-19

public class LoginActivity extends AppCompatActivity {

    Button connectFB;
    TextView regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        connectFB = (Button) findViewById(R.id.connectFB);
        connectFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

    }

    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.regist:
                intent = new Intent(this, RegisterActivity.class);
                break;
        }
        if (null != intent) startActivity(intent);
    }

}


