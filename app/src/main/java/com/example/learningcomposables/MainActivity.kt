package com.example.learningcomposables

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningcomposables.ui.theme.LearningComposablesTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningComposablesTheme {
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
    Column (verticalArrangement = Arrangement.Center,
    modifier = Modifier.padding(10.dp)) {
        Text(
            text = "Hello $name!, How are you?",
            modifier = modifier,
            fontSize = 30.sp,
            lineHeight = 36.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Hope you're doing well",
            modifier = Modifier
                .padding(0.dp, 10.dp)
                .align(alignment = Alignment.End)
        )
//        Image(
//            painter = painterResource(id = R.drawable.male),
//            contentDescription = null,
//            modifier = Modifier
//                .align(alignment = Alignment.CenterHorizontally)
//                .height(100.dp)
//                .width(100.dp)
//                .padding(10.dp)
//                .clip(RoundedCornerShape(100.dp))
//                .background(color = Color.Black, shape = CircleShape)
//        )
//        MyButton()


    }
}

@Composable
fun MyButton() {
    val context = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(45.dp)
    ) {
        Text(text = "Click Me")
    }
}

@Preview(showBackground = true, name = "Learning")
@Composable
fun GreetingPreview() {
    LearningComposablesTheme {
        Greeting("John")

    }
}