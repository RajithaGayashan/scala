object Test10{
  def main(args:Array[String]){
    var number =0;
    do{
      println("Enter the number : ")
      number =scala.io.StdIn.readInt();
    }
    while(number!=10)
      print("You entered number 10")
  }
}