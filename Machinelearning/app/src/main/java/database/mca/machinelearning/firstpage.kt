package database.mca.machinelearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class firstpage : AppCompatActivity() {
    lateinit var classification : ImageView
    lateinit var tts : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        classification = findViewById(R.id.classification)
        tts = findViewById(R.id.tts)
        classification.setOnClickListener {
            startActivity(Intent(applicationContext,MainActivity::class.java))
        }
        tts.setOnClickListener {
            startActivity(Intent(applicationContext,texttospeech::class.java))
        }
    }
}