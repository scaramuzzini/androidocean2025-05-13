package com.oceanbrasil.oceanbrasil20250513

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oceanbrasil.oceanbrasil20250513.ui.theme.OceanBrasil20250513Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OceanBrasil20250513Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Log.d("MainActivity", "onCreate: $innerPadding")
                    Column {
                        Text("Formulário Ocean Brasil")
                        Row {
                            TextoEspecial("Digite o seu nome:")
                            Salvar("Próximo")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TextoEspecial(nomeParaTela: String) {
    Text(
        text = nomeParaTela ,
        modifier = Modifier.padding(32.dp),
        color = Color.Red,
        fontSize = 14.sp
    )
}

@Composable
fun Salvar(textoDoBotao: String) {
    Button(
        onClick = { Log.d("Salvar", "Salvar clicado")  },
        modifier = Modifier.padding(vertical = 32.dp)
    ) {
        TextoEspecial(textoDoBotao)
    }
}
