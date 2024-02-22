class Square(val position: (Int, Int), val solution: Int, val cage: Cage) {
   //the position of the Square on the SudokuGrid
   //the value that the Square is defined to take
   //the cage that the Square is defined to be in
  val value: Int //the value that the user has input
  var candidates: Vector[Int] //
  val row: SudokuRow = ???//sudokuGrid.rows(position._1) -> for this to work, Square must be able to access instance of SudokuGrid
  val column: SudokuColumn = ??? //sudokuGrid.columns(position._2)
  val subgrid: SubGrid = ???

  /**
   * When another square in the same SudokuArea is updated,
   * then the corresponding input will be removed from this square's candidate values
   */
  def update(input: Int) =
    this.candidates(input) == 0
}
