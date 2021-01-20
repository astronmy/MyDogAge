package com.learning.kotlin.mydogage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.learning.kotlin.mydogage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener { calcularEdad() }
    }

    private fun calcularEdad() {
        if(binding.etAge.text.toString().isNotEmpty()){
            val edadIngresada = Integer.parseInt(binding.etAge.text.toString());
            val resultado = edadIngresada*7;
            binding.tvResult.setText("Su edad canina es de ${resultado.toString()} años")
        }else{
            Toast.makeText(this,"Debe ingresar la edad a calcular", Toast.LENGTH_SHORT).show()
        }
    }

}