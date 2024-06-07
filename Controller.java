import java.util.ArrayList;
import java.util.List;

class Controller {
    private StreamService streamService;

    public Controller() {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }

    public static void main(String[] args) {
        // Создаем несколько потоков
        Stream stream1 = new Stream();
        stream1.addGroup(new StudyGroup());
        stream1.addGroup(new StudyGroup());

        Stream stream2 = new Stream();
        stream2.addGroup(new StudyGroup());

        Stream stream3 = new Stream();
        stream3.addGroup(new StudyGroup());
        stream3.addGroup(new StudyGroup());
        stream3.addGroup(new StudyGroup());

        // Добавляем их в список
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Создаем контроллер и сортируем потоки
        Controller controller = new Controller();
        controller.sortStreams(streams);

        // Выводим результат
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudyGroups().size() + " groups");
        }
    }
}
