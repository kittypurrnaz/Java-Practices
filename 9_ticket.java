public class Practice {

    public static void main(String[] args) {
        int ticketCode = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a ticket code [1,2,3] : ");
        ticketCode = kb.nextInt();

        switch (ticketCode) {
            case 1:
                ticketCode = 1;
                System.out.println("Seat location: orchestra");
                break;
            case 2:
                ticketCode = 2;
                System.out.println("Seat location: Mezzanine");
                break;
            case 3:
                ticketCode = 3;
                System.out.println("Seat location: Balcony");
                break;
            default:
                System.out.println("Unknown ticket code");
                return;

        }
    }
}
