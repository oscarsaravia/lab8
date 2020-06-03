package com.example.android.laboratorio8.news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.laboratorio8.network.HackerNew
import com.example.android.laboratorio8.network.HackernewsApiStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

class NewsViewModel : ViewModel() {
    private val _githubRepos = MutableLiveData<List<HackerNew>>()
    val githubRepos: LiveData<List<HackerNew>>
        get() = _githubRepos

    private val _status = MutableLiveData<HackernewsApiStatus>()
    val status: LiveData<HackernewsApiStatus>
        get() = _status



    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)
}
