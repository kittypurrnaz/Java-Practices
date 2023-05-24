public class Practice {

    public static void main(String[] args) {
        int age = 0, vO2M = 0;
        String genderInputM = "m", genderInputF = "f", gender = " ";

        System.out.println("Enter your gender: ");
        Scanner kb = new Scanner(System.in);
        gender = kb.next();
        System.out.println("Enter VO2Max: ");
        vO2M = kb.nextInt();

        if(gender.equals(genderInputM) && vO2M >= 40 && vO2M <= 60) {
            
                System.out.println("Gender: " + genderInputM);
                System.out.println("VO2Max: " + vO2M);
                System.out.println("Valid for participation. ");
        } 
        else if(gender.equals(genderInputF) && vO2M >= 43 && vO2M <= 60) {
            
                System.out.println("Gender: " + genderInputF);
                System.out.println("VO2Max: " + vO2M);
                System.out.println("Valid for participation.");
            } 
        else {
                System.out.println("Invalid for participation.");
            }

    } 
}