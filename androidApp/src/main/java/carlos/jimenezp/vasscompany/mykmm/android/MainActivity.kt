package carlos.jimenezp.vasscompany.mykmm.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import carlos.jimenezp.vasscompany.mykmm.Greeting
import carlos.jimenezp.vasscompany.mykmm.Platform
import carlos.jimenezp.vasscompany.mykmm.getPlatform

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                val platform: Platform = getPlatform()
                var greetingText:String by remember{ mutableStateOf("Hello, Android!") }
                var showImage by remember{ mutableStateOf(false) }


                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = {
                        greetingText = Greeting().greet(platform.name)
                        showImage = !showImage
                    }) {
                        Text(greetingText)
                    }
                    
                    AnimatedVisibility(visible = showImage) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_android),
                            contentDescription = "Android Logo",
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    
                }
            }
        }
    }
}
@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
       
    }
}
