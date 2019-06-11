object Test12{
  def main(args:Array[String]){
    def a=add(3,4.34)
    println(a);

    def b=sub(56,6.7F)
    println(b)
  }

  def add(x:Int,y:Double):Double={
      var total=x+y
      return total
  }

  def sub(x:Int,y:Float):Float={
    var subm=x-y
    return subm
  }
}