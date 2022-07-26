object Q5 extends App{
    // Running time for easy phase
    def easy(x: Int): Int = x*8 // x -> easy phase km(s) 8 -> easy phase speed

    //Running time for tempo phase
    def tempo(x: Int): Int = x*7 // x -> tempo phase km(s) 7 -> tempo phase speed 

    //The total running time:
    println(easy(2) + tempo(3) + easy(2))
}