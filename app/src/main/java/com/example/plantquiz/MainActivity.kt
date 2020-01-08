package com.example.plantquiz

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Toast.makeText(this, "The onCreate method is called", Toast.LENGTH_SHORT).show()
    }

    fun button1IsClicked(buttonView: View) {
        Toast.makeText(this, "Button 1 is clicked", Toast.LENGTH_LONG).show()

        var myNumber = 20 // implied data type
        var myName: String = "David"

        var numberOfLetters = myName.length

        var animalName: String? = null
        var numberOfAnimalNameCharacters = animalName!!.length
    }

    fun button2IsClicked(buttonView: View) {
        Toast.makeText(this, "Button 2 is clicked", Toast.LENGTH_LONG).show()
    }

    fun button3IsClicked(buttonView: View) {
        Toast.makeText(this, "Button 3 is clicked", Toast.LENGTH_LONG).show()
    }

    fun button4IsClicked(buttonView: View){
        Toast.makeText(this, "Button 4 is clicked", Toast.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
