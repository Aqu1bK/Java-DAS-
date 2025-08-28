public class Product_of_a_and_b {

    public static int Product(int a, int b){
        int Product = a * b;
        return Product;
    }
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        int prod = Product(a, b);
        System.out.println("Product is = " + prod);
    }
}
