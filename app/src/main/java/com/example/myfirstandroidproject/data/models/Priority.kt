package com.example.myfirstandroidproject.data.models

import androidx.compose.ui.graphics.Color
import com.example.myfirstandroidproject.ui.theme.HighPriorityColor
import com.example.myfirstandroidproject.ui.theme.LowPriorityColor
import com.example.myfirstandroidproject.ui.theme.MediumPriorityColor
import com.example.myfirstandroidproject.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    None(NonePriorityColor)
}