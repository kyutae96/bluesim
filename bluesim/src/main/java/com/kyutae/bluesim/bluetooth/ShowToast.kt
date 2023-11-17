package com.kyutae.bluesim.bluetooth

import android.content.Context
import android.widget.Toast


class ShowToast {
    companion object {
        fun showToast(context: Context?, text: String?) =
            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}