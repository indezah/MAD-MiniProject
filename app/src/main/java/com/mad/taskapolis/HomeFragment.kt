package com.mad.taskapolis

import Task
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TaskAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.taskRecyclerView)

        // Create a list of tasks (replace with your data)
        val taskList = listOf(
            Task("Task 1", "Description 1", "Due date 1"),
            Task("Task 2", "Description 2", "Due date 2"),
            Task("Task 3", "Description 3", "Due date 3"),
            Task("Task 4", "Description 4", "Due date 4"),
            Task("Task 5", "Description 5", "Due date 5"),Task("Task 1", "Description 1", "Due date 1"),
            Task("Task 2", "Description 2", "Due date 2"),
            Task("Task 3", "Description 3", "Due date 3"),
            Task("Task 4", "Description 4", "Due date 4"),
            Task("Task 5", "Description 5", "Due date 5"),Task("Task 1", "Description 1", "Due date 1"),
            Task("Task 2", "Description 2", "Due date 2"),
            Task("Task 3", "Description 3", "Due date 3"),
            Task("Task 4", "Description 4", "Due date 4"),
            Task("Task 5", "Description 5", "Due date 5"),Task("Task 1", "Description 1", "Due date 1"),
            Task("Task 2", "Description 2", "Due date 2"),
            Task("Task 3", "Description 3", "Due date 3"),
            Task("Task 4", "Description 4", "Due date 4"),
            Task("Task 5", "Description 5", "Due date 5"),
            Task("Task 1", "Description 1", "Due date 1"),
            Task("Task 2", "Description 2", "Due date 2"),
            Task("Task 3", "Description 3", "Due date 3"),
            Task("Task 4", "Description 4", "Due date 4"),
            Task("Task 5", "Description 5", "Due date 5"),
            // Add more tasks as needed
        )

        // Initialize and set up your RecyclerView and adapter here
        adapter = TaskAdapter(taskList) { task ->
            // Handle task item click here
            openTaskDetailsActivity(task)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    private fun openTaskDetailsActivity(task: Task) {
        val intent = Intent(activity, TaskDetailsActivity::class.java)
        intent.putExtra("task", task)
        startActivity(intent)
    }

}