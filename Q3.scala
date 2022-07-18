object Q3 extends App{
    def vol(r: Double): Double = 4/3*math.Pi*r*r*r
    printf("%.2f", vol(5))
}