package com.bismillah.alasr.data.repositories

import com.bismillah.alasr.data.database.dao.TaskDao
import com.bismillah.alasr.data.models.Task

class TaskRepository(private val taskDao: TaskDao) {
    suspend fun insertTask(task: Task) {
        taskDao.insert(task)
    }

    suspend fun updateTask(task: Task) {
        taskDao.update(task)
    }

    suspend fun deleteTask(taskId: Long) {
        taskDao.delete(taskId)
    }

    // Add more repository methods as per your requirements
}
