package addressbook.Model;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.Set;


public class Groups extends ForwardingSet<GroupeData> {
    private Set<GroupeData> delegate;

    public Groups(Groups groups) {
        this.delegate = new HashSet<GroupeData>(groups.delegate);
    }

    public Groups() {
        this.delegate = new HashSet<GroupeData>();
    }

    @Override
    protected Set<GroupeData> delegate() {
        return delegate;
    }

    public Groups withAdded(GroupeData group) {
      Groups groups = new Groups(this);
      groups.add(group);
      return groups;
    }
    public Groups without(GroupeData group) {
        Groups groups = new Groups(this);
        groups.remove(group);
        return groups;
    }
}
