package br.com.vinimanara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Calcular.setOnClickListener(View.OnClickListener {

        val altura = edText_Altura.text.toString().toDouble()
        val peso = edText_Peso.text.toString().toDouble()
        val imc = peso/(altura*altura)
        var result:String=""

        if(imc<17){
            result= "Muito abaixo do peso"

        }else if (imc<18.49){

            result= "Abaixo do Peso"

        }else if (imc<24.99){

            result= "Peso saudável, parabéns!"

        }else if (imc<29.99){

            result= "Sobrepeso - Se cuide melhor!"

        }
        else if (imc<34.99){

            result= "Obesidade I - Alerta!!"

        }
        else if (imc<39.99){

            result= "Obesidade II - Severa"

        }else if (imc>40){

            result= "Obesidade III - Morbida"

        }

            Toast.makeText(this, result, Toast.LENGTH_LONG).show()

        })
        }
}
