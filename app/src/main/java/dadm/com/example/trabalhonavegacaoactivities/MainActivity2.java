package dadm.com.example.trabalhonavegacaoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    public static int RESULT_ADD = 1;
    public static int RESULT_CANCEL = 2;
    EditText editTextNome, editTextColor, editTextRegion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //pegando valores para outra activity
        //String nome = (String) getIntent().getExtras().get("nome");
        //String sobrenome = (String) getIntent().getExtras().get("sobrenome");

        editTextNome = findViewById(R.id.editTextNome);
        editTextColor = findViewById(R.id.editTextColors);
        editTextRegion = findViewById(R.id.editTextRegion);

        //pega o valor que vem da tela 1 pra editar e seta no nome do time
        if(getIntent().getExtras() != null){
            String nome = (String) getIntent().getExtras().get("nome");
            String cores = (String) getIntent().getExtras().get("cores");
            String regiao = (String) getIntent().getExtras().get("regiao");
            editTextNome.setText(nome);
            editTextColor.setText(cores);
            editTextRegion.setText(regiao);
        }
    }

    public void voltarTela(View view){
        setResult(RESULT_CANCEL);
        finish();
    }

    public void adicionar(View view){
        //passar valor pra primeira activity, necessariamente preciso instanciar o intent
        Intent intent = new Intent();

        //pegando o valor do campo
        String nome = editTextNome.getText().toString();
        String cores = editTextColor.getText().toString();
        String regiao = editTextColor.getText().toString();
        //passando valor de fato
        intent.putExtra("nome", nome);
        intent.putExtra("cores", cores);
        intent.putExtra("regiao", regiao);

        setResult(RESULT_ADD, intent);
        finish();
    }
}