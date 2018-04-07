package tw.com.nanastudio.recyclerviewinmvpsample.book

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import tw.com.nanastudio.recyclerviewinmvpsample.R
import tw.com.nanastudio.recyclerviewinmvpsample.data.Book

/**
 * RecyclerViewInMVPSample
 * Created by Sean Lin on 2018/4/7 4:57 PM.
 */
class RvBookListAdapter(private val presenter: BookListContract.Presenter) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BookViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_book, parent, false))
    }

    override fun getItemCount() = presenter.getBookListCount()

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        presenter.onBindViewHolder(holder as BookViewHolder, position)
    }
}