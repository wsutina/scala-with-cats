package printableLibrary

object Main {
  def main(args: Array[String]): Unit = {
    val cat = Cat(name = "Kitty", age = 2, color = "white")

    Printable.print(cat)
  }
}
