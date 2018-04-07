package tw.com.nanastudio.recyclerviewinmvpsample.book

import tw.com.nanastudio.recyclerviewinmvpsample.data.Book
import tw.com.nanastudio.recyclerviewinmvpsample.data.source.BookRepository

/**
 * RecyclerViewInMVPSample
 * Created by Sean Lin on 2018/4/7 3:50 PM.
 */
class BookListPresenter(private val bookRepository: BookRepository,
                        val view: BookListContract.View)
    : BookListContract.Presenter {

    private lateinit var bookList: List<Book>

    override fun start() {
        loadBook()
    }

    override fun loadBook() {
        bookList = bookRepository.fetchBookList()
        view.showBooks(bookList)
    }

    override fun getBookListCount() = bookList.size

    override fun onBindViewHolder(bookItemView: BookListContract.BookItemView, position: Int) {
        val book = bookList[position]
        bookItemView.bindData(book)
    }
}