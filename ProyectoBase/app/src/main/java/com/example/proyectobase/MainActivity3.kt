package com.example.proyectobase

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val edName: TextView = findViewById(R.id.edName)
        val edLastname: TextView = findViewById(R.id.edLastname)
        val edBirth: TextView = findViewById(R.id.edBirth)
        val btnCaptura: Button = findViewById(R.id.btnCaptura)

        btnCaptura.setOnClickListener {
            val nombre = edName.text.toString()
            val apellido = edLastname.text.toString()
            val fNac = edBirth.text.toString()

            // Validar que no estén vacíos
            if (nombre.isEmpty() || apellido.isEmpty() || fNac.isEmpty()) {
                Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Mostrar mensaje con los datos ingresados
                val mensaje = "Nombre: $nombre, Edad: $apellido, Fecha nacimiento: $fNac"
                Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}