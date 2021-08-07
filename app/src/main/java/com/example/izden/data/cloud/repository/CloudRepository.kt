package com.example.izden.data.cloud.repository

import com.example.izden.data.cloud.rest.ApiService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class CloudRepository(
    private val api: ApiService,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
): BaseCloudRepository {


//    override suspend fun getTrendingMovies(page: Int): ResultWrapper<JsonResults> {
//        return safeApiCall(dispatcher) {
//            api.getTrendingMovies(page)
//        }
//    }


}