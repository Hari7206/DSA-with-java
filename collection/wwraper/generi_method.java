package collection.wwraper;
// so here we can see that we are able to make the same type of data type method and more easy then the class we have not to even said the integar or what kind of data type we have to change in this 
public class generi_method {
    public static void main(String[] args) {
        datare("Hari");
        datare(56);

        // here we can see by this our method id made to change and conver the any data type to other and we can easkly store the any type of data types we want .it is very useful in the devlopment and the data structure cause we can have to access or store the any type of data type anywhere 
    }
     static <E> void  datare( E data ) {
        System.out.println(data);
    }
}
