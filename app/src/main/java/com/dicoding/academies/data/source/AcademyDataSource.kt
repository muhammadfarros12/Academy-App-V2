package com.dicoding.academies.data.source

import androidx.lifecycle.LiveData
import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.ModuleEntity

interface AcademyDataSource {
    fun getAllCourses(): LiveData<List<CourseEntity>>

    fun getBookmarkedCourses(): LiveData<List<CourseEntity>>

    fun getCourseWithModules(courseId: String): LiveData<CourseEntity>

    fun getAllModulesByCourse(courseId: String): LiveData<List<ModuleEntity>>

    fun getContent(courseId: String, moduleId: String): LiveData<ModuleEntity>
}

// Sebelum Anda menghubungkan kedua data source tersebut,
// buatlah interface yang nantinya akan digunakan untuk menggabungkan data source tersebut.