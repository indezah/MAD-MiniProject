package com.mad.taskapolis

import Task
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class TaskDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_details)

        val toolbar = findViewById<MaterialToolbar>(R.id.myToolbar)
        setSupportActionBar(toolbar)
        // Retrieve the task data from the Intent's extras
        val task = intent.getParcelableExtra<Task>("task")

        // Bind the task data to the views in your layout
        if (task != null) {
            val titleTextView = findViewById<TextView>(R.id.taskTitleTextView)
            val descriptionTextView = findViewById<TextView>(R.id.taskDescriptionTextView)
            val dueDateTextView = findViewById<TextView>(R.id.dueDateTextView)

            titleTextView.text = task.title
            descriptionTextView.text = task.description
            dueDateTextView.text = task.dueDate

            // You can bind other task properties as needed
        }
    }
}
