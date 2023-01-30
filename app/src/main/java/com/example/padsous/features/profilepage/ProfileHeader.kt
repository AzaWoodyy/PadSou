

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.IntegralCf
import com.example.padsous.ui.theme.Inter

@Composable
fun ProfileHeader() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(20.dp, 55.dp, 20.dp, 0.dp)
            .height(120.dp)
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 0.dp)
        ) {
            Text(
                color = Color.White,
                fontFamily = IntegralCf,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                text = "MON PROFIL"
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .padding(10.dp, 0.dp, 0.dp, 0.dp)
                    .size(50.dp)
            )
        }
        Spacer(modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp))
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 0.dp, 0.dp)
            .offset(y = -(20.dp))
            .width(250.dp)
        ) {
            Text(
                color = Color.White,
                fontFamily = Inter,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                text = "Modifie tes infos affichées aux autres sur l’app"
            )
        }
    }
}