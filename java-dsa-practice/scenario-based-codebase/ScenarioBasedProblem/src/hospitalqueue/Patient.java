package hospitalqueue;

class Patient {
    String name;
    int criticality;

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    void display() {
        System.out.println(name + " | Criticality Level : " + criticality);
    }
}