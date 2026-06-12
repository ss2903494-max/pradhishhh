public class day7 {

    static class Request {
        private final String name;
        private final String date;
        private final String reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
        }

        void reject() {
        }

        void displayDetails() {
            System.out.println("Name   : " + name);
            System.out.println("Date   : " + date);
            System.out.println("Reason : " + reason);
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approve() {
            System.out.println("Leave request approved.");
        }

        void reject() {
            System.out.println("Leave request rejected.");
        }
    }

    static class LoanRequest extends Request {

        LoanRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approve() {
            System.out.println("Loan request approved.");
        }

        void reject() {
            System.out.println("Loan request rejected.");
        }
    }

    static void main(String[] args) {

        LeaveRequest leaveRequest =
                new LeaveRequest("Pradhish", "12-06-2026", "Medical Leave");

        leaveRequest.displayDetails();
        leaveRequest.approve();

        System.out.println();

        LoanRequest loanRequest =
                new LoanRequest("Pratikaaa", "12-06-2026", "Education Loan");

        loanRequest.displayDetails();
        loanRequest.reject();
    }
}
