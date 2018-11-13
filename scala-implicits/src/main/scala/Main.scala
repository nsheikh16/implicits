


object PathImplicits {
  import java.nio.file._
   import java.nio.file.StandardOpenOption._

  
  implicit class Task(path1 : Path){
    def / (st: String) : Path  =path1.resolve(st)
    def / (path2 : Path): Path = path1.resolve(path2)
    def write(str : String): Path = Files.write(path1, str.getBytes)
    def append(str: String) :Path = if (Files.exists(path1)){Files.write(path1,str.getBytes,StandardOpenOption.APPEND)} else { Files.write(path1,str.getBytes)}
    def read() : String = new String(Files.readAllBytes(path1))
    }
  implicit class Task2(st: String){
    def / (str: String) :Path =Paths.get(st).resolve(str)
    def / (path2: Path) : Path = Paths.get(st).resolve(path2)
    }
  
 /* implicit class Task5(path: Path){
    def read (str :String) :Path = Files.readAllBytes(path)
    }*/
 


}

object TimeImplicits {
  import java.time.LocalDate
implicit class Date(date : Int){
  def jan() : LocalDate = LocalDate.of(LocalDate.now().getYear, 1, date)
  def feb() : LocalDate = LocalDate.of(LocalDate.now().getYear, 2, date)
  def mar() : LocalDate = LocalDate.of(LocalDate.now().getYear, 3, date)
  def apr() : LocalDate = LocalDate.of(LocalDate.now().getYear, 4, date)
  def may() : LocalDate = LocalDate.of(LocalDate.now().getYear, 5, date)
  def jun() : LocalDate = LocalDate.of(LocalDate.now().getYear, 6, date)
  def jul() : LocalDate = LocalDate.of(LocalDate.now().getYear, 7, date)
  def aug() : LocalDate = LocalDate.of(LocalDate.now().getYear, 8, date)
  def sep() : LocalDate = LocalDate.of(LocalDate.now().getYear, 9, date)
  def oct() : LocalDate = LocalDate.of(LocalDate.now().getYear, 10, date)
  def nov() : LocalDate = LocalDate.of(LocalDate.now().getYear, 11, date)
  def dec() : LocalDate = LocalDate.of(LocalDate.now().getYear, 12, date)

  def jan(y : Int) : LocalDate = LocalDate.of(y, 1, date)
  def feb(y : Int) : LocalDate = LocalDate.of(y, 2, date)
  def mar(y : Int) : LocalDate = LocalDate.of(y, 3, date)
  def apr(y : Int) : LocalDate = LocalDate.of(y, 4, date)
  def may(y : Int) : LocalDate = LocalDate.of(y, 5, date)
  def jun(y : Int) : LocalDate = LocalDate.of(y, 6, date)
  def jul(y : Int) : LocalDate = LocalDate.of(y, 7, date)
  def aug(y : Int) : LocalDate = LocalDate.of(y, 8, date)
  def sep(y : Int) : LocalDate = LocalDate.of(y, 9, date)
  def oct(y : Int) : LocalDate = LocalDate.of(y, 10, date)
  def nov(y : Int) : LocalDate = LocalDate.of(y, 11, date)
  def dec(y : Int) : LocalDate = LocalDate.of(y, 12, date)
  }

 implicit class RichDate(day: LocalDate)
  {
    def +(x: (Int, Int)): LocalDate = 
    {
      if(x._2 == 1){day.plusDays(x._1)
      }
      else if(x._2 == 2){day.plusMonths(x._1)
      }
      else
      { day.plusYears(x._1) }
    }
  }

  implicit class Dates(n : Int){
    def months(): (Int,String) = (n, "months")
    def days() : (Int, String) = (n, "days")
    def years() : (Int, String) = (n,"years")
    }

  
  
  

}