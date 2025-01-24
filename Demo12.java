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

// =============================================

// =============================================

// class Casting {
//     public void show1() {
//         System.out.println("Showing in parent class");
//     }
// }

// class castingCopy extends Casting {
//     public void show2() {
//         System.out.println("Showing in child class");
//     }
// }

public class Demo12 {
    public static void main(String[] args) {
        // 43. Object Class toString(), equals(), hashCode() In Java
        // a) toString()
        // Phone obj = new Phone();
        // obj.brand = "Samsung";
        // obj.price = 17500;

        // System.out.println(obj); // By default, calls "obj.toString()"

        // b) equals()
        // Phone obj1 = new Phone();
        // obj1.brand = "Xiaomi";
        // obj1.price = 17500;

        // System.out.println(obj.equals(obj1));

        // c) hashCode()
        // Phone obj1 = new Phone();
        // obj1.brand = "Apple";
        // obj1.price = 69999;

        // System.out.println(obj1.hashCode());

        // =============================================

        // =============================================

        // 44. UpCasting & Downcasting In Java
        // a) UpCasting
        // Casting obj = (Casting) new castingCopy();
        // obj.show1();

        // b) DownCasting
        // castingCopy obj1 = (castingCopy) obj;
        // obj1.show2();

        // =============================================

        // =============================================

        // 45. Wrapper Class In Java
        // a) Boxing
        // int num1 = 99;
        // Integer num2 = new Integer(22);

        // System.out.println(num2);

        // b) Autoboxing
        // int num3 = 11;
        // Integer num4 = num3;

        // System.out.println(num4);

        // c) Unboxing
        // int num5 = 33;
        // Integer num6 = num5;
        // int num7 = num6.intValue();

        // System.out.println(num7);

        // d) Auto-unboxing
        // int num8 = 33;
        // Integer num9 = num8;
        // int num10 = num9;

        // System.out.println(num10);

        // String str = "45";
        // int num11 = Integer.parseInt(str);

        // System.out.println(num11 * 2);
    }
}