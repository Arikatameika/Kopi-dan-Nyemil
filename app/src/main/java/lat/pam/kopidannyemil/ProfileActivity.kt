package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var userName = intent.getStringExtra("USER_NAME") ?: "User"

        val tvProfileHeader = findViewById<TextView>(R.id.tv_profile_header)
        val etProfileName = findViewById<EditText>(R.id.et_profile_name)
        val btnSave = findViewById<Button>(R.id.btn_save_profile)

        tvProfileHeader.text = "Halo $userName,"
        etProfileName.setText(userName)

        btnSave.setOnClickListener {
            val inputName = etProfileName.text.toString().trim()
            if (inputName.isNotEmpty()) {
                userName = inputName
                tvProfileHeader.text = "Halo $userName,"
            }
        }

        val btnNavHome = findViewById<Button>(R.id.btn_nav_home)
        val btnNavOrder = findViewById<Button>(R.id.btn_nav_order)

        btnNavHome.setOnClickListener {
            val intentHome = Intent(this, HomeActivity::class.java)
            intentHome.putExtra("USER_NAME", userName)
            startActivity(intentHome)
            finish()
        }

        btnNavOrder.setOnClickListener {
            val intentOrder = Intent(this, OrderActivity::class.java)
            intentOrder.putExtra("USER_NAME", userName)
            startActivity(intentOrder)
            finish()
        }
    }
}
