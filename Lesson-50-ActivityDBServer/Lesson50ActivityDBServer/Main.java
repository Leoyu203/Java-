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
 
  public static void main(String[] args) throws IOException {
    (new Main()).init();
  }
 
  void print(Object o)  { System.out.println(o); }
  void printt(Object o) { System.out.print(o); }
 
  void init() throws IOException {
 
    int port = 8500;
 

    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
 

    Database db = new Database("jdbc:sqlite:cruise.db");
 

    server.createContext("/", new RouteHandler("Cruise Ship API is running!"));
 

    String sqlBookings = "SELECT * FROM bookings";
    server.createContext("/bookings", new RouteHandler(db, sqlBookings));
 

    String sqlShips = "SELECT * FROM ships";
    server.createContext("/ships", new RouteHandler(db, sqlShips));

    String sqlJail = "SELECT * FROM jail";
    server.createContext("/jail", new RouteHandler(db, sqlJail));
 

    String sqlSearch = 
  "SELECT bookings.fname, bookings.lname, bookings.Destination, "+ 
  "bookings.line, bookings.cost, "+
  "ships.image_url, ships.capacity, ships.home_port "+
  "FROM bookings "+
  "INNER JOIN ships ON bookings.line = ships.cruise_line";
 
    server.createContext("/search", new RouteHandler(db, sqlSearch));

    server.start();
    print("Server is listening on port " + port);
  }
}

