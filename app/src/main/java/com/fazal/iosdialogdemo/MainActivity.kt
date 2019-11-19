package com.fazal.iosdialogdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gmail.samehadar.iosdialog.IOSDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = IOSDialog.Builder(this)
            .setMessageContent("Loading")
            .setDimAmount(3.0f)
            .build()
        dialog.show()
    }
}
