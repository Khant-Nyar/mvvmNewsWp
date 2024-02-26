package com.example.newsapp.Model

import com.example.newsapp.Adapter.LAYOUT_CARD
import com.example.newsapp.Adapter.LAYOUT_LIST
import java.io.Serializable

data class ArticleModel(
    val id:Int,
    val title:String,
    val content:String,
    val date:String,
    val excerpt:String,
    val authorName: String? = "Yangon Khit Thit News Agency",
    val authorUrl: String? = "https://yktnews.com/author/phyowaisoeyktnews-com",
    val authorPic:String? = "https://yktnews.com/wp-content/uploads/2022/01/KTICO.png",
    val readingTime:String,
    val image:String,
    val category:Int,
    var LAYOUT_TYPE:Int= LAYOUT_LIST,
):Serializable
