package com.dicoding.academies.di

import android.content.Context
import com.dicoding.academies.data.source.AcademyRepository
import com.dicoding.academies.data.source.remote.response.RemoteDataSource
import com.dicoding.academies.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository{
        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}

/*
* Sebelum Anda memanggil ViewModel, Anda perlu mengetahui bagaimana RemoteDataSource di panggil. Ketika Anda memanggil RemoteDataSource, kelas tersebut membutuhkan masukan Context untuk inisialisasi JsonHelper. Context ini digunakan untuk mengambil data dari asset.
* Jadi Anda harus membuat kelas Injection,
* untuk meng-inject context ke dalam RemoteDataSource ketika ViewModel dipanggil.
*
*
* Dengan begitu, Anda bisa memanggil AcademyRepository ketika
*  menghubungkan ViewModel dengan Activity atau Fragment.
* */