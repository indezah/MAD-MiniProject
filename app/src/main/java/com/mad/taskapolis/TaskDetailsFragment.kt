package com.mad.taskapolis

import Task
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class TaskDetailsFragment : Fragment() {

    companion object {
        private const val ARG_TASK = "task"

        fun newInstance(task: Task): TaskDetailsFragment {
            val fragment = TaskDetailsFragment()
            val args = Bundle()
            args.putParcelable(ARG_TASK, task)
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var task: Task

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            task = it.getParcelable(ARG_TASK)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_task_details, container, false)
        val titleTextView = view.findViewById<TextView>(R.id.taskTitleTextView)
        val descriptionTextView = view.findViewById<TextView>(R.id.taskDescriptionTextView)
        val dueDateTextView = view.findViewById<TextView>(R.id.dueDateTextView)

        // Bind task data to views
        titleTextView.text = task.title
        descriptionTextView.text = task.description
        // Set the due date (you can retrieve this from your Task model)
        dueDateTextView.text = task.dueDate // Make sure 'dueDate' is a property in your Task model

        return view
    }
}