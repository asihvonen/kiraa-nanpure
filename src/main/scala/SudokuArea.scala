sealed trait SudokuArea(val id: Int, val squares: Vector[Square]) {
  //var conflict: Boolean

  def update(square: Square) = ???
    /*
    val input = square.value
    this.squares.foreach(_.update(input))
    if this.squares.exists(_.value == input) then conflict = true
     */
}

class SudokuRow(val id: Int, val squares: Vector[Square]) extends SudokuArea(id, squares)
class SudokuColumn(val id: Int, val squares: Vector[Square]) extends SudokuArea(id, squares)
class SubGrid(val id: Int, val squares: Vector[Square]) extends SudokuArea(id, squares)

class Cage(val id: Int, val squares: Vector[Square]) extends SudokuArea(id, squares) {
  val sum: Int
  //val color: Color
  override def update() = ??? //Cage should not have an update method.
}