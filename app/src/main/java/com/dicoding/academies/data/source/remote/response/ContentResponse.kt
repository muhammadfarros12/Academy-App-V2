package com.dicoding.academies.data.source.remote.response

data class ContentResponse(
    var moduleId: String,
    var content: String
)

//  Anda harus membuat kelas ModelResponse dan sebuah kelas helper untuk membaca JSON jadi Array
