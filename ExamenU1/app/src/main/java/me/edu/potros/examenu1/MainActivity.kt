package me.edu.potros.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtGC:TextView=findViewById(R.id.etC)
        val txtGF: TextView =findViewById(R.id.etF)
        val btnC:Button=findViewById(R.id.btnGC)
        val btnF: Button =findViewById(R.id.btnGF)

        btnC.setOnClickListener{
            if(txtGF.text.isNotBlank()){
                var conversion = convertirAC(txtGF.text.toString().toDouble())
                txtGC.text=conversion.toString()
            }

        }
        btnF.setOnClickListener{
            if(txtGC.text.isNotBlank()){
                var conversion = convertirAF(txtGC.text.toString().toDouble())
                txtGF.text=conversion.toString()
            }
        }
    }

    fun convertirAC(temp:Double):Double{
        return (temp-32)/1.8
    }

    fun convertirAF(temp:Double):Double{
        return  (temp*1.8)+32
    }
}