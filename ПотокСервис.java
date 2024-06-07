import java.util.Collections;
import java.util.List;

class StreamService {

    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
