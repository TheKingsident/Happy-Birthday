package com.thekingsident.happybirthdayhannah.data

import com.thekingsident.happybirthdayhannah.R
import com.thekingsident.happybirthdayhannah.model.LoveDeclaration

class LoveDeclarationData {

    fun loadMessage(): List<LoveDeclaration> {
        return listOf(
                LoveDeclaration(R.string.love_declaration1),
                LoveDeclaration(R.string.love_declaration2)
        )
    }
}