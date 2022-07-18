object Q5 extends App{
    def totalRunningTime(easyPaceDistance: Int, tempoDistance: Int): Int = easyPaceDistance * 8 + tempoDistance * 7
    println(totalRunningTime(4, 3))
}