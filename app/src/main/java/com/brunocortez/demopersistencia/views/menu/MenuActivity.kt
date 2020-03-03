package com.brunocortez.demopersistencia.views.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brunocortez.demopersistencia.MainActivity
import com.brunocortez.demopersistencia.R
import com.brunocortez.demopersistencia.views.form.FormActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        btSP?.setOnClickListener { sharedPreferencesPressed() }
        btRoom?.setOnClickListener { roomPressed() }
        btClose?.setOnClickListener { closePressed() }
    }

    private fun sharedPreferencesPressed() {
        startActivity(Intent(this, FormActivity::class.java))
    }

    private fun roomPressed() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun closePressed() {
        finish()
    }
}
