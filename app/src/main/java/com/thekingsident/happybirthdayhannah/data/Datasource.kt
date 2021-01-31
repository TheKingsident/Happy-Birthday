package com.thekingsident.happybirthdayhannah.data

import com.thekingsident.happybirthdayhannah.R
import com.thekingsident.happybirthdayhannah.model.Lome

class Datasource {

    fun loadLome(): List<Lome> {
        return listOf(
                Lome(R.string.lome1, R.drawable.hannah_boo1),
                Lome(R.string.lome2, R.drawable.hannah_boo2),
                Lome(R.string.lome3, R.drawable.hannah_boo3),
                Lome(R.string.lome4, R.drawable.hannah_boo4),
                Lome(R.string.lome5, R.drawable.hannah_boo5),
                Lome(R.string.lome6, R.drawable.hannah_boo6),
                Lome(R.string.lome7, R.drawable.hannah_boo7),
                Lome(R.string.lome8, R.drawable.hannah_boo8),
                Lome(R.string.lome9, R.drawable.hannah_boo9),
                Lome(R.string.lome10, R.drawable.hannah_boo10),
                Lome(R.string.lome11, R.drawable.hannah_boo11),
                Lome(R.string.lome12, R.drawable.hannah_boo12),
                Lome(R.string.lome13, R.drawable.hannah_boo13),
                Lome(R.string.lome14, R.drawable.hannah_boo14),
                Lome(R.string.lome15, R.drawable.hannah_boo15),
                Lome(R.string.lome16, R.drawable.hannah_boo16)
        )
    }
}