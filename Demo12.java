// import java.util.Objects;

// class Phone {
//     String brand;
//     int price;

//     public String toString() {
//         return "Brand is " + brand + " & Price is " + price;
//     }

//     public boolean equals(Phone that) {
//         // if (this.brand.equals(that.brand) && this.price == that.price)
//         //     return true;
//         // else
//         //     return false;

//         return this.brand.equals(that.brand) && this.price == that.price;
//     }

//     public int hashCode() {
//         int hash = 0;
//         hash = 1 * hash + Objects.hashCode(this.brand);
//         hash = 1 * hash + this.price;
//         return hash;
//     }
// }

public class Demo12 {
    public static void main(String[] args) {
        // 43. Object Class toString(), equals(), hashCode() In Java
        // 1. toString()
        // Phone obj = new Phone();
        // obj.brand = "Samsung";
        // obj.price = 17500;

        // System.out.println(obj); // By Default, Calls "obj.toString()"

        // 2. equals()
        // Phone obj1 = new Phone();
        // obj1.brand = "Xiaomi";
        // obj1.price = 17500;

        // System.out.println(obj.equals(obj1));

        // 3. hashCode()
        // Phone obj1 = new Phone();
        // obj1.brand = "Apple";
        // obj1.price = 69999;

        // System.out.println(obj1.hashCode());

        
    }
}