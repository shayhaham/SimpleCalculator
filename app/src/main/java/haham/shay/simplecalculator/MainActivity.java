package haham.shay.simplecalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnPlus;
    Button btnMinus;
    Button btnMult;
    Button btnDiv;
    EditText Num1;
    EditText Num2;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);
        tvResult = findViewById(R.id.tvResult);

    }
    public void onBtnClicked(View view) {

        EditText et1 = findViewById(R.id.Num1);
        String et1Text = et1.getText().toString();
        Integer num1 = Integer.valueOf(et1Text);
        EditText et2 = findViewById(R.id.Num2);
        String et2Text = et2.getText().toString();
        Integer num2 = Integer.valueOf(et2Text);
        Integer result = null;
        if (view.getId() == R.id.btnPlus)
            result = num1 + num2;
        if (view.getId() == R.id.btnMinus)
            result = num1 - num2;
        if (view.getId() == R.id.btnMult)
            result = num1 * num2;
        if (view.getId() == R.id.btnDiv)
            result = num1 / num2;
        if (result != null) {
            TextView tvRes = findViewById(R.id.tvResult);
            tvRes.setText(result.toString());
        }   }
}
