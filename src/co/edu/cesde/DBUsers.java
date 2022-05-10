package co.edu.cesde;
import java.util.ArrayList;
import java.util.List;

public class DBUsers {
    private List<Admin> admins;
    private List<CleaningStaff> cleaning;
    private List<Watchmen> watchman;

    public DBUsers() {
        admins = new ArrayList<>();
        cleaning = new ArrayList<>();
        watchman = new ArrayList<>();
    }

    public void setAdmin(Admin adm) {
        admins.add(adm);
    }

    public void setCleaningStaff(CleaningStaff cln) {
        cleaning.add(cln);
    }

    public void setWatchman(Watchmen wth) { watchman.add(wth);
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public List<CleaningStaff> getCleaning() {
        return cleaning;
    }

    public void setCleaning(List<CleaningStaff> cleaning) {
        this.cleaning = cleaning;
    }

    public List<Watchmen> getWatchman() {
        return watchman;
    }

    public void setWatchman(List<Watchmen> watchman) {
        this.watchman = watchman;
    }
}
