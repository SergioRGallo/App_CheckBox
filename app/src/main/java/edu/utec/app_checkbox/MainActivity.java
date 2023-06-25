package edu.utec.app_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declaro las variables
    private EditText et1,et2;
    private CheckBox chb_Suma, chb_Resta;
    private TextView tv_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Traigo los valores desde la int. grafica
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        chb_Suma = (CheckBox) findViewById(R.id.chb_Suma);
        chb_Resta = (CheckBox) findViewById(R.id.chb_Resta);
        tv_Resultado = (TextView) findViewById(R.id.tv_Resultado);

    }

    // Creo el método para la función del botón
    public void Calcular(View Vista){

        // Convierto los valores recibidos a tipo String
        String et1_String = et1.getText().toString();
        String et2_String = et2.getText().toString();

        // Creo las variables de tipo entero para realizar las operaciones
        int et1_int = Integer.parseInt(et1_String);
        int et2_int = Integer.parseInt(et2_String);

        // Realizo la logica de la app
        String resultado = "";

        if(chb_Suma.isChecked() == true){
            int suma = et1_int + et2_int;
            resultado = "La suma es: " + suma + " / ";

        } 
        if (chb_Resta.isChecked() == true) {
            int resta = et1_int - et2_int;
            resultado = resultado + " La resta es: " + resta;
        }

        // Si no selecciono ninguna opcion en los check
        if(chb_Suma.isChecked() == false && chb_Resta.isChecked() == false) {
            // utilizo toast para el indicar un mensaje
            Toast.makeText(this, "Ingrese la operacion a realizar", Toast.LENGTH_LONG).show();
        }

        // Mostramos el resultado calcula en el TextView
        tv_Resultado.setText(resultado);
    }

}