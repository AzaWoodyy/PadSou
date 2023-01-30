package com.example.padsous.features.addplan.content

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.padsous.api.addPlan
import com.example.padsous.features.addplan.PlanViewModel
import com.example.padsous.models.Plan
import com.example.padsous.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.util.*

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PlanImage(
    pageState: PagerState,
    viewModel: PlanViewModel,
    navigateToHomePage: () -> Unit,
    coroutineScope: CoroutineScope
) {

    var imageUri by remember {
        mutableStateOf<Uri?>(null)
    }

    var imageDbUrl by remember {
        mutableStateOf("")
    }

    var imageChanged by remember {
        mutableStateOf(false)
    }

    var context = LocalContext.current
    val bitmap = remember {
        mutableStateOf<Bitmap?>(null)
    }

    val launcher = rememberLauncherForActivityResult(contract =
    ActivityResultContracts.GetContent()) { uri: Uri? ->
        imageChanged = false
        imageUri = uri
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(vertical = 40.dp)
            .padding(bottom = 10.dp)
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .height(220.dp)
        ) {
            Text(
                color = AlmostBlackCustom,
                fontFamily = IntegralCf,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                text = "photo du bon plan"
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(175.dp)
                    .width(175.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(if (imageUri == null) BlueCustom else Color.Transparent)
                    .clickable {
                        launcher.launch("image/*")
                    }
            )
            {
                if(!imageChanged){


                    imageUri?.let {
                        if (Build.VERSION.SDK_INT < 28) {
                            bitmap.value = MediaStore.Images
                                .Media.getBitmap(context.contentResolver,it)

                        } else {
                            val source = ImageDecoder
                                .createSource(context.contentResolver,it)
                            bitmap.value = ImageDecoder.decodeBitmap(source)

                            imageChanged = true

                            println(imageUri)

                            val storageRef = FirebaseStorage.getInstance().reference
                            val imageRef = storageRef.child("images/${UUID.randomUUID()}")
                            val uploadTask = imageRef.putFile(imageUri!!)

                            uploadTask.addOnSuccessListener {
                                // Image uploaded successfully, get its download URL
                                imageRef.downloadUrl.addOnSuccessListener { downloadUrl ->
                                    imageDbUrl = downloadUrl.toString()
                                }
                            }
                        }
                    }
                }
                if(bitmap.value != null){

                    Image(bitmap = bitmap.value!!.asImageBitmap(),
                        contentDescription = null,
                        modifier = Modifier
                            .height(200.dp)
                            .width(175.dp))
                }
                if(imageUri == null){
                    Icon(
                        Icons.Default.Add,
                        tint = Color.White,
                        contentDescription = "add",
                        modifier = Modifier
                            .size(55.dp)
                    )
                }
            }
        }
        Button(
            onClick = {

                val newPlan = Plan(0, name = viewModel.sharedPlanTitle, description = viewModel.sharedPlanDescription, link = viewModel.sharedPlanLink, imageDbUrl, 25, 20)
                addPlan(plan = newPlan)
                navigateToHomePage()
                coroutineScope.launch { pageState.scrollToPage(0)}
            },
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
                text = "AJOUTER CE BON PLAN"
            )
        }
    }
}
