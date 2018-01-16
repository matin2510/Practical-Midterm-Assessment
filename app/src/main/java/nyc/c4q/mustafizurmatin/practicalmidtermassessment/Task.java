package nyc.c4q.mustafizurmatin.practicalmidtermassessment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by c4q on 1/16/18.
 */

class Task extends AsyncTask<Integer, Integer, Integer[]> {
    TextView textView;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Integer[] doInBackground(Integer... value) {
        //Integer[] integer = value;
        value = new Integer[]{100000};

        for (int i = 0; i <value.length ; i++) {
            this.publishProgress(value);


        }
        return value;
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
        super.onProgressUpdate(progress);
    }

    @Override
    protected void onPostExecute(Integer[] result) {
        super.onPostExecute(result);
        textView.findViewById(R.id.loops);
        textView.setText("Loops Completed: " + result);
        Context context = null;
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
        ((Activity)context).finish();


    }
}
