package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userName = intent.getStringExtra("USER_NAME") ?: "User"
        val tvWelcome = findViewById<TextView>(R.id.tv_welcome_name)
        tvWelcome.text = "Halo $userName,"

        val menuList = listOf(
            MenuItem("Aren Latte Cappuchino", "Kombinasi espresso kaya rasa dengan susu lembut dan manisnya gula aren alami yang pas.", "Rp 22.000", R.drawable.arenlatte),
            MenuItem("Apple Doughnut", "Donat empuk dengan isian atau topping apel manis segar beraroma kayu manis", "Rp 20.000", R.drawable.appledonut),
            MenuItem("Brownies Classic", "Cokelat brownies panggang klasik bertesktur padat, gurih, dan legit di setiap gigitan", "Rp 30.000", R.drawable.brownie),
            MenuItem("Cinnamon Roll", "Roti gulung lembut beraroma kayu manis khas dengan lelehan gula manis di atasnya", "Rp 35.000", R.drawable.cinnamonroll),
            MenuItem("Frappuchino", "Minuman kopi blender dingin yang creamy dan menyegarkan dengan balutan whip cream di atasnya", "Rp 25.000", R.drawable.frappuchino),
            MenuItem("Matcha Latte", "Perpaduan teh hijau matcha khas Jepang dan susu hangat yang lembut serta menenangkan", "Rp 27.000", R.drawable.matchalatte)
        )

        val rvMenu = findViewById<RecyclerView>(R.id.rv_menu)
        rvMenu.layoutManager = LinearLayoutManager(this)
        rvMenu.adapter = MenuAdapter(menuList)

        val btnNavOrder = findViewById<Button>(R.id.btn_nav_order)
        val btnNavProfile = findViewById<Button>(R.id.btn_nav_profile)

        btnNavOrder.setOnClickListener {
            val intentOrder = Intent(this, OrderActivity::class.java)
            intentOrder.putExtra("USER_NAME", userName)
            startActivity(intentOrder)
        }

        btnNavProfile.setOnClickListener {
            val intentProfile = Intent(this, ProfileActivity::class.java)
            intentProfile.putExtra("USER_NAME", userName)
            startActivity(intentProfile)
        }
    }
}
