import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException {

    // create a port
    int port = 8500;

    // create server
    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

    // connect to database
    Database db = new Database("jdbc:sqlite:chinook.db");
    sql = "SELECT tracks.name, tracks.albumid, tracks.unitprice FROM tracks";


    String sql = "SELECT * from tracks";
    server.createContext("/tracks", new RouteHandler(db, sql));

    // default route
    server.createContext("/", new RouteHandler("Defaul route"));

    // start server
    server.start();

    System.out.println("Server is listening on port " + port);
}
}


