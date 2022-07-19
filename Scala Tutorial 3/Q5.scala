object Q5 extends App{
    // Running time for easy phase
    def easy(x: Int): Int = x*8

    //Running time for tempo phase
    def tempo(x: Int): Int = x*7

    //The total running time:
    println(easy(2) + tempo(3) + easy(2))
}