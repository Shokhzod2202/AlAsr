package com.bismillah.alasr.di

import android.content.Context
import com.bismillah.alasr.data.database.dao.TaskDao
import com.bismillah.alasr.data.database.dao.UserDao
import com.bismillah.alasr.data.repositories.TaskRepository
import com.bismillah.alasr.data.repositories.UserRepository

object RepositoryModule {
    fun provideTaskDao(context: Context): TaskDao {
        return AppModule.provideTaskDao(context)
    }

    fun provideUserDao(context: Context): UserDao {
        return AppModule.provideUserDao(context)
    }

    fun provideTaskRepository(context: Context): TaskRepository {
        val taskDao = provideTaskDao(context)
        return AppModule.provideTaskRepository(taskDao)
    }

    fun provideUserRepository(context: Context): UserRepository {
        val userDao = provideUserDao(context)
        return AppModule.provideUserRepository(userDao)
    }
}
