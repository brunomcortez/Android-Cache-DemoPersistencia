package com.brunocortez.demopersistencia.shared_preferences

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesUtils(context: Context) {
    private val sharedPreferences = context.getSharedPreferences("MEU_APP", Context.MODE_PRIVATE)

    fun save(key: String, value: String) {
        sharedPreferences.edit()
            .putString(key, value)
            .apply()
    }

    fun find(key: String): String? = sharedPreferences.getString(key, null)

    fun clear()= sharedPreferences.edit().clear().apply()

    fun  remove(key: String)= sharedPreferences.edit().remove(key).apply()
}