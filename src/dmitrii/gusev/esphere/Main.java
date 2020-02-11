package dmitrii.gusev.esphere;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Member ilya = new Member("Ilya",30);
        Member ivan = new Member("Ivan",21);
        Member vasilii = new Member("Vasilii",17);
        Member boris = new Member("Boris",51);
        Member anton = new Member("Anton",34);
        Member sergei = new Member("Sergei",18);
        Member dmitrii = new Member("Dmitrii",24);
        Member grigorii = new Member("Grigorii",41);
        Member alexandr = new Member("Alexandr",47);
        Member alexey = new Member("Alexey",22);

        MembersGroup firstGroup = new MembersGroup("firstGroup",
                new ArrayList<>(Arrays.asList(ilya,ivan,vasilii,boris,anton)));
        MembersGroup secondGroup = new MembersGroup("secondGroup",
                new ArrayList<>(Arrays.asList(sergei,dmitrii,grigorii,alexandr,alexey)));

        List<MembersGroup> groups = new ArrayList<>();
        groups.add(firstGroup);
        groups.add(secondGroup);

        Finder finder = new Finder();
        int targetAge = 27;
        System.out.println(Arrays.toString(finder.findOldMembers(groups,targetAge).toArray()));
        System.out.println(finder.findOldMembersStream(groups,targetAge));
    }
}
