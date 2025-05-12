package com.example.menuapp.IMC

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.menuapp.R

class IMCActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isMFemaleSelected: Boolean = true
    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imcactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponents()
        iniListeners()
        setGenderColor()
    }

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }

    private fun iniListeners() {
        viewMale.setOnClickListener { setGenderColor() }
        viewFemale.setOnClickListener { setGenderColor() }
    }

    private fun setGenderColor() {
        viewMale.setCardBackgroundColor()
        viewFemale.setCardBackgroundColor()
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean) {

        ContextCompat.getColor(this, R.color.background_component_selected)

        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }
        ContextCompat.getColor(this, colorReference)
    }
}