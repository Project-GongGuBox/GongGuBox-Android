package com.example.gonggubox.ui.items.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.StarRate
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonggubox.ui.theme.Typography

@Composable
fun RatingRow(
    modifier: Modifier,
    rating: String,
    ratingPeoples: String
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.StarRate,
            contentDescription = "Star Rate Icon",
            modifier = modifier.size(9.dp),
            tint = Color(0xFFF2D469)
        )
        Spacer(modifier = modifier.size(2.dp))
        Text(text = rating, fontSize = 6.sp, style = Typography.labelSmall)
        Text(text = "(${ratingPeoples})", fontSize = 6.sp,style = Typography.labelSmall)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRatingRow() {
    RatingRow(modifier = Modifier, rating = "4.3", ratingPeoples = "60")
}