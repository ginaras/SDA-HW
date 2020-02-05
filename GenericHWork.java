package advancedHW;

public class GenericHWork {
    public static void main(String[] args) {
        Person1 sorin = new Person1(152);
        Person1 alex =new Person1(156);

        System.out.println("diferenta intre Sorin si Alex este de: "+sorin.compareTo(alex)+"cm");
        System.out.println("diferenta intre Sorin si Alex este de: "+alex.compareTo(sorin)+"cm");

        }

        public interface Comparable<Person1> {
        public <Person1>int compareTo(Person1 otherPerson1);}
    }

    class Person1 implements Comparable<Person1> {
        private int hightPerson;

        public Person1(int hightPerson) {
            this.hightPerson = hightPerson;
        }



        @Override
        public int compareTo(Person1 otherPerson1) {
            return this.hightPerson - otherPerson1.hightPerson;
            }
        }


