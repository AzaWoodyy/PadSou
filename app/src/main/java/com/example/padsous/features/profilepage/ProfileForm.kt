import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ProfileForm() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp)
    ) {
        Box(modifier = Modifier
            .padding(horizontal = 40.dp)
        )
        {
            Column() {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = IntegralCf,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Mon pseudo"
                )
                var titleText by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = titleText,
                    singleLine = true,
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        textColor = AlmostBlackCustom,
                    ),
                    textStyle = TextStyle(
                        color = AlmostBlackCustom,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    placeholder = {
                        Text(
                            "jacky74bonplan",
                            color = LightGreyCustom,
                            fontFamily = Inter,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    },
                    onValueChange = { newText ->
                        titleText = newText
                    }
                )
            }
        }
        Box(modifier = Modifier
            .padding(horizontal = 40.dp)
        )
        {
            Column() {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = IntegralCf,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Adresse-mail"
                )
                var descText by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = descText,
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        textColor = AlmostBlackCustom,
                    ),
                    textStyle = TextStyle(
                        color = AlmostBlackCustom,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    placeholder = {
                        Text(
                            "jacky@gmail.com",
                            color = LightGreyCustom,
                            fontFamily = Inter,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    },
                    onValueChange = { newText ->
                        descText = newText
                    }
                )
            }
        }
        Box(modifier = Modifier
            .padding(horizontal = 40.dp)
        )
        {
            Column() {
                Text(
                    color = AlmostBlackCustom,
                    fontFamily = IntegralCf,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    text = "Mot de passe"
                )
                var urlText by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(
                    value = urlText,
                    singleLine = true,
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color.Transparent,
                        backgroundColor = Color.White,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent,
                        cursorColor = Color.Black,
                        textColor = AlmostBlackCustom,
                    ),
                    placeholder = {
                        Text(
                            "•••••••••••",
                            color = LightGreyCustom,
                            fontFamily = Inter,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    },
                    textStyle = TextStyle(
                        color = AlmostBlackCustom,
                        fontFamily = Inter,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    onValueChange = { newText ->
                        urlText = newText
                    }
                )
            }
        }
        Button(
            onClick = { /*TODO*/ },
            Modifier
                .width(300.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .height(60.dp),

            colors = ButtonDefaults.buttonColors(
                backgroundColor = BlueCustom,
                contentColor = Color.White
            )
        ) {
            Text(
                color = Color.White,
                fontFamily = IntegralCf,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                text = "Enregistrer"
            )
        }
    }
}