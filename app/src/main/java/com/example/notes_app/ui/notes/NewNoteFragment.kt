package com.example.notes_app.ui.notes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.notes_app.R
import com.example.notes_app.databinding.FragmentCreateAccountBinding
import com.example.notes_app.databinding.FragmentNewNoteBinding

class NewNoteFragment : Fragment(R.layout.fragment_new_note) {
    private var _binding : FragmentNewNoteBinding?= null
    val binding: FragmentNewNoteBinding?
        get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNewNoteBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}