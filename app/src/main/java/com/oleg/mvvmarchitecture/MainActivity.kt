package com.oleg.mvvmarchitecture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oleg.mvvmarchitecture.data.source_movie.MovieRepositoryImpl
import com.oleg.mvvmarchitecture.utilities.mapper.MovieRemoteToMovieMapper
import com.oleg.mvvmarchitecture.utilities.mapper.NullableInputListMapperImpl
import com.oleg.mvvmarchitecture.utilities.service.RetrofitFactory
import com.oleg.mvvmarchitecture.utilities.service.webservice.MovieService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service: MovieService = RetrofitFactory.movieService

        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getNowPlaying(BuildConfig.API_KEY)
            withContext(Dispatchers.Main) {
                try {
                    if (response.isSuccessful) {
                        val nullableMapper = NullableInputListMapperImpl(MovieRemoteToMovieMapper())
                        nullableMapper.map(response.body()?.results)
                        Timber.d("Berhasil Connect")
                        Timber.d(MovieRepositoryImpl(service, nullableMapper).getNowPlayingMovie().toString())
                    } else {
                        Timber.d("Gagal")
                    }
                } catch (e: HttpException) {
                    e.printStackTrace()
                    Timber.d(e.localizedMessage)
                } catch (e: Throwable) {
                    e.printStackTrace()
                    Timber.d(e.localizedMessage)
                }
            }
        }

    }
}
