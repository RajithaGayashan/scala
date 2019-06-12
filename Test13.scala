object Test13{
  def main(args:Array[String]){
    var c= sum(3,4.67F)
    println(c);
  }

  def sum(x:Int,y:Float):Int={
    var ftotal=x+y 
    var itotal=ftotal.toInt
    return itotal
  }


}