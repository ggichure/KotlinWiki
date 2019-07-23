package com.android.kotlinwiki.providers

import com.android.kotlinwiki.models.Urls
import com.android.kotlinwiki.models.WikiResult
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.github.kittinunf.fuel.httpGet
import com.google.gson.Gson
import java.io.Reader
import java.lang.Exception

class ArtcileDataProvider {
    init {
        FuelManager.instance.baseHeaders= mapOf("USER-AGENT" to "PLURALSIGHT ALEXDUNN COURSE")
    }


    fun Search(term:String,skip:Int ,take:Int, responseHandler:(result: WikiResult) -> Unit?){
        Urls.getSearchUrl(term,skip,take).httpGet().responseObject(WikipediaDataDeserializer()){_,_, result->
          //do something with result
            val(data,_) =result
            responseHandler.invoke(data as WikiResult)
        }
        fun getRandom(take: Int, responseHandler: (result: WikiResult) -> Unit?){
            Urls.getRandomurl(take).httpGet().responseObject(WikipediaDataDeserializer()){_,response, result->
                if (response.statusCode !=200){
                    throw Exception("unable to get articles")
                }
                val(data,_) =result
                responseHandler.invoke(data as WikiResult)

            }
        }
    }
    class WikipediaDataDeserializer :ResponseDeserializable<WikiResult> {
        override fun deserialize(reader: Reader): WikiResult? {
            return Gson().fromJson(reader,WikiResult::class.java)
        }
    }
}