object Test14{
  def main(args:Array[String]){
      show("Hello","World")
  }
  def show(name:String*){
    for(x<-name){
      println(x);
    }
  }
}