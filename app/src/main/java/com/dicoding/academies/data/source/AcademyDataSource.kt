package com.dicoding.academies.data.source

import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.ModuleEntity

interface AcademyDataSource {
    fun getAllCourses(): List<CourseEntity>

    fun getBookmarkedCourses(): List<CourseEntity>

    fun getCourseWithModules(courseId: String): CourseEntity

    fun getAllModulesByCourse(courseId: String): List<ModuleEntity>

    fun getContent(courseId: String, moduleId: String): ModuleEntity
}

// Sebelum Anda menghubungkan kedua data source tersebut,
// buatlah interface yang nantinya akan digunakan untuk menggabungkan data source tersebut.