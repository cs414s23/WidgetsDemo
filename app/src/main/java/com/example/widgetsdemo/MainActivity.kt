package com.example.widgetsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.CheckBox
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBarLabel = findViewById<TextView>(R.id.seek_bar_label)

        // Listen seekBar change events: There are three override methods that must be implemented
        // though you may not necessarily use the last two
        findViewById<SeekBar>(R.id.seek_bar_age).setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // As the seekbar moves, the progress value is obtained and displayed in our seekBar label
                seekBarLabel.text = "Age: $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
    }

    fun radioButtonClick(view: View) {
        // check which radio button was clicked
        val message: String
        if (view.id == R.id.male){
            message = "Male"
        } else if (view.id == R.id.female){
            message = "Female"
        } else {
            message = "Other"
        }

        // Make a toast message to show
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        // setting toast at center with a negative y offset value so that it appear at a different part of the screen
        toast.setGravity(Gravity.CENTER, 0, -440)
        toast.show()
    }

    fun checkBoxClick(view: View) {
        // check which checkbox was Selected or Unselected
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            when (view.id) {
                R.id.car -> {
                    if (checked) {
                        // Selected car - do something
                    }
                    else {
                        // Unselected car - do something
                    }
                }
                R.id.bus -> {
                    if (checked){
                        // Selected bus - do something
                    }
                    else {
                        // Unselected bus - do something
                    }
                }
                R.id.truck -> {
                    if (checked){
                        // Selected truck - do something
                    }
                    else {
                        // Unselected truck - do something
                    }
                }
                R.id.bike -> {
                    if (checked){
                        // Selected bike - do something
                    }
                    else {
                        // Unselected bike - do something
                    }
                }
            }
        }
    }

    fun switchClick(view: View) {
        // check if switch is checked
        val switchRent = findViewById<Switch>(R.id.switch_rent)
        val switchText: String
        if (switchRent.isChecked) {
            switchText = "Rent"
        } else {
            switchText = "Not Rent"
        }
        // show a custom message on the switch
        switchRent.text = switchText
    }
}