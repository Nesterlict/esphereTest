package dmitrii.gusev.esphere;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > targetAge) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        }
        return groupsNames;
    }

    public Set<String> findOldMembersStream(List<MembersGroup> groups, int targetAge){
        Set<String> groupsNames = groups.stream()
                .flatMap(x -> x.getMembers().stream())
                .filter(a -> a.getAge()>targetAge)
                .map(Member::getName)
                .collect(Collectors.toSet());
        return groupsNames;
    }

}
