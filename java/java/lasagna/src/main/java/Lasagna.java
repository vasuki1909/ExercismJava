public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
  public  int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
  public  int remainingMinutesInOven(int min){
        return this.expectedMinutesInOven()-min;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
public int preparationTimeInMinutes(int layers){
    return 2*layers;
}
    // TODO: define the 'totalTimeInMinutes()' method
  public int totalTimeInMinutes(int layers, int mins) {
    return this.preparationTimeInMinutes(layers) + mins ;
}
    
    public static void main(String[] args) {
        Lasagna las = new Lasagna();
        System.out.println(las.totalTimeInMinutes(3,20));
        
    }
}
