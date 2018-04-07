package tw.com.nanastudio.recyclerviewinmvpsample.book

import tw.com.nanastudio.recyclerviewinmvpsample.BasePresenter
import tw.com.nanastudio.recyclerviewinmvpsample.BaseView
import tw.com.nanastudio.recyclerviewinmvpsample.data.Book

/**
 * RecyclerViewInMVPSample
 * Created by Sean Lin on 2018/4/7 3:46 PM.
 */
interface BookListContract{

    interface View:BaseView<Presenter>{
        fun showBooks(bookList: List<Book>)
    }

    interface Presenter:BasePresenter {
        fun loadBook()
    }

}