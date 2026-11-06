package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userName = intent.getStringExtra("USER_NAME") ?: ""
        val etOrderName = findViewById<EditText>(R.id.et_order_name)
        if (userName.isNotEmpty()) {
            etOrderName.setText(userName)
        }

        val btnOrderAndSend = findViewById<Button>(R.id.btn_order_and_send)

        btnOrderAndSend.setOnClickListener {
            val inputName = etOrderName.text.toString().trim()
            val nameToPass = if (inputName.isNotEmpty()) inputName else (if (userName.isNotEmpty()) userName else "User")
            val intentConfirm = Intent(this, ConfirmationActivity::class.java)
            intentConfirm.putExtra("USER_NAME", nameToPass)
            startActivity(intentConfirm)
        }
    }
}
