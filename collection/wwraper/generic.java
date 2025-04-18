package collection.wwraper;
// so it is mainly used for the making the java any int data types to the any data type or to covert the data types to the other type of the data types by the class
public class generic {
    public static void main(String[] args) {
        dog <String>obj = new dog<>("Hari");
        System.out.println(obj.data());
        // this is how we can set the any type of data we want to write 

        dog <Integer> obj2 = new dog<>(5);
        System.out.println(obj2.data());
        // here we can seee that in the same type of the data type we are using the two type of data type 
        
    }
}
class dog <E>{
        E name;
        public dog(E name) {
            this.name = name;
        }
        //  this is how we use the normal code for the data saving but what if we want to change the data we have to write the proper code for that also 
       E data () {
            return  name;
        }
}
