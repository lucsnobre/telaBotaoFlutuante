package lobo.cachorrada.clientes.screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lobo.cachorrada.clientes.R
import lobo.cachorrada.clientes.ui.theme.ClientesAppTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold (
        topBar = {
            BarraDeTitulo()
        },
        bottomBar = {
            Text(text = "Barra Inferior")
        },
        floatingActionButton = {}
    ){ paddingValues ->
        Column (
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(Color.LightGray)
        ) {
            Text(text = "Aqui fica o conteúdo")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraDeTitulo(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        title = {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "Maria da Silva",
                        fontSize = 18.sp
                    )
                    Text(
                        text = "maria@email.com",
                        fontSize = 18.sp
                    )
                }
                Card(
                    modifier = Modifier
                        .size(60.dp),
                    shape = CircleShape
                )
                Image(
                    painter = painterResource(R.drawable.objetivo),
                    contentDescription = "Foto do Perfil",
                    contentScale = ContentScale.Crop
                )
            }
        }
    )
}

@Preview
@Composable
private fun HomeScreenPreview(){
    ClientesAppTheme {
        BarraDeTitulo()
    }
}