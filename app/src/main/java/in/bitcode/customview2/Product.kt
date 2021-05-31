package `in`.bitcode.customview2

import java.io.Serializable

class Product(
    var imageId: Int,
    var title: String,
    var price: Float,
    var rating : Int
) : Serializable {

}