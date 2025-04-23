package stringPackage;

public class StringLiteral {
        public static void main(String[] args) {
            String name="Pihu";
//            name = name+ " Sharma";
//            name.concat(" Sharma")  //will not modify real value
            //name= name.concat(" Sharma")  //will modify real value
            System.out.println(name.concat(" Sharma"));
            System.out.println(name);
        }
}
