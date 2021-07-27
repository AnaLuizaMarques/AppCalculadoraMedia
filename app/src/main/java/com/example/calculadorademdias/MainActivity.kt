package com.example.calculadorademdias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btcalcular =Calcular
        val resultado = Resultado

        btcalcular.setOnClickListener {

            val nota1 :Int = Integer.parseInt(Note1.text.toString())
            val nota2 :Int = Integer.parseInt(Note2.text.toString())
            var media = (nota1 + nota2) / 2
            val faltas :Int = Integer.parseInt(Absence.text.toString())

            if(media >=6 && faltas<=10){
                resultado.setText("Parabéns, você foi aprovado! " + "\n" + "Nota Final = " + media + ".")
            }
            else{
                resultado.setText("Infelizmente, você foi reprovado." + "\n" + "Nota Final = " + media + "." + "\n" +
                        "Faltas = "+ faltas + ".")
            }
        }
    }
}