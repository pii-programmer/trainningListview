package com.example.trainninglistview

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "icecreams")
data class Icecream(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val icon: String,
    val title: String,
    val text: String
)