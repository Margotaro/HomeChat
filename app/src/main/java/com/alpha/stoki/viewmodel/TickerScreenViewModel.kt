package com.alpha.stoki.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alpha.stoki.data.PreferenceStorage
import com.alpha.stoki.factory.TickerFactory
import com.alpha.stoki.model.ITicker
import com.alpha.stoki.network.TickerRepository
import kotlinx.coroutines.launch
import com.alpha.stoki.network.API_KEY


class TickerScreenViewModel : ViewModel() {
    private val _tickers: MutableLiveData<List<ITicker>> = MutableLiveData()
    private val repository: TickerRepository = TickerRepository()
    private val tickerFactory = TickerFactory()
    val indices: MutableLiveData<List<ITicker>>
        get() {
            if(!_tickers.isInitialized)
                updateIndices()
            return _tickers
        }
    init {
        viewModelScope.launch {
            val result = repository.getAllTickers(API_KEY, "indices")
            val itickers = result.results.map { tickerFactory.toITicker(it) }
            _tickers.postValue(itickers)
        }
    }

    private fun updateIndices() {
        viewModelScope.launch {
            try {
                val result = repository.getAllTickers(API_KEY, "indices")
                val itickers = result.results.map { tickerFactory.toITicker(it) }
                _tickers.postValue(itickers)
            } catch (error: Throwable) {
                throw GetIndicesError(error.message.toString(), error)
            }
        }
    }


}

class GetIndicesError(message: String, cause: Throwable) : Throwable(message, cause)

class TickerListItemViewModel(private val preferenceStorage: PreferenceStorage) : ViewModel() {
    private val _bookmarks = mutableStateOf(preferenceStorage.bookmarks)
    val bookmarks: State<Set<String>> = _bookmarks

    fun addBookmark(tag: String) {
        val updatedBookmarks = _bookmarks.value + tag
        _bookmarks.value = updatedBookmarks
        preferenceStorage.bookmarks = updatedBookmarks
    }

    fun removeBookmark(tag: String) {
        val updatedBookmarks = _bookmarks.value - tag
        _bookmarks.value = updatedBookmarks
        preferenceStorage.bookmarks = updatedBookmarks
    }
}