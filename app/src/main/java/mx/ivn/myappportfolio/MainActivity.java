package mx.ivn.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast((Button) v);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast((Button) v);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast((Button) v);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast((Button) v);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast((Button) v);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast((Button) v);
            }
        });

    }

    public void showToast(Button b){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + b.getText().toString() + " app";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
