package com.bismillah.alasr.di

import android.content.Context
import com.bismillah.alasr.data.database.AppDatabase
import com.bismillah.alasr.data.database.dao.TaskDao
import com.bismillah.alasr.data.database.dao.UserDao
import com.bismillah.alasr.data.repositories.TaskRepository
import com.bismillah.alasr.data.repositories.UserRepository


object AppModule {
    fun provideTaskDao(context: Context): TaskDao {
        val database = AppDatabase.getInstance(context)
        return database.taskDao()
    }

    fun provideUserDao(context: Context): UserDao {
        val database = AppDatabase.getInstance(context)
        return database.userDao()
    }

    fun provideTaskRepository(taskDao: TaskDao): TaskRepository {
        return TaskRepository(taskDao)
    }

    fun provideUserRepository(userDao: UserDao): UserRepository {
        return UserRepository(userDao)
    }
}
