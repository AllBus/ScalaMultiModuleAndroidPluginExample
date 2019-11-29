package com.kos.scalamultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kos.scalamodule.Driver
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val d = Driver()
        setContentView(d.getLayout(this))
   //     setContentView(R.layout.activity_main)

        image.setImageResource(R.drawable.ic_android_black_24dp)


        textView.setText(d.getText(this))
    }
}
