package com.alpha.stoki.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alpha.stoki.network.IndicesRepository
import com.alpha.stoki.network.gson_objects.TickerResponse
import kotlinx.coroutines.launch

class IndicesViewModel(private val repository: IndicesRepository) : ViewModel() {
    private val indices: MutableLiveData<List<TickerResponse>?> = MutableLiveData()

    init {
        viewModelScope.launch {
            indices.value = repository.getIndiceRating()
        }
    }

    suspend fun fetchIndices() {
        try {
            val result = repository.getIndiceRating()
            indices.postValue(result)
        } catch (error: Throwable) {
            throw GetIndicesError("Unable to retrieve indices", error)
        }
    }
}

class GetIndicesError(message: String, cause: Throwable) : Throwable(message, cause)