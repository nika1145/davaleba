fun main(args: Array<String>) {
val point = Point(5,2);
    val point2 = Point(5,2)
    println(point.equals(point2))
    point.moveX(21)
    println(point)
}
class Point(x: Int, y: Int) {
    var x = x;
    var y = y;
    public override fun toString(): String {
        return "($x, $y)";

    }

    public  fun equals(point: Point): Boolean {
        return x == point.x && y == point.y
    }
    public fun moveX(v: Int) {
        x += v
    }
    public fun moveY(v: Int) {
        y += v
    }
}
