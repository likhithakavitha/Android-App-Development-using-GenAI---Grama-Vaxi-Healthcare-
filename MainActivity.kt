package com.example.gramavaxi

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "animal_db"
        ).build()

        val name = findViewById<EditText>(R.id.etName)
        val breed = findViewById<EditText>(R.id.etBreed)
        val age = findViewById<EditText>(R.id.etAge)
        val vaccine = findViewById<EditText>(R.id.etVaccine)
        val saveBtn = findViewById<Button>(R.id.btnSave)

        saveBtn.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {

                val animal = Animal(
                    name = name.text.toString(),
                    breed = breed.text.toString(),
                    age = age.text.toString().toInt(),
                    vaccineDate = vaccine.text.toString()
                )

                database.animalDao().insertAnimal(animal)

                runOnUiThread {
                    Toast.makeText(
                        this@MainActivity,
                        "Animal Registered",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}
