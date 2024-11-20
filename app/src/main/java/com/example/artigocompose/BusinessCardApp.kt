package com.example.artigocompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD3E8D3))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        FirstParagraph(modifier = Modifier)
        Spacer(modifier = Modifier.height(200.dp))
        ContactInformation(modifier = Modifier)
    }
}

@Composable
fun FirstParagraph(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            modifier = Modifier.size(170.dp)
        )
        Text(
            text = "Vinícius Rodrgues dos Santos",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            lineHeight = 40.sp,
            modifier = Modifier.padding(top = 8.dp, bottom = 16.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "Desenvolverdor de Software",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 8.dp),
            color = Color(0xFF3DDC84)
        )
    }
}

@Composable
fun ContactInformation(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        ContactOption(
            icon = Icons.Default.Call,
            label = "+11 (123) 444 555 666",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ContactOption(
            icon = Icons.Default.Share,
            label = "@Vinic_rod",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ContactOption(
            icon = Icons.Default.Email,
            label = "vinicontatosq@gmail.com",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable fun ContactOption(icon: ImageVector, label: String, modifier: Modifier = Modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
          //  horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(PaddingValues(start = 60.dp, end = 16.dp, top = 8.dp, bottom = 8.dp))
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 8.dp)
            )
            Text(
                text = label,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
            )
    }
}

