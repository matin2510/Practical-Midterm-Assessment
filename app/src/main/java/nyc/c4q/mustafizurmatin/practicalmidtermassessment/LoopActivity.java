package nyc.c4q.mustafizurmatin.practicalmidtermassessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        Task task = new Task();
        task.doInBackground(new Integer(0));



    }
}
