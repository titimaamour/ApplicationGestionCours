package sn.supinfo.applicationgestioncours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {
    private EditText txtModule;
    private EditText txtProfesseur;
    private EditText txtHeureDebut;
    private EditText txtHeureFin;
    private EditText txtVolumeHoraire;
    private EditText txtGroup;
    private Button btnvalider;


    private String Module = " ";
    private String Professeur = " ";
    private String HeureDebut = " ";
    private String HeureFin = " ";
    private String VolumeHoraire = " ";
    private String Group = " ";
    private String valider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtModule = findViewById(R.id.txtModule);
        txtProfesseur = findViewById(R.id.txtProfesseur);
        txtHeureDebut = findViewById(R.id.txtHeureDebut);
        txtHeureFin = findViewById(R.id.txtHeureFin);
        txtVolumeHoraire = findViewById(R.id.txtVolumeHoraire);
        btnvalider = findViewById(R.id.buttonvalider);
        //recuperer le contenu de chaque zone de text
        Module = txtModule.getText().toString();
        Professeur = txtProfesseur.getText().toString();
        HeureDebut = txtHeureDebut.getText().toString();
        HeureFin = txtHeureFin.getText().toString();
        VolumeHoraire = txtVolumeHoraire.getText().toString();
        //gestion de boutton envoyer
        btnvalider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Module.equals("") || Professeur.equals("") || HeureDebut.equals("") || HeureFin.equals("") || txtHeureFin.equals("") || txtVolumeHoraire.equals(" ") || txtGroup.equals("")) {
                    Toast.makeText(MainActivity.this, "veuillez remplir ttous les champs", Toast.LENGTH_SHORT).show();


                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("Module", Module);
                    bundle.putString("Professeur", Professeur);
                    bundle.putString("HeureDebut", HeureDebut);
                    bundle.putString("HeureFin", HeureFin);
                    bundle.putString("VolumeHoraire", VolumeHoraire);
                    bundle.putString("Groupe", Group);
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }

            }

        });
    }
}