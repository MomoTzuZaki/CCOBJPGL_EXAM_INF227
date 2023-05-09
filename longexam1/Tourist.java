interface Tourist {

    int budget = 10000;

    void visit();

    void visit(Boracay boracay);
    void visit(Cebu cebu);
    void visit(Coron coron);
    void visit(Leyte leyte);
    void visit(Leytedelsur leytedelsur);
    void visit(Palawan palawan);
    

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}