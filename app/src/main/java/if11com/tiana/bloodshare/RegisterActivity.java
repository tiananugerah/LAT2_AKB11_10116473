package if11com.tiana.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

// NIM      : 10116473
// Nama     : Tian Anugerah Mulyana
// Kelas    : IF 11 - AKB 11
// Pemuatan : 19-4-19

public class RegisterActivity extends AppCompatActivity {

    Button btn_Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_Register = (Button) findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterActivity.this, AthereActivity.class);
                startActivity(i);
            }
        });

    }
}
