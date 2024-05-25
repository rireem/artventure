package com.example.qrscan;



import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.qrscan.databinding.ActivityMainBinding

class LoginPage : AppCompatActivity() {

   // private lateinit var binding: ActivityMainBinding
    lateinit var usernameInput : EditText
    lateinit var passwordIntput : EditText
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginactivity)


        usernameInput = findViewById(R.id.username)
        passwordIntput = findViewById(R.id.password)
        loginBtn = findViewById(R.id.loginBtn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordIntput.text.toString()
            Log.i("Text Cerdentials", "Username : $username and Password : $password")

        }
    }


}