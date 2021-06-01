package `in`.bitcode.customview2

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListPopupWindow
import android.widget.TextView

class ProductView(context : Context, attrs : AttributeSet?) : LinearLayout(context, attrs) {

    var imgProduct : ImageView
    var txtProductTitle : TextView
    var txtProductPrice : TextView
    var txtProductRating : TextView

    var product : Product? = null
    get() = field
    set(value) {
        field = value
        if(value != null) {
            imgProduct.setImageResource(product?.imageId!!)
            txtProductPrice.setText(product?.price.toString())
            txtProductTitle.setText(product?.title)
            txtProductRating.setText(product?.rating.toString())
        }
    }

    constructor(context : Context): this(context, null)

    init {

        layoutParams = LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        var view =  LayoutInflater.from(context)
            .inflate(R.layout.product_view_vertical, null)
        this.addView(view)

        imgProduct = view.findViewById(R.id.imgProduct)
        txtProductTitle = view.findViewById(R.id.txtProductName)
        txtProductPrice = view.findViewById(R.id.txtProductPrice)
        txtProductRating = view.findViewById(R.id.txtRating)
    }

}