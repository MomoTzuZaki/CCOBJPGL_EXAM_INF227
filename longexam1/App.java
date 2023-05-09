

public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
Locations Boracay = new Boracay();
Locations Cebu = new Cebu();
Locations Coron = new Coron();
Locations Leyte = new Leyte();
Locations Leytedelsur = new Leytedelsur();
Locations Palawan = new Palawan();

Tourist Me = new Me();


Boracay.accept(Me);
System.out.println();

Cebu.accept(Me);
System.out.println();

Coron.accept(Me);
System.out.println();

Leyte.accept(Me);
System.out.println();

Leytedelsur.accept(Me);
System.out.println();

Palawan.accept(Me);
System.out.println();
    
    
        // 2. Each location should have an airFare.

        
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}
