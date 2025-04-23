package com.example.menuapp.MENU

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.menuapp.CALCULATOR.CalculatorActivity
import com.example.menuapp.IMC.IMCActivity
import com.example.menuapp.R

class MenuApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonCalculator = findViewById<Button>(R.id.buttonCaculator)
        buttonCalculator.setOnClickListener { navigateToCalculator() }
        val buttonIMCA = findViewById<Button>(R.id.buttonIMC)
        buttonIMCA.setOnClickListener { navigateToIMC() }
    }

    private fun navigateToCalculator() {
        val intent = Intent(this, CalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMC() {
        val intent = Intent(this, IMCActivity::class.java)
        startActivity(intent)
    }
}