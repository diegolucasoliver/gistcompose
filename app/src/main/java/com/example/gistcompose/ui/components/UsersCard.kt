package com.example.gistcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gistcompose.R

@Composable
fun UserCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colors.secondary)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "user avatar",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .padding(8.dp, 0.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = "User Name",
                    style = MaterialTheme.typography.subtitle2
                )
                Text(
                    text = "User description",
                    style = MaterialTheme.typography.overline
                )
            }
        }
    }
}

@Composable
@Preview
fun UserCardPreview() {
    UserCard()
}