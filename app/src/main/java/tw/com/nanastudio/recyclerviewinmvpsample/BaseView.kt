package tw.com.nanastudio.recyclerviewinmvpsample


/**
 * RecyclerViewInMVPSample
 * Created by Sean Lin on 2018/4/7 4:46 PM.
 */
interface BaseView<T> {
    fun setPresenter(presenter: T)
}