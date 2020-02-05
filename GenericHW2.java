package advancedHW;

import java.lang.reflect.GenericArrayType;

public class GenericHW2  {

    public static void main(String[] args) {
        Object object =new Object( );
        System.out.println(object.toString());

//        GenericSet<Double> ofDouble =
//                new GenericSet<>(Double[]::new);

    }
    interface AraySuplier <E> {
        E[] get(String a, int b, double c);
    }

    class GenericSet <E> implements AraySuplier {

        @Override
        public Object[] =(String a, int b, double c) {
            Object[] objects;
            objects = new Object[3; 5; 6; ];
            return objects;
        }
    }

    }
