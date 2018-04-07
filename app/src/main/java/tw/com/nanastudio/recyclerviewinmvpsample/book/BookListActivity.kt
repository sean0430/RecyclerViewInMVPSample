package tw.com.nanastudio.recyclerviewinmvpsample.book

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import tw.com.nanastudio.recyclerviewinmvpsample.R
import tw.com.nanastudio.recyclerviewinmvpsample.data.Book
import tw.com.nanastudio.recyclerviewinmvpsample.data.source.BookRepository

class BookListActivity : AppCompatActivity(), BookListContract.View {

    private lateinit var presenter: BookListContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        presenter = BookListPresenter(BookRepository, this)
        setPresenter(presenter)
    }

    override fun onResume() {
        super.onResume()
        presenter.start()
    }

    override fun setPresenter(presenter: BookListContract.Presenter) {
        this.presenter = presenter
    }

    override fun showBooks(bookList: List<Book>) {
        val tvBooks = findViewById<RecyclerView>(R.id.rvBooks)
        tvBooks.hasFixedSize()
        val linearLayoutManager = LinearLayoutManager(this)
        tvBooks.layoutManager = linearLayoutManager
        val adapter = RvBookListAdapter(presenter)
        tvBooks.adapter = adapter
    }
}
