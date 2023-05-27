package com.bismillah.alasr.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bismillah.alasr.data.models.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Update
    suspend fun update(user: User)

    @Query("DELETE FROM users WHERE id = :userId")
    suspend fun delete(userId: Long)

    // Add more query methods as per your requirements
}
