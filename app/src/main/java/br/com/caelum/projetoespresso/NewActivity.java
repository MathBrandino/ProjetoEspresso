package br.com.caelum.projetoespresso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.caelum.projetoespresso.task.TaskTeste;

/**
 * Created by matheus on 16/07/15.
 */
public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new);

        Button button = (Button) findViewById(R.id.botao2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TaskTeste taskTeste = new TaskTeste(NewActivity.this);
                taskTeste.execute();
            }
        });

    }
}
