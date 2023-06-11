package fr.prince.jetcompsesocial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.prince.jetcompsesocial.ui.theme.JetCompseSocialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetCompseSocialTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    MessageCard(Message("Social Media", "Jetpack Compose"))
                }
            }
        }
    }
}

data class  Message(val author : String, val body : String)
@Composable
fun MessageCard(msg: Message) {
   Text(text = msg.author)
    Text(text = msg.body)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetCompseSocialTheme {
        MessageCard(Message("Prince Bai", "Merci d'être venu"))
    }
}