package id.co.decoded.moeslim.validasiinputtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class homeActivity extends AppCompatActivity {

    EditText edNama;
    EditText edEmail;
    Button btCek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        edNama = (EditText)findViewById(R.id.txtNama);
        edEmail = (EditText)findViewById(R.id.txtEmail);

        btCek = (Button)findViewById(R.id.btnCek);
        btCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean status = validasiText();
                if(status == true){
                    //Atur Aksi
                }
            }
        });

    }

    public boolean validasiText(){
        if(edNama.getText().toString().isEmpty()){
            edNama.setError("Maaf, Nama Lengkap tidak boleh kosong!!");
            edNama.requestFocus();
            return false;
        }
        if(edEmail.getText().toString().isEmpty()){
            edEmail.setError("Maaf, Email belom diisi!!");
            edEmail.requestFocus();
            return false;
        }
        return true;
    }
}
