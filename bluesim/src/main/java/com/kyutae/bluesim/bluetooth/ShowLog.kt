package com.kyutae.bluesim.bluetooth

import android.util.Log


class ShowLog {
    companion object{
        fun logD(TAG: String, text:String) = Log.d(TAG, text)
        fun logE(TAG: String, text:String) = Log.e(TAG, text)
        fun logI(TAG: String, text:String) = Log.i(TAG, text)
        fun logV(TAG: String, text:String) = Log.v(TAG, text)
        fun logW(TAG: String, text:String) = Log.w(TAG, text)
    }
}