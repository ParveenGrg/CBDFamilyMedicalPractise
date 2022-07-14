import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to 'CBD family medical practise'");
        System.out.println("***********************************************************");

        // create variables

        int patientAge;
        int serviceLevel;
        String insuranceStatus;
        double amountPayable;
        String repeat;
        // create loop

        while (true) {
            // prompt user for patient age

            System.out.println("Choose patient age: (type numbers from 1-6 to choose)");
            System.out.println("1) Babies aged 0-2");
            System.out.println("2) Toddlers aged 2-5");
            System.out.println("3) Kids aged 5-12");
            System.out.println("4) Teens aged 12-18");
            System.out.println("5) Adults aged 18-60");
            System.out.println("6) Pensioner aged - above 60");

            patientAge = input.nextInt();

            // prompt user for service level

            System.out.println("Choose Service level: (type numbers from 1-4 to choose)");
            System.out.println("1) GP service");
            System.out.println("2) Pathology");
            System.out.println("3) Eye-check up");
            System.out.println("4) Dental");

            serviceLevel = input.nextInt();

            // calculate amount payable

            if (patientAge == 1) {

                if (serviceLevel == 1) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 150.0 * 0.7;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 150.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 2) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 300.0 * 0.8;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 300.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 3) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 250.0 * 0.6;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 250.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 4) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 200.0 * 0.6;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 200.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                }

            } else if (patientAge == 2) {

                if (serviceLevel == 1) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 100.0 * 0.75;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 100.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 2) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 300.0 * 0.8;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 300.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 3) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 250.0 * 0.65;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 250.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 4) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 300.0 * 0.5;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 300.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                }

            } else if (patientAge == 3) {

                if (serviceLevel == 1) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 95.0 * 0.8;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 95.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 2) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 300.0 * 0.8;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 300.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 3) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 200.0 * 0.7;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 200.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 4) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 300.0 * 0.6;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 300.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                }

            } else if (patientAge == 4) {

                if (serviceLevel == 1) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 90.0 * 0.85;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 90.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 2) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 300.0 * 0.8;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 300.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 3) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 195.0 * 0.7;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 195.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 4) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 350.0 * 0.5;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 350.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                }

            } else if (patientAge == 5) {

                if (serviceLevel == 1) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 80.0 * 0.9;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 80.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 2) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 300.0 * 0.8;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 300.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 3) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 180.0 * 0.8;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 180.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                } else if (serviceLevel == 4) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 360.0 * 0.6;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 360.0;

                        System.out.println("Amount Payable - $" + amountPayable);

                    }

                }

            } else if (patientAge == 6) {

                if (serviceLevel == 1) {

                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");

                    insuranceStatus = input.next();

                    if (insuranceStatus.equals("Yes")) {

                        amountPayable = 70.0 * 0.95;

                        System.out.println("Amount Payable - $" + amountPayable);

                    } else {

                        amountPayable = 70.0;

                        System.out.println("Amount Payable - $" + amountPayable);
                    }
                } else if (serviceLevel == 2) {
                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");
                    insuranceStatus = input.next();
                    if (insuranceStatus.equals("Yes")) {
                        amountPayable = 300.0 * 0.8;
                        System.out.println("Amount Payable - $" + amountPayable);
                    } else {
                        amountPayable = 300.0;
                        System.out.println("Amount Payable - $" + amountPayable);
                    }
                } else if (serviceLevel == 3) {
                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");
                    insuranceStatus = input.next();
                    if (insuranceStatus.equals("Yes")) {
                        amountPayable = 150.0 * 0.95;
                        System.out.println("Amount Payable - $" + amountPayable);
                    } else {
                        amountPayable = 150.0;
                        System.out.println("Amount Payable - $" + amountPayable);
                    }
                } else if (serviceLevel == 4) {
                    System.out.println("Does the patient have Medicare/private insurance? (Type yes/no)");
                    insuranceStatus = input.next();
                    if (insuranceStatus.equals("Yes")) {
                        amountPayable = 400.0 * 0.85;
                        System.out.println("Amount Payable - $" + amountPayable);
                    } else {
                        amountPayable = 400.0;
                        System.out.println("Amount Payable - $" + amountPayable);
                    }
                }
            }
            System.out.println("Do you want to repeat for another customer? (Type yes/no)");
            repeat = input.next();
        }
    }
}