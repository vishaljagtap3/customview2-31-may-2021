package `in`.bitcode.customview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var products: ArrayList<Product> = ArrayList()
    lateinit var recyclerProducts: RecyclerView
    lateinit var productsAdapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 4))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 3))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 3))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 4))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 5))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 2))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 1))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 4))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 3))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 3))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 4))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 5))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 2))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 1))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 4))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 3))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 3))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 4))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 5))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 2))
        products.add(Product(R.mipmap.ic_launcher, "Notebook", 2132.34f, 1))


        init()
    }

    private fun init() {
        recyclerProducts = findViewById(R.id.recyclerProducts)
        recyclerProducts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        productsAdapter = ProductsAdapter(products)
        recyclerProducts.adapter = productsAdapter

    }
}