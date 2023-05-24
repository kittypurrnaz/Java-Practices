public class Practice {
    
    public static void main(String[] args) {
        
        char gender = ' ';
        int age = 0;
        Scanner kb = new Scanner(System.in);

        
        while(gender != 'm' && gender != 'f') {
            System.out.println("Enter your gender (M/F): ");
            gender = kb.next().charAt(0);
            
        }
        
        while(age < 1 ) {
            System.out.println("Enter age: ");
            age = kb.nextInt();
        }
        
        if(gender != 'f') {
            if(age >= 15) {
                System.out.println("Visitor can enter.");
            }
            else {
                System.out.println("Visitor cannot enter.");
            }
        }
        if(gender != 'm') {
            if(age >= 15) {
                System.out.println("Visitor can enter.");
            }
            else {
                System.out.println("Visitor cannot enter.");
            }
        }
    }
}