package com.dicoding.academies.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.source.AcademyRepository

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): LiveData<List<CourseEntity>> = academyRepository.getAllCourses()
}

