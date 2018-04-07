package tw.com.nanastudio.recyclerviewinmvpsample.book

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import tw.com.nanastudio.recyclerviewinmvpsample.R
import tw.com.nanastudio.recyclerviewinmvpsample.data.Book

/**
 * RecyclerViewInMVPSample
 * Created by Sean Lin on 2018/4/7 5:57 PM.
 */
class BookViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView),
        BookListContract.BookItemView {

    override fun bindData(book: Book) {

        val tvItem = itemView.findViewById<TextView>(R.id.tvType)
        tvItem.text = book.type

        val tvPrice = itemView.findViewById<TextView>(R.id.tvPrice)
        tvPrice.text = book.price.toString()

        val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
        tvAmount.text = book.amount.toString()
    }

}