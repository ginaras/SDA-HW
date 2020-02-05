package advancedHW;
// ex 1 pag 34
public class clAbstr {
    public static void main(String[] args) {
        Animal myDog = new Dog("pechinez",12,4);
        myDog.caracteristics();
        Animal myKat = new Kat("birmaneza", 1.55,4);
        myKat.caracteristics();
    }
}

     abstract class  Animal{
            String kind; double weight; int legNr;
            public Animal(String kind, double weight,int legNr)
            {
                this.kind = kind;
                this.weight = weight;
                this.legNr =legNr;
            }
                public String getKind() {return kind;}
                public double getWeight () {return weight;}
                public int getLegNr() {return legNr;}


         public abstract void caracteristics();
        }

    class Dog extends  Animal{

        public Dog(String kind, double weight, int legNr) {
            super( kind, weight, legNr );}

        @Override
        public void caracteristics() {
        System.out.println("Dog is: "+getKind()+", weight: "+ getWeight()+", legs: "+getLegNr());
        }
     }

    class Kat extends Animal {
        public Kat(String kind, double weight, int legNr) {
            super(kind, weight, legNr);
        }

        @Override
        public void caracteristics() {
            System.out.println("Kat is: "+getKind()+", weight: "+ getWeight()+", legs: "+getLegNr());
        }
    }


