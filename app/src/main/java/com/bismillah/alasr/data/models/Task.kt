package com.bismillah.alasr.data.models

import androidx.room.Entity

@Entity(tableName = "tasks")
data class Task(
    val id: Long,
    val name: String,
    val description: String,
    val startTime: Long,
    val endTime: Long,
    val progress: Int,
    val isCompleted: Boolean,
    // Add more properties as per your requirements
)