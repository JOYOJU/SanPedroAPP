package claverianapps.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity {
    Button ingresar;
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    public String perfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
        ingresar = findViewById(R.id.b1);
    }


    public void login(View View) {
        String pass = et2.getText().toString();
        String user = et1.getText().toString();
        if (user.equals("yoferfe")) {
            if (pass.equals("spc123")) {
                perfil = "e";
                ingresar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(Intent);
                    }
                });
            }else{Toast toast1 =Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT);
                toast1.show();}
        } else if (user.equals("luisg")) {
            if (pass.equals("spc123")) {
                perfil = "p";
                ingresar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(Intent);
                    }
                });
            }else{Toast toast1 =Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT);
                toast1.show();}
        } else if (user.equals("abello")) {
            if (pass.equals("spc123")) {
                perfil = "d";
                ingresar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(Intent);
                    }
                });
            } else {
                Toast toast1 =Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT);
                toast1.show();
            }


        } else {
            Toast toast2 =Toast.makeText(getApplicationContext(), "Wrong user", Toast.LENGTH_SHORT);
            toast2.show();
        }


    }

}




