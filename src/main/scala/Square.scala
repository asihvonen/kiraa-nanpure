class Square {
  val position: (Int, Int) //the position of the Square on the SudokuGrid
  val solution: Int //the value that the Square must take 
  val value: Int
  var candidates: Vector[Int]
  val row: SudokuRow
  val column: SudokuColumn
  val subgrid: SubGrid
  val cage: Cage

  /**
   * When another square in the same SudokuArea is updated,
   * then the corresponding input will be removed from this square's candidate values
   */
  def update(input: Int) =
    this.candidates(input) == 0
}
