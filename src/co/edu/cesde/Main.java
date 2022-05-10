package co.edu.cesde;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DBUsers dbUsers = new DBUsers();
        Scanner scanner = new Scanner(System.in);
        boolean flagClose = false;
        while (flagClose == false) {

            System.out.println("Enter option");
            System.out.println("1 ----- Add Admin User");
            System.out.println("2 ----- Add CleaningStaff User");
            System.out.println("3 ----- Add Watchmen User");
            System.out.println("4 ----- View administration users");
            System.out.println("5 ----- View CleaningStaff users");
            System.out.println("6 ----- View WatchMen users");
            System.out.println("10 ----- Exit");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    Admin admin = new Admin();
                    System.out.println("Enter Name");
                    admin.setName(scanner.nextLine());
                    System.out.println("Enter Identification");
                    admin.setIdentification(scanner.nextLine());
                    System.out.println("Enter Age");
                    admin.setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter work area");
                    admin.setLeader(scanner.nextLine());
                    System.out.println("Enter parking number");
                    admin.setParking(scanner.nextLine());
                    dbUsers.setAdmin(admin);
                    break;

                case 2:
                    CleaningStaff cleaningStaff = new CleaningStaff();
                    System.out.println("Enter Name");
                    cleaningStaff.setName(scanner.nextLine());
                    System.out.println("Enter Identification");
                    cleaningStaff.setIdentification(scanner.nextLine());
                    System.out.println("Enter Age");
                    cleaningStaff.setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter DayOff");
                    cleaningStaff.setDayOff(scanner.nextLine());
                    dbUsers.setCleaningStaff(cleaningStaff);
                    break;

                case 3:
                    Watchmen watchMen = new Watchmen();
                    System.out.println("Enter Name");
                    watchMen.setName(scanner.nextLine());
                    System.out.println("Enter Identification");
                    watchMen.setIdentification(scanner.nextLine());
                    System.out.println("Enter Age");
                    watchMen.setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Enter Ref Weapon");
                    watchMen.setWeapon(scanner.nextLine());
                    System.out.println("Enter WorkDay");
                    watchMen.setWorkday(scanner.nextLine());
                    dbUsers.setWatchman(watchMen);
                    break;

                case 4:
                    System.out.println("Administration Users");
                    System.out.println("Name ----------------- Id ------- Age ---- Area ---- Parking");
                    for(Admin adm1: dbUsers.getAdmins()) {
                                System.out.println(adm1.getName() + " ----- " + adm1.getIdentification()
                                + " ---- " + adm1.getAge() + " ----- " + adm1.getLeader() + " ---- " +
                                adm1.getParking());
                    }
                    break;

                case 5:
                    System.out.println("CleaningStaff Users");
                    System.out.println("Name ----------------- Id ------- Age ---- DayOff");
                    for(CleaningStaff cln1: dbUsers.getCleaning()) {
                        System.out.println(cln1.getName() + " ----- " + cln1.getIdentification()
                                + " ---- " + cln1.getAge() + " ----- " + cln1.getDayOff());
                    }
                    break;

                case 6:
                    System.out.println("WatchMen Users Users");
                    System.out.println("Name ----------------- Id ------- Age ---- Weapon ----- Workday");
                    for(Watchmen wth1: dbUsers.getWatchman()) {
                        System.out.println(wth1.getName() + " ----- " + wth1.getIdentification()
                                + " ---- " + wth1.getAge() + " ----- " + wth1.getWeapon()
                                + " ---- " + wth1.getWorkday()
                        );
                    }
                    break;

                case 10:
                    flagClose = true;
                    break;
            }
        }
    }
}
