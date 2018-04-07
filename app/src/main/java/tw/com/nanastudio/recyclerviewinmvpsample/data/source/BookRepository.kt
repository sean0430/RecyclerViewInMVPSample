package tw.com.nanastudio.recyclerviewinmvpsample.data.source

import tw.com.nanastudio.recyclerviewinmvpsample.data.Book

/**
 * RecyclerViewInMVPSample
 * Created by Sean Lin on 2018/4/7 4:42 PM.
 */
object BookRepository {

    fun fetchBookList(): List<Book> {
        return generateBooks()
    }

    private fun generateBooks(): List<Book> {
        val chineseBook = Book("Chinese", 200.0, 5)
        val englishBook = Book("English", 100.0, 1)
        val frenchBook = Book("French", 80.0, 2)
        val germanBook = Book("German", 150.0, 3)
        val russianBook = Book("Russian", 80.0, 2)
        return listOf(chineseBook, englishBook, frenchBook, germanBook, russianBook)
    }
}