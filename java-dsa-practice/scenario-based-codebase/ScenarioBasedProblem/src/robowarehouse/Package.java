package robowarehouse;

public class Package {
	double weight;
	
	Package(double weight){
		this.weight = weight;
	}
	
    void display() {
        System.out.println("" + weight);
    }

}
