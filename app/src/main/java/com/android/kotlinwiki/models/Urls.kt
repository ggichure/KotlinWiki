package com.android.kotlinwiki.models

object Urls {
    var BaseUrl ="https://en.wikipedia.org/w/api.php"
    fun getSearchUrl(term:String,skip :Int,take :Int ):String {
        return BaseUrl +"?action= query" +
                "&formatversion=2" +
                "&generator=prefixsearch"+
                "&gpssearch=$term" +
                "&gpslimit=$take"+
                "&gpsoffset=$skip" +
                "&prop=pageimages|info"+
                "&piprop=thumbnail|url"+
                "&pithumbsize=200"+
                "&pilimit=$take"+
                "&wbptterms=description"+
                "&format=json"+
                "&inprop=url"
    }
    fun getRandomurl(take:Int):String{
        return BaseUrl +"?action=query"+
                "&formatversion=2" +
                "&generator=random"+
                "&grnnamespace=0"+
                "&prop=pageimages|info"+
                "&grnlimit=$take"+
                "&pithumbsize=200"

    }
}