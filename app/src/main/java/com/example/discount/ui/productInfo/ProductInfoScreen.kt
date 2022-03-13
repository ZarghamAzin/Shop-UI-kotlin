package com.example.discount.ui.productInfo

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.discount.R
import com.example.discount.ui.productInfo.components.IconWithText
import com.example.discount.ui.productInfo.components.ItemSpaceBetween
import com.example.discount.ui.theme.Pink
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryDark
import com.example.discount.ui.theme.PrimaryGray
import com.example.discount.ui.util.*


@Composable
fun ProductInfoScreen(navController: NavController) {
    Column {
        DefaultSpacer()
        DefaultTopActionBar(
            title = "Sauce and bbq...",
            iconClick = { navController.popBackStack() })
        Column(
            Modifier
                .fillMaxSize()
                .padding(start = PAD_L_R, end = PAD_L_R, bottom = 40.dp, top = 40.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Sauce and bbq Masala",
                style = MaterialTheme.typography.body2.copy(fontSize = 24.sp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Time and location",
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.height(13.dp))
            IconWithText(text = "12/10/22, 09:24", icon = R.drawable.ic_clock)
            Spacer(modifier = Modifier.height(12.dp))
            IconWithText(text = "Agora", icon = R.drawable.ic_shop)
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Total cost",
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.height(13.dp))
            IconWithText(text = "256$", icon = R.drawable.is_black_dollar)
            Spacer(modifier = Modifier.height(12.dp))
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.ic_pink_dollar),
                    contentDescription = "",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.width(17.dp))
                Text(
                    buildAnnotatedString {
                        append("206$ ")
                        withStyle(
                            style = SpanStyle(
                                fontFamily = FontFamily(Font(R.font.axiforma)),
                                fontWeight = FontWeight(400),
                                fontStyle = FontStyle.Normal,
                                fontSize = 14.sp,
                                color = Pink,
                            )
                        ) {
                            append("(-40$)")
                        }
                    },
                    style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
                )

            }
            Spacer(modifier = Modifier.height(12.dp))
            IconWithText(text = "40$ Saved", icon = R.drawable.ic_discount)
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Order details",
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.height(11.dp))
            ItemSpaceBetween("Sauce", "100")
            ItemSpaceBetween("BBQ Masala", "100")
            ItemSpaceBetween("BBQ Masala", "100")
            ItemSpaceBetween("BBQ Masala", "100")
            ItemSpaceBetween("BBQ Masala", "100")
            Spacer(modifier = Modifier.height(10.dp))
            HorizontalLine()
            Spacer(modifier = Modifier.height(10.dp))
            ItemSpaceBetween("Total excl.VAT", "100")
            ItemSpaceBetween("Vat 20%", "+100")
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp, bottom = 2.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    buildAnnotatedString {
                        append("Discount by ")
                        withStyle(
                            style = SpanStyle(
                                fontFamily = FontFamily(Font(R.font.axiforma)),
                                fontWeight = FontWeight(400),
                                fontStyle = FontStyle.Normal,
                                fontSize = 14.sp,
                                color = PrimaryBlue,
                            )
                        ) {
                            append("Thiscount")
                        }
                    },
                    style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
                )
                Text(
                    text = "-20$",
                    style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            HorizontalLine()
            Spacer(modifier = Modifier.height(10.dp))
            ItemSpaceBetween("Total in USD", "180", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(10.dp))
            DefaultButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Download invoice",
                textStyle = MaterialTheme.typography.body2.copy(
                    color = Color.White,
                    fontSize = 16.sp
                ),
                verticalPad = 19.dp,
                onClick = {}
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Venue Info",
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                modifier = Modifier.padding(top = 1.dp, bottom = 1.dp),
                text = "Agora",
                style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
            )
            Text(
                modifier = Modifier.padding(top = 1.dp, bottom = 1.dp),
                text = "Dhaka, Bangladesh",
                style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
            )
            Text(
                modifier = Modifier.padding(top = 1.dp, bottom = 1.dp),
                text = "hi@agora.co",
                style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Order Info",
                style = MaterialTheme.typography.body2
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                modifier = Modifier.padding(top = 1.dp, bottom = 1.dp),
                text = "Order id: 21233495683u3909458313",
                style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
            )
            Text(
                modifier = Modifier.padding(top = 1.dp, bottom = 1.dp),
                text = "Timestamp: 12/10/22, 09:24",
                style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
            )
            Text(
                modifier = Modifier.padding(top = 1.dp, bottom = 1.dp),
                text = "Service Provider: hi@thiscount.co",
                style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
            )
        }
    }
}