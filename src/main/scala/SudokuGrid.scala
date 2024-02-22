class SudokuGrid {
  var solution: String = ""
  var input: String = ""
  var rows: Vector[SudokuRow] = Vector[SudokuRow]()
  var columns: Vector[SudokuColumn] = Vector[SudokuColumn]()
  var subgrid: Vector[SubGrid] = Vector[SubGrid]()
  var cages: Vector[Cage] = Vector[Cage]()
}
