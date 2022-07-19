object Q4 extends App{
    def discount(bookPrice: Double): Double = bookPrice * 0.4

    def newBookPrice(bookPrice: Double): Double = bookPrice - discount(bookPrice)

    def newTotalPrice(bookPrice: Double, numberOfBooks: Int): Double = newBookPrice(bookPrice) * numberOfBooks

    def shippingCost(numberOfBooks: Int): Double = numberOfBooks match{
    case x if numberOfBooks>50 => 50 * 3 + (numberOfBooks - 50) * 0.75
    case x if numberOfBooks<= 50 => 50 * 3
    }

    def totalCost(bookPrice: Double, numberOfBooks: Int): Double = newTotalPrice(bookPrice, numberOfBooks) + shippingCost(numberOfBooks)

    printf("%.2f", totalCost(24.95, 60))

}
