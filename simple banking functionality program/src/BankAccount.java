public class BankAccount {
    public static void main(String[] args){

        //building some bank account functionality
        double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw;

        // Now, you’ve decided to split your balance evenly 3 ways and give it to your three best friends.
        double amountForEachFriend = updatedBalance / 3;

        //Your friends each want to buy a concert ticket with the money you’ve given them. The tickets cost 250!
        boolean canPurchaseTicket=  250 !=  amountForEachFriend;

        System.out.println("I gave each friend " + amountForEachFriend + "...");

    }
}
