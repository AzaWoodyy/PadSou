package com.example.padsous.components

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp

@Composable
fun BoxWithConstraintsTouchable(
    focusManager: FocusManager,
    content: @Composable (maxHeight: Dp) -> Unit = { }
) {
    BoxWithConstraints(
        Modifier
            .pointerInput(Unit) {
                detectTapGestures(onTap = {
                    focusManager.clearFocus()
                })
            }
    ) {
        content(maxHeight)
    }
}
