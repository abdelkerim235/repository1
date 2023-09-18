create a function that accepts the number of concert tickets sold through a web service, and the cost of one ticket, taking into account a fixed commission, the function should return the total revenue from ticket sales
public class TicketRevenueCalculator {
    public static double calculateTotalRevenue(int numTicketsSold, double ticketCost, double commissionRate) {
        // Calculate the total revenue considering the commission
        double totalRevenue = numTicketsSold * ticketCost;
        double commission = totalRevenue * commissionRate;
        totalRevenue -= commission;
        
        return totalRevenue;
    }

    public static void main(String[] args) {
        int numTicketsSold = 100;      // Example: Number of tickets sold
        double ticketCost = 50.0;     // Example: Cost of one ticket
        double commissionRate = 0.10; // Example: 10% commission rate

        double totalRevenue = calculateTotalRevenue(numTicketsSold, ticketCost, commissionRate);
        System.out.println("Total revenue from ticket sales: $" + totalRevenue);
    }
