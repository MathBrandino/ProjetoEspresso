package br.com.caelum.projetoespresso.task;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by matheus on 16/07/15.
 */
public class TaskTeste extends AsyncTask<Object, Object, String> {

    private Activity activity;
    private ProgressDialog progressDialog;


    public TaskTeste(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected String doInBackground(Object... params) {

        Timer timer = new Timer();
        timer.schedule(timerTask, 999999999);

        String u = new String();

        for (int i = 0; i < 10000000 ; i++) {
            u = String.valueOf(i);
        }

        return u ;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Toast.makeText(activity, s, Toast.LENGTH_LONG).show();
        progressDialog.dismiss();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(activity, "Aguarde ...", "testando", true, true);
    }

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {

        }
    };
}
