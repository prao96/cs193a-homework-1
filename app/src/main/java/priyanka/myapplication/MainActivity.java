package priyanka.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTap(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "What a wonderful world!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void onCheckMe(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "Sorry, I actually don't calculate anything...", Toast.LENGTH_LONG);
        toast.show();
    }
}
