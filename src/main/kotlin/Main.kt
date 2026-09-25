fun main() {
   val playerField = Array(size = 10) { CharArray( size = 10){ '.' }}
    playerField[3][2] = '#'
    playerField[3][3] = '#'
    playerField[3][4] = '#'
    playerField[3][5] = '#'

    val enemyField = Array(size = 10) { CharArray( size = 10){ '.' }}

    println("   === Your pole ===")
    print("  ")
    for (c in 0..9) print("$c ")
    println()
    for (r in 0..9) {
        print("$r ")
        for (c in 0..9) print("${playerField[r][c]} ")
        println()
    }

    println("   === Enemy pole ===")
    print("  ")
    for (c in 0..9) print("$c ")
    println()
    for (r in 0..9) {
        print("$r ")
        for (c in 0..9) print("${enemyField[r][c]} ")
        println()
    }
}