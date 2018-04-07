package tw.com.nanastudio.recyclerviewinmvpsample.book

import tw.com.nanastudio.recyclerviewinmvpsample.data.source.BookRepository

/**
 * RecyclerViewInMVPSample
 * Created by Sean Lin on 2018/4/7 3:50 PM.
 */
class BookListPresenter(val bookRepository: BookRepository, val view: BookListContract.View) : BookListContract.Presenter {

    override fun start() {
        loadBook()
    }

    override fun loadBook() {
        val bookList = bookRepository.fetchBookList()
        view.showBooks(bookList)
    }
}