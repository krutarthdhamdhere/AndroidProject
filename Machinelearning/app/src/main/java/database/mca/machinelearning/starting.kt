package database.mca.machinelearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class starting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starting)

        Handler().postDelayed({
            startActivity(Intent(applicationContext,firstpage::class.java))
            finish()
        },3000)
    }
}