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
class RvBookListAdapter(private val bookList: List<Book>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BookViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_book, parent, false))
    }

    override fun getItemCount() = bookList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val book = bookList[position]

        val itemView = (holder as BookViewHolder).itemView

        val tvItem = itemView.findViewById<TextView>(R.id.tvType)
        tvItem.text = book.type

        val tvPrice = itemView.findViewById<TextView>(R.id.tvPrice)
        tvPrice.text = book.price.toString()

        val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
        tvAmount.text = book.amount.toString()
    }
}