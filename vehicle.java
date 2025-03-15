package OopInJava;

public class vehicle {
    String name;
    int  wheels;
    String colour;
    int passangerCapcity;
    int distace;
    int fuel;

    public void sound (){
        System.out.println("*************hhmm hmmmm hmmmmmm hmmmmmmm*************");
    }
    public void fuel(int amt){
        System.out.println("FULL WITH FUEL");
    }
    public void Distancecovered(){
        System.out.println("initial distance is 0  km ");
    }
    public void refuel(){
        if(distace==5){
            System.out.println(fuel==2) ;
            System.out.println("2 liter fuel is added to the vehicle ");
        }
        else{
            distace++;
            System.out.println("distance covered is "+ this.distace++);// i like it
            fuel++;
            System.out.println("Amount of refuling is "+ this.fuel++);// i like it
        }

    }

    public static void main(String[] args) {
        vehicle obj1= new car();
        vehicle obj2= new  bike();
        System.out.println("name of the vehicle is "+ obj1.name);
        System.out.println("number of wheels in the vechicle is " + obj1.wheels);
        System.out.println("colour of the vehhicle is"+ obj1.colour);
        System.out.println("capacity of the vehicle is "+obj1.passangerCapcity);
        obj1.Distancecovered();//yaha se doubt hai
        System.out.println("***************************");
        System.out.println("name of the vehicle is "+ obj2.name);
        System.out.println("number of the wheels inn the vevehicle is" +obj2.wheels);
        System.out.println("colour of the vehicle is "+obj2.colour);
        System.out.println("capacity of the vehicle is " +obj2.passangerCapcity);
        obj2.Distancecovered();
    }


}
class car extends vehicle{
     car(){
         name="BMW";
         wheels=4;
         colour="blue";
         passangerCapcity=6;
     }
}

class bike extends vehicle{
     bike(){
         this.name="  SPLENDOUR  ";
         this.wheels= 2 ;
         this .colour=" BLAK ";
         this. passangerCapcity=5;
     }
}

