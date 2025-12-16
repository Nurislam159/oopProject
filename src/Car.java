 public  class Car {
     private String engine;
     private String color;
     private String wheel;

     public Car(String engine, String color, String wheel) {
         this.engine = engine;
         this.color = color;
         this.wheel = wheel;
     }

     public Car() {
     }

     public String getEngine() {
         return this.engine;
     }
     public String getColor() {
         return this.color;
     }
     public String getWheel() {
         return this.wheel;
     }

     public void setEngine(String  engine) {
         this.engine = engine;
     }
     public void setColor(String  color) {
         this.color = color;
     }
     public void setWheel(String  wheel) {
         this.wheel = wheel;
     }
 }