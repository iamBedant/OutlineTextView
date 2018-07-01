package com.iambedant.outlinetextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.TextViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(your_text_view, 15, 70, 5, 2);
    }
}
