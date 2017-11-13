package IoSteam;

/**
 * Created by Stelawliet on 17/9/23.
 */
public class Start {
    public static void main(String[] args) {
        SignSet signSet = new SignSet("001","admin");
        signSet.load();
        SignSet signSet1 = new SignSet("001","admin");
        signSet1.load();
        SignSet signSet2 = new SignSet("003","admin");
        signSet2.load();
        SignSet signSet3 = new SignSet("004","admin");
        signSet3.load();
        SignIn.in("001","admin");
        SignIn.in("003","admin");
        SignIn.in("004","admi");
    }
}
