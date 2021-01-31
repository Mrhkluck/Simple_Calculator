package mrhk.net.simple_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_num1,et_num2;
    private TextView tv_res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_num1 = (EditText)findViewById(R.id.et_num_1);
        et_num2 = (EditText)findViewById(R.id.et_num_2);
        tv_res = (TextView)findViewById(R.id.tv_result);

    }

    public void addNumber(View view) {
        //How to Handle Errors
        if(et_num1.getText().toString().trim().isEmpty()){
            et_num1.setError("Cannot BE Empty");
            et_num1.requestFocus();
        }
        if(et_num2.getText().toString().trim().isEmpty()){
            et_num2.setError("Cannot BE Empty");
            et_num2.requestFocus();
        }
        int num1 = Integer.parseInt(et_num1.getText().toString().trim());
        int num2 = Integer.parseInt(et_num2.getText().toString().trim());
        int sum = num1 + num2;

        tv_res.setText(" "+sum);

        // Toast.makeText(getApplicationContext(),"Sum = "+sum,Toast.LENGTH_SHORT).show();
    }
}