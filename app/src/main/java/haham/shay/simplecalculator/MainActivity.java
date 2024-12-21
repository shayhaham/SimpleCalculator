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
        // קריאת ערכים מה-EditText
        String et1Text = Num1.getText().toString().trim();
        String et2Text = Num2.getText().toString().trim();

        // בדיקה אם הקלט ריק
        if (et1Text.isEmpty() || et2Text.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        // המרת קלט למספרים
        int num1 = Integer.parseInt(et1Text);
        int num2 = Integer.parseInt(et2Text);
        int result = 0;

        if (view.getId() == R.id.btnPlus) {
            result = num1 + num2;
        } else if (view.getId() == R.id.btnMinus) {
            result = num1 - num2;
        } else if (view.getId() == R.id.btnMult) {
            result = num1 * num2;
        } else if (view.getId() == R.id.btnDiv) {
            if (num2 == 0) {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                return;
            }
            result = num1 / num2;
        }

        // הצגת התוצאה ב-TextView
        tvResult.setText(String.valueOf(result));
    }
}
