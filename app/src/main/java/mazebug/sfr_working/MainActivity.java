package mazebug.sfr_working;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {
    private EditText myLog;
    private EditText myPass;
    final String login = "User";
    final String password="user";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        myLog=(EditText)findViewById(R.id.loginField);
        myPass=(EditText)findViewById(R.id.passField);

    }

    public void enterClick(View view) {
        String s = myLog.getText().toString();
        String a = myPass.getText().toString();
        if(s.equals(login)&&(a.equals(password))) {
            Intent intent = new Intent(MainActivity.this, WorkingClass.class);
            startActivity(intent);
        }
        else{
                //создаем и отображаем текстовое уведомление
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Wrong login or password",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();

        }
    }
}
