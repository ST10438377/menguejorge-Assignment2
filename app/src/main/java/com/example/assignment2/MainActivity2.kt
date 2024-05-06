package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var feedButton: Button
    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var hungerView: TextView
    private lateinit var cleanView: TextView
    private lateinit var happyView: TextView
    private lateinit var feedCountView: TextView
    private lateinit var cleanCountView: TextView
    private lateinit var playCountView: TextView

    // Initial values for pet status
    private var hungerLevel = 50
    private var cleanlinessLevel = 50
    private var happinessLevel = 50

    // Counters for actions
    private var feedCount = 0
    private var cleanCount = 0
    private var playCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Initialize views
        imageView = findViewById(R.id.imageView2)
        feedButton = findViewById(R.id.feedButton)
        cleanButton = findViewById(R.id.cleanButton2)
        playButton = findViewById(R.id.playButton3)
        hungerView = findViewById(R.id.hungerView)
        cleanView = findViewById(R.id.cleanView)
        happyView = findViewById(R.id.happyView)
        feedCountView = findViewById(R.id.feedCount)
        cleanCountView = findViewById(R.id.cleanCount)
        playCountView = findViewById(R.id.playCount)

        // Set initial status values
        updateStatus()
        updatePetImage()

        // Set click listeners for buttons
        feedButton.setOnClickListener {
            feedPet()
            updateCounts()
            updatePetImage()
        }
        cleanButton.setOnClickListener {
            cleanPet()
            updateCounts()
            updatePetImage()
        }
        playButton.setOnClickListener {
            playWithPet()
            updateCounts()
            updatePetImage()
        }
    }

    private fun feedPet() {
        // Update hunger level
        hungerLevel += 10
        if (hungerLevel > 100) hungerLevel = 100
        // Update feed count
        feedCount++
    }

    private fun cleanPet() {
        // Update cleanliness level
        cleanlinessLevel += 10
        if (cleanlinessLevel > 100) cleanlinessLevel = 100
        // Update clean count
        cleanCount++
    }

    private fun playWithPet() {
        // Update happiness level
        happinessLevel += 10
        if (happinessLevel > 100) happinessLevel = 100
        // Update play count
        playCount++
    }

    private fun updateCounts() {
        feedCountView.text = if (feedCount > 0) "Feed Count: $feedCount" else ""
        cleanCountView.text = if (cleanCount > 0) "Clean Count: $cleanCount" else ""
        playCountView.text = if (playCount > 0) "Play Count: $playCount" else ""
    }

    private fun updateStatus() {
        hungerView.text = getString(R.string.hungerView)
        cleanView.text = getString(R.string.cleanView)
        happyView.text = getString(R.string.happyView)
    }

    private fun updatePetImage() {
        imageView.setImageResource(
            when {
                hungerLevel > 70 -> R.drawable.eating
                cleanlinessLevel < 30 -> R.drawable.shower1
                happinessLevel > 70 -> R.drawable.kiding2
                else -> R.drawable.dog_1
            }
        )
    }
}
