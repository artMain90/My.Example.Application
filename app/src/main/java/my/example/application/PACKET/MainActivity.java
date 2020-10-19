package my.example.application.PACKET;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Это значит что отображаться будут настройки сделанные в activity_main.

        TextView developer = findViewById(R.id.developer);
        if (developer != null) {
            String leotard = getString(R.string.hello_developer);
            leotard += "!!";
            String str = "+";
            developer.setText(leotard);
            System.out.println(leotard + str);
        }
    }
}