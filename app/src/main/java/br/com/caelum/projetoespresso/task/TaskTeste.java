package br.com.caelum.projetoespresso.task;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import br.com.caelum.projetoespresso.MainActivity;
import br.com.caelum.projetoespresso.NewActivity;
import br.com.caelum.projetoespresso.R;

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

        String u = null;

        for (int i = 0; i < 900001 ; i++) {
            u = "Tudo está ok e levou : " + i + " linhas do for";
        }

        return u ;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Toast.makeText(activity, s, Toast.LENGTH_LONG).show();
        progressDialog.dismiss();
        Intent intent = new Intent(activity, NewActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(activity, "Aguarde ...", "Procurando resultado", true, true);
    }

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {

        }
    };
}
