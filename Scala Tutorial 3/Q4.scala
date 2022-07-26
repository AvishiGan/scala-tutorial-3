object Q4 extends App{
    //The total amount for books
    def totalBooksPrice(x: Int): Double = x*24.95 // x - number of books

    // Discount
    def totalDiscount(totalAmount: Double): Double = totalAmount*0.4

    // Shipping Cost
    def shippingCost(x: Int): Double= 3*x + (x-50)*0.75  /*first 50 copies -> 3 rupees and each additional copy -> 75 cents*/

    // The total wholesale cost for books
    println(totalBooksPrice(60) - totalDiscount(totalBooksPrice(60)) + shippingCost(60))
}