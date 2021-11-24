package database.mca.machinelearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*

class texttospeech : AppCompatActivity() {
    lateinit var mTTS : TextToSpeech
    lateinit var speakBtn : Button
    lateinit var stopBtn : Button
    lateinit var  ed : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_texttospeech)
        speakBtn = findViewById(R.id.button)
        stopBtn = findViewById(R.id.button2)
        ed =  findViewById(R.id.editTextTextPersonName)

        mTTS = TextToSpeech(applicationContext, TextToSpeech.OnInitListener { status ->
            if(status != TextToSpeech.ERROR){
                mTTS.language = Locale.UK
            }
        })

        speakBtn.setOnClickListener {
            val toSpeak = ed.text.toString()
            if(toSpeak == ""){
                Toast.makeText(applicationContext,"Enter The Text", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(applicationContext,toSpeak, Toast.LENGTH_LONG).show()
                mTTS.speak(toSpeak, TextToSpeech.QUEUE_FLUSH,null)
            }
        }

        stopBtn.setOnClickListener {
            if(mTTS.isSpeaking){
                mTTS.stop()
            }
            else{
                Toast.makeText(applicationContext,"Not Speaking", Toast.LENGTH_LONG).show()
            }
        }
        fun onPause() {
            if(mTTS.isSpeaking){
                mTTS.stop()
            }
            super.onPause()
        }

    }
}