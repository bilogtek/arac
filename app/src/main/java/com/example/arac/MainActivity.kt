package com.example.arac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

private var tikla:Button?=null
private var alan:TextView?=null
private var resim:ImageButton?=null
private var toggle:ToggleButton?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timlama()
       toggle?.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener
       { buttonView, isChecked ->
           if(isChecked){alan?.text="button secili halde"}
           else{alan?.text="seçili değil button"}

       })
    }
    fun merhaba(view: View){
        alan?.setText("tikladan gelen değer")
    }
    fun timlama(){
        alan=findViewById(R.id.yazialani)
        tikla=findViewById(R.id.button)
        resim=findViewById(R.id.imageButton)
        toggle=findViewById(R.id.toggleButton)
    }
    fun resimolay(view: View){
        alan!!.text="resime tıkladın arkadasım hayırlı olsun"
    alan!!.textSize= 35F
    }

}



