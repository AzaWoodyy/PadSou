import ProfileForm
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.padsous.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ProfileContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(topEnd = 35.dp, topStart = 35.dp))
            .background(MediumGreyCustom)
            .padding(bottom = 40.dp)
            .padding(top = 40.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        ProfileForm()
    }
}