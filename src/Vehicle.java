    public  class  Vehicle {
     private double size ;
     private double weight ;
     private double height;

     public Vehicle(double size , double weight , double height) {
         this.size = size ;
         this.weight= weight;
         this.height = height;
     }

     public Vehicle() {
     }

        public void setSize(double size) {
            this.size = size;
        }

        public double getSize() {
         return size;
     }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
        public void toMove() {
            System.out.println("Vehicle is moving");
        }
    }


