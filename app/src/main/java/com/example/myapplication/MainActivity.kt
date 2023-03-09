package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonComponenetes: Button = findViewById(R.id.button)
        botonComponenetes.setOnClickListener { componenetes() }

    }

    private fun componenetes() {

        val campoNombre: EditText = findViewById(R.id.idNombreText)
        val nombre:String = campoNombre.text.toString()

        var radio1select=""
        var radio2select=""
        var check1select=""
        var check2select=""
        var togglebtnselect=""
        var switchselect=""

        val radio1: RadioButton = findViewById(R.id.radioButton)
        if (radio1.isChecked) {
            radio1select="El radio 1 esta seleccionado"
        } else {
            radio1select="El radio 1 NO esta seleccionado"
        }

        val radio2: RadioButton = findViewById(R.id.radioButton2)
        if (radio2.isChecked) {
            radio2select="El radio 2 esta seleccionado"
        } else {
            radio2select="El radio 2 NO esta seleccionado"
        }

        val check1: CheckBox = findViewById(R.id.checkBox)
        if (check1.isChecked) {
            check1select="El check 1 esta seleccionado"
        } else {
            check1select="El check 1 NO esta seleccionado"
        }
        val check2: CheckBox = findViewById(R.id.checkBox2)
        if (check2.isChecked) {
            check2select="El check 2 esta seleccionado"
        } else {
            check2select="El check 2 NO esta seleccionado"
        }

        val toggleButton: ToggleButton = findViewById(R.id.toggleButton)
        if (toggleButton.isChecked) {
            togglebtnselect="El toggleButton esta seleccionado"
        } else {
            togglebtnselect="El toggleButton NO esta seleccionado"
        }
        val switch: Switch = findViewById(R.id.switch1)
        if (switch.isChecked) {
            switchselect="El switch esta seleccionado"
        } else {
            switchselect="El switch NO esta seleccionado"
        }
        //val imgbutton: ImageButton = findViewById(R.id.imageButton)
        //if (imgbutton.isChecked) {
        //    imgbtnselect="La ImageButton esta seleccionado"
       // } else {
        //    imgbtnselect="La ImageButton NO esta seleccionado"
       // }

        var result="$nombre \n $radio1select \n $radio2select \n $check1select \n $check2select \n $togglebtnselect \n $switchselect"

        Toast.makeText(this,result, Toast.LENGTH_LONG).show()

    }
}