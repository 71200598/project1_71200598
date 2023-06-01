package id.ac.ukdw.project1_71200598
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shoppingButton: Button = findViewById(R.id.ShoppingButton)
        shoppingButton.setOnClickListener {
            val intent = Intent(this, ShoppingActivity::class.java)
            startActivity(intent)
        }

        val shippingButton: Button = findViewById(R.id.shippingButton)
        shippingButton.setOnClickListener {
            val intent = Intent(this, ShippingActivity::class.java)
            startActivity(intent)
        }

        val summaryButton: Button = findViewById(R.id.SummaryButton)
        summaryButton.setOnClickListener {
            val intent = Intent(this, SummaryActivity::class.java)
            startActivity(intent)
        }
    }
}
