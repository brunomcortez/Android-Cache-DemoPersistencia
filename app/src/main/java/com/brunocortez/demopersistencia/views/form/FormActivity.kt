package com.brunocortez.demopersistencia.views.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brunocortez.demopersistencia.R
import com.brunocortez.demopersistencia.shared_preferences.SharedPreferencesUtils
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferencesUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        sharedPreferences = SharedPreferencesUtils(this)

        btSave?.setOnClickListener { savePressed() }
        btDelete?.setOnClickListener { deletePressed() }
        btRecovery?.setOnClickListener { recoveryPressed() }
    }

    private fun savePressed() {
        sharedPreferences.save("nome", ti_name.text.toString())
        ti_name.setText("")
    }

    private fun deletePressed() {
        sharedPreferences.remove("nome")
        ti_name.setText("")
    }

    private fun recoveryPressed() {
        ti_name.setText(sharedPreferences.find("nome"))
    }
}
