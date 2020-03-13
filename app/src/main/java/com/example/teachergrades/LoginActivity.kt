package com.example.teachergrades

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    var teacherName=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sharedPreferences = getSharedPreferences("LOGIN_INFO", Context.MODE_PRIVATE)
        login_btn.setOnClickListener({
            teacherName = enter_name.text.toString()

            var intent = Intent(applicationContext , StudentsGradesActivity::class.java)
            intent.putExtra("Name",teacherName)
            startActivity(intent)
            finish()
        })

    }



}
