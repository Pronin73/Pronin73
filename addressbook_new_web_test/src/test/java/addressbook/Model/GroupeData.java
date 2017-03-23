package addressbook.Model;

public class GroupeData {
    private  int id = Integer.MAX_VALUE;
    private  String name;
    private  String header;
    private  String footer;

    public int getId() {
        return id;
    }

    public GroupeData withId(int id) {
        this.id = id;
        return this;
    }

    public GroupeData withName(String name) {
        this.name = name;
        return this;
    }

    public GroupeData withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupeData withFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public String getName() {
        return name;
    }


    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupeData that = (GroupeData) o;

        if (id != that.id) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GroupeData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
