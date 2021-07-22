package kr.hs.emirim.w2023.ex14_15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] fruitsArr = {"수박","참외","딸기"};
    int[] imgsArr = {R.drawable.warning};
    Button btnFruits;
    ImageView imgV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDialog = findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(btnListener);
        imgV = findViewById(R.id.imgv);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.btn_dialog:
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.btn_alert)

                        .setIcon(R.drawable.warning)
                        .setPositiveButton(R.string.btn_positive, btnPostivieListener)
                        .show();
                break;
                case R.id.btn_fruits:
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle(R.string.btn_alert)
                            .setItems(fruitsArr, fruitsItemListener)
                            .setIcon(R.drawable.warning)
                            .setPositiveButton(R.string.btn_positive, btnPostivieListener)
                            .show();
                    break;
            }

        }
    };
    DialogInterface.OnClickListener fruitsItemListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            btnFruits.setText(fruitsArr[which]);

        }
    };

    DialogInterface.OnClickListener btnPostivieListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(MainActivity.this,"대화상자 확인 버튼을 클릭하셨어요",Toast.LENGTH_SHORT).show();
        }
    };


}