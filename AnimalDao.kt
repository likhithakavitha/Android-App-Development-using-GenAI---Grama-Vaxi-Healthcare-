package com.example.gramavaxi

import androidx.room.*

@Dao
interface AnimalDao {

    @Insert
    suspend fun insertAnimal(animal: Animal)

    @Query("SELECT * FROM animals")
    suspend fun getAnimals(): List<Animal>
}
