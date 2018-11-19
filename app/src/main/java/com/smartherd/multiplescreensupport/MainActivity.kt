package com.smartherd.multiplescreensupport

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
	        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
		        Toast.makeText(this, "We are in Portrait Mode", Toast.LENGTH_LONG).show()
	        } else { // for Landscape
		        Toast.makeText(this, "We are in Landscape Mode", Toast.LENGTH_LONG).show()
	        }
        }
    }
}
