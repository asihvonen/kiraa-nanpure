import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

object SudokuCreator {
  def loadGame(): Unit = //should take in a JSON file
    //a JSON file is formatted with "solution", "input", and "cages"
    val json = parse(exampleGame)
    //read JSON file and create a SudokuGrid object
    //create a SudokuGrid

}

val exampleGame: String = """{
  "solution": "215647398368952174794381652586274931142593867973816425821739546659428713437165289",
  "input": "210007398008902174794000652506274000040593867000800425821739546659428000000165280",
  "cages": [
    {"sum": 3, "color": Yellow, "squares": [0, 1]},
    {"sum": 15, "color": Green, "squares": [2, 3, 4]},
    {"sum": 22, "color": Blue, "squares": [5, 13, 14, 21]},
    {"sum": 4, "color": Green, "squares": [6, 15]},
    {"sum": 16, "color": Yellow, "squares": [7, 16]},
    {"sum": 15, "color": Green, "squares": [8, 17, 26, 35]},
    {"sum": 25, "color": Blue, "squares": [9, 10, 18, 19]},
    {"sum": 17, "color": Red, "squares": [11, 12]},
    {"sum": 9, "color": Yellow, "squares": [20, 21, 30]},
    {"sum": 8, "color": Green, "squares": [23, 32, 41]},
    {"sum": 20, "color": Blue, "squares": [24, 25, 33]},
    {"sum": 8, "color": Yellow, "squares": [27, 36]},
    {"sum": 14, "color": Red, "squares": [28, 29]},
    {"sum": 17, "color": Red, "squares": [31, 40, 49]},
    {"sum": 17, "color": Red, "squares": [34, 42, 43]},
    {"sum": 13, "color": Green, "squares": [37, 38, 46]},
    {"sum": 20, "color": Blue, "squares": [39, 48, 57]},
    {"sum": 12, "color": Yellow, "squares": [44, 53]},
    {"sum": 27, "color": Blue, "squares": [45, 54, 63, 72]},
    {"sum": 6, "color": Yellow, "squares": [47, 55, 56]},
    {"sum": 20, "color": Yellow, "squares": [50, 59, 60]},
    {"sum": 6, "color": Blue, "squares": [51, 52]},
    {"sum": 10, "color": Green, "squares": [58, 66, 67, 75]},
    {"sum": 14, "color": Green, "squares": [61, 62, 70, 71]},
    {"sum": 8, "color": Green, "squares": [64, 73]},
    {"sum": 16, "color": Red, "squares": [65, 74]},
    {"sum": 15, "color": Red, "squares": [68, 69]},
    {"sum": 13, "color": Yellow, "squares": [76, 77, 78]},
    {"sum": 17, "color": Blue, "squares": [79, 80]}
  ]
}"""
