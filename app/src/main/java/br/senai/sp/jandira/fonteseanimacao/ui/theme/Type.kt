package br.senai.sp.jandira.fonteseanimacao.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.fonteseanimacao.R

val PoetsenOne_Regular = FontFamily(Font(R.font.poetsenone_regular))
val KanitThin = FontFamily(Font(R.font.kanit_thin))
val KanitMedium = FontFamily(Font(R.font.kanit_medium))
val kanitRegular = FontFamily(Font(R.font.kanit_regular))
val KanitExtraBold = FontFamily(Font(R.font.kanit_extrabold))
val KanitSemiBold = FontFamily(Font(R.font.kanit_semibold))
val KanitBlack = FontFamily(Font(R.font.kanit_black))
val KanitLight = FontFamily(Font(R.font.kanit_light))
val KanitItalic = FontFamily(Font(R.font.kanit_italic))

// Set of Material typography styles to start with
val MinhaFonte = Typography(
    bodyLarge = TextStyle(
        fontFamily = kanitRegular,
        fontSize = 32.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.7.sp,
        color = Color.Green
    )
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)