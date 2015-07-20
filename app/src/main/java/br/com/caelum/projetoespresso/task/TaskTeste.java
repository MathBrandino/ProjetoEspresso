package br.com.caelum.projetoespresso.task;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import br.com.caelum.projetoespresso.NewActivity;

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

        final int[] u = new int[1];

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 999999999 ; i++) {
                    u[0] = i;
                }
            }
        };
        timerTask.run();

        return String.valueOf(u[0]);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        progressDialog.dismiss();

        Intent intent = new Intent(activity, NewActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(activity, "Aguarde ...", "Procurando resultado", false, true);
    }
}
