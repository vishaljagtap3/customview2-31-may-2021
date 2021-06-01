package `in`.bitcode.customview2

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class ProductsAdapter(var products: ArrayList<Product>) :
    RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    //older way
    /*class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgProduct : ImageView = itemView.findViewById(R.id.imgProduct)
        var txtProductTitle: TextView = itemView.findViewById(R.id.txtProductName)
        var txtProductPrice : TextView = itemView.findViewById(R.id.txtProductPrice)

    }*/

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productView: ProductView = itemView as ProductView
    }

    override fun getItemCount(): Int = products.size

    //older way
    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.product_view, null)
        )
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder =
         ProductViewHolder(ProductView(parent.context))

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.productView.product = products.get(position)
        holder.productView.setBackgroundColor( Color.rgb(
            Math.abs(Random.nextInt()) % 256,
            Math.abs(Random.nextInt()) % 256,
            Math.abs(Random.nextInt()) % 256)
        )
    }

    //older way
    /*override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var product = products.get(position)
        holder.imgProduct.setImageResource( product.imageId )
        holder.txtProductPrice.setText( product.price.toString())
        holder.txtProductTitle.setText(product.title)
    }*/
}