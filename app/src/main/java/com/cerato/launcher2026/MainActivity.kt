package com.cerato.launcher2026

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView
import android.util.Log

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val screen = TextView(this).apply {
                text = "KIA  |  CERATO\n\nDIAGNOSTIC MODE\n\nActivity Started Successfully"
                textSize = 28f
                setTextColor(Color.WHITE)
                gravity = Gravity.CENTER
                setBackgroundColor(Color.rgb(12, 17, 38))
            }

            setContentView(screen)

            Log.i("CeratoLauncher", "Activity started successfully")

        } catch (e: Exception) {
            Log.e("CeratoLauncher", "Startup error", e)
        }
    }
}
