package com.oceanbrasil.oceanbrasil20250513

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

class Resultado2Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nome = intent.getStringExtra("NOME_COMPLETO") ?: "Não informado"
        setContent {
            Text("O nome digitado foi: $nome")
        }
    }
}