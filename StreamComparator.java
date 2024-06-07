import java.util.Comparator;

class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream s1, Stream s2) {
        return Integer.compare(s1.getStudyGroups().size(), s2.getStudyGroups().size());
    }
}
