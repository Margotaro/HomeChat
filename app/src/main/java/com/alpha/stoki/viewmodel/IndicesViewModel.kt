package com.alpha.stoki.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alpha.stoki.network.PolygonIndexData
import com.alpha.stoki.network.IndicesRepository
import kotlinx.coroutines.launch
import com.alpha.stoki.network.API_KEY


class IndicesViewModel : ViewModel() {
    private val _indices: MutableLiveData<List<PolygonIndexData>> = MutableLiveData()
    private val repository: IndicesRepository = IndicesRepository()
    val indices: MutableLiveData<List<PolygonIndexData>>
        get() {
            if(!_indices.isInitialized)
                updateIndices()
            return _indices
        }
    init {
        viewModelScope.launch {
            val result = repository.getAllTickers(API_KEY, "indices")
            _indices.postValue(result.results)
        }
    }

    private fun updateIndices() {
        viewModelScope.launch {
            try {
                val result = repository.getAllTickers(API_KEY, "indices")
                _indices.postValue(result.results)
            } catch (error: Throwable) {
                throw GetIndicesError(error.message.toString(), error)
            }
        }
    }
}

class GetIndicesError(message: String, cause: Throwable) : Throwable(message, cause)