package kr.hs.emirim.w2023.ex14_15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDialog = findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new AlertDialog.Builder(MainActivity.this)
            .setTitle(R.string.btn_alert)

            .setIcon(R.drawable.warning)
            .setPositiveButton(R.string.btn_positive,btnPostivieListener)
           .show();

        }
    };

    DialogInterface.OnClickListener btnPostivieListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(MainActivity.this,"대화상자 확인 버튼을 클릭하셨어요",Toast.LENGTH_SHORT).show();
        }
    };


}