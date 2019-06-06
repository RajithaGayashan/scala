object Test5{
  def main(args:Array[String]){
        print("Enter your marks : ")
        var marks=scala.io.StdIn.readInt();
        if(marks>=75 && marks<=100){
            println("A Pass");
        }
        else if(marks>=65 && marks<=74){
            println("B Pass");
        }
        else if(marks>=55 && marks<=64){
            println("C Pass");
        }
        else if(marks>=45 && marks<=54){
            println("S Pass");
        }
        else
            print("Fail");
         
        }
}