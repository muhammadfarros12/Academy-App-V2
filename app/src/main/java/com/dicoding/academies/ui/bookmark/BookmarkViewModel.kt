package com.dicoding.academies.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.source.AcademyRepository

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks(): LiveData<List<CourseEntity>> = academyRepository.getBookmarkedCourses()
}

