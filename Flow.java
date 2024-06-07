import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudyGroup {
    // Допустим, у нас есть класс УчебнаяГруппа с какими-то полями и методами
}

class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream() {
        this.studyGroups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        studyGroups.add(group);
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}
