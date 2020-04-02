package br.com.braspag.logador

import android.util.Log

object Logador {
    private const val TAG = "LOGADOR.TAG"
    fun info (message: String) {
        Log.i(TAG, message)
    }
}