
public class Me implements Tourist {

    static int budget = 3000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        // Define your visit
        System.out.println("Budget is " + budget + "php. ");
        if(budget >= boracay.airFare) {
            System.out.print("Good Hotels, good BORACAY acommodation ");
            budget = budget - boracay.airFare;
            System.out.println("Current budget is " + budget + ".");
    
        } else 
          System.out.println("Kulang pera mo bawal ka");
        }
    
    public void visit(Cebu cebu) {
        // Define your visit
        System.out.println("Budget is" + budget + "php. ");
    if(budget >= cebu.airFare) {
        System.out.print("Good Hotels, good CEBU acommodation ");
        budget = budget - cebu.airFare;
        System.out.println("Current budget is " + budget + ".");

    } else 
      System.out.println("Kulang pera mo bawal ka");
    }

    public void visit(Leyte leyte) {
        // Define your visit
        System.out.println("Budget is" + budget + "php. ");
        if(budget >= leyte.airFare) {
            System.out.print("Good Hotels, good LEYTE acommodation ");
            budget = budget - leyte.airFare;
            System.out.println("Current budget is " + budget + ".");
    
        } else 
          System.out.println("Kulang pera mo bawal ka");
        }
    

    public void visit(Leytedelsur leytedelsur) {
        // Define your visit
        System.out.println("Budget is " + budget + "php. ");
        if(budget >= leytedelsur.airFare) {
            System.out.print("Good Hotels, good LEYTE DEL SUR acommodation ");
            budget = budget - leytedelsur.airFare;
            System.out.println("Current budget is " + budget + ".");
    
        } else 
          System.out.println("Kulang pera mo bawal ka");
        }

        public void visit(Coron coron) {
            // Define your visit
            System.out.println("Budget is " + budget + "php . ");
            if(budget >= coron.airFare) {
                System.out.print("Good Hotels, good CORON acommodation ");
                budget = budget - coron.airFare;
                System.out.println("Current budget is " + budget + ".");
        
            } else 
              System.out.println("Kulang pera mo bawal ka");
            }

    public void visit(Palawan palawan) {
        // Define your visit
        System.out.println("Budget is " + budget + "php . ");
        if(budget >= palawan.airFare) {
            System.out.print("Good Hotels, good PALAWAN acommodation ");
            budget = budget - palawan.airFare;
            System.out.println("Current budget is " + budget + ".");
    
        } else 
          System.out.println("Kulang pera mo bawal ka");
        }

    public void checkBudget() {
        System.out.println("my budget is 10,000php" + budget);
    }
    
    }

