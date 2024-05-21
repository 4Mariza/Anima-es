package br.senai.sp.jandira.fonteseanimacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOut
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.fonteseanimacao.ui.theme.FontesEAnimacaoTheme
import br.senai.sp.jandira.fonteseanimacao.ui.theme.MinhaFonte
import br.senai.sp.jandira.fonteseanimacao.ui.theme.PoetsenOne_Regular

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FontesEAnimacaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var visivelState = remember {
        mutableStateOf(false)
    }

    var enterState = remember {
        mutableStateOf(fadeIn())
    }

    var exitState = remember {
        mutableStateOf(fadeOut())
    }

   Column (
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = Modifier
           .fillMaxWidth()
           .height(350.dp)
   ){
        Row (horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()){
            Button(
                onClick = {
                    visivelState.value = !visivelState.value
                    enterState.value = fadeIn(animationSpec = tween(5000))
                    exitState.value = fadeOut(animationSpec = tween(3000))
                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF74783))
            ) {
                Text(text = "Fade")
            }
            Button(
                onClick = {
                    visivelState.value = !visivelState.value
                    enterState.value = slideInHorizontally()
                    exitState.value = slideOutHorizontally() + fadeOut(animationSpec = tween(2000))
                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
            ) {
                Text(text = "Slide")
            }
            Button(
                onClick = {
                    visivelState.value = !visivelState.value
                    enterState.value = scaleIn()
                    exitState.value = scaleOut(targetScale = 0.2f) + fadeOut(animationSpec = tween(2000))
                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8BC34A))
            ) {
                Text(text = "Scale")
            }
            Button(
                onClick = {
                    visivelState.value = !visivelState.value
                    enterState.value = expandHorizontally()
                    exitState.value = shrinkHorizontally()
                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9A66F7))
            ) {
                Text(text = "Expand")
            }
        }
       Spacer(modifier = Modifier.height(40.dp))
       Text(text = "Animações")
       Spacer(modifier = Modifier.height(40.dp))
       MinhaBox(visivelState.value, enterState.value, exitState.value)
   }
}

@Composable
fun MinhaBox(visivel: Boolean,
             enter:EnterTransition,
             exit: ExitTransition)
{
   AnimatedVisibility(
       visible = visivel,
       enter = enter,
       exit = exit
   ) {
       Box (modifier = Modifier
           .size((200.dp))
           .background(color = Color(0xFFFFB64A))
       )
       {

       }
   }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FontesEAnimacaoTheme {
        Greeting("Android")
    }
}