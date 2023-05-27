package com.bismillah.alasr.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bismillah.alasr.R
import com.bismillah.alasr.data.models.Task
import com.bismillah.alasr.ui.adapters.TaskListAdapter

class DailyTasksFragment : Fragment() {

    private lateinit var taskListAdapter: TaskListAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_daily_tasks, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        taskListAdapter = TaskListAdapter(getSampleTasks())
        recyclerView.adapter = taskListAdapter
        return view
    }

    private fun getSampleTasks(): List<Task> {
        // Return sample tasks for testing
        return listOf(
            Task(1, "Task 1", "Description 1", System.currentTimeMillis(), System.currentTimeMillis() + 3600000, 0, false),
            Task(2, "Task 2", "Description 2", System.currentTimeMillis(), System.currentTimeMillis() + 7200000, 50, false),
            Task(3, "Task 3", "Description 3", System.currentTimeMillis(), System.currentTimeMillis() + 10800000, 100, true)
        )
    }
}
