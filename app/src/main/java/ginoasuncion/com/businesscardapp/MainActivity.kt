package ginoasuncion.com.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import ginoasuncion.com.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212)) // Off-black background color
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo Image
        Image(
            painter = painterResource(id = R.drawable.android_logo), // Replace with your monochrome logo
            contentDescription = "Android Logo",
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 16.dp)
        )

        // Name
        Text(
            text = "Xavier Eugenio Asuncion",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White // White font for contrast
            )
        )

        // Title
        Text(
            text = "Aspiring Android Developer",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFB0B0B0) // Light gray for a softer effect
            )
        )

        Spacer(modifier = Modifier.height(32.dp))

        ContactInfo(text = "+63 917 8200 158")
        ContactInfo(text = "linkedin.com/in/ginoasuncion")
        ContactInfo(text = "ginoasuncion@gmai.com")
    }
}

@Composable
fun ContactInfo(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFFB0B0B0) // Light gray font for a minimalist touch
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}
