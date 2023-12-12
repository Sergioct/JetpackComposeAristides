package com.sergiocrespotoubes.jetpackcomposearistides.ui.screen.section2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun Exercise2Screen() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()){
        val (boxRed, boxBlue, boxYellow, boxMagenta, boxGreen) = createRefs()

        Box(modifier = Modifier.size(125.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        Box(modifier = Modifier.size(125.dp).background(Color.Green).constrainAs(boxGreen){
            top.linkTo(boxRed.bottom)
            end.linkTo(boxRed.start)
        })
        Box(modifier = Modifier.size(125.dp).background(Color.Yellow).constrainAs(boxYellow){
            bottom.linkTo(boxRed.top)
            end.linkTo(boxRed.start)
        })
        Box(modifier = Modifier.size(125.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxRed.top)
            start.linkTo(boxRed.end)
        })
        Box(modifier = Modifier.size(125.dp).background(Color.Blue).constrainAs(boxBlue){
            top.linkTo(boxRed.bottom)
            start.linkTo(boxRed.end)
        })
    }
}