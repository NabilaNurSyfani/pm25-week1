package assigment1.androidbasic

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import assigment1.androidbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

//        val edData : EditText = findViewById(R.id.edData)
//        val edHello : Button = findViewById(R.id.edHello)
//        val tvHello : TextView = findViewById(R.id.tvHello)

        binding.edHello.setOnClickListener {
            var str : String = binding.edData.text.toString()
            binding.tvHello.setText("Hello, $str")

        }

    }
}