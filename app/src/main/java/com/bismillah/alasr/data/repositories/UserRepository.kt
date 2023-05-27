package com.bismillah.alasr.data.repositories

import com.bismillah.alasr.data.database.dao.UserDao
import com.bismillah.alasr.data.models.User

class UserRepository(private val userDao: UserDao) {
    suspend fun insertUser(user: User) {
        userDao.insert(user)
    }

    suspend fun updateUser(user: User) {
        userDao.update(user)
    }

    suspend fun deleteUser(userId: Long) {
        userDao.delete(userId)
    }

    // Add more repository methods as per your requirements
}
