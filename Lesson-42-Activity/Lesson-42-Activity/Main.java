
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java


//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {


 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}


  void init() {
   


    String queryResult="";
    String sql ="";
   
    Database db = new Database("jdbc:sqlite:" );  
   
    sql = "UPDATE cr101 SET Room = 122 WHERE StudentId = 'STUDENT1001'";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);


    sql = "DELETE Course FROM cr101 WHERE StudentId = 1200 AND WHERE Course = 'ZQCTEDA'";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);


    sql = "UPDATE cr101 SET Room = 213 WHERE Teacher1 = 'DOYLE' AND (Period = 4 OR Period = 5)";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);


   
   
     
      }    
}
