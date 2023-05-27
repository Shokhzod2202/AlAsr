package com.bismillah.alasr.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bismillah.alasr.data.models.Task

@Dao
interface TaskDao {
    @Insert
    suspend fun insert(task: Task)

    @Update
    suspend fun update(task: Task)

    @Query("DELETE FROM tasks WHERE id = :taskId")
    suspend fun delete(taskId: Long)

    // Add more query methods as per your requirements
}
