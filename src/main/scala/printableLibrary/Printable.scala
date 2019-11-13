package printableLibrary

// Exercise 1.3: Printable Library

// Declaring Type classes
trait Printable[A] {
  def format(value: A): String
}

// Create type class instance
object PrintableInstance {
  implicit val stringPrintable: Printable[String] = new Printable[String] {
    override def format(value: String): String = value
  }

  implicit val intPrintable: Printable[Int] = new Printable[Int] {
    override def format(value: Int): String = value.toString
  }
}

object Printable {
  def format[A](value: A)(implicit printableInstance: Printable[A]): String = printableInstance.format(value)

  def print[A](value: A)(implicit printableInstance: Printable[A]): Unit = println(format(value))
}

