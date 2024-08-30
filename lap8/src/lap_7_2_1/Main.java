package lap_7_2_1;
import java.util.Iterator;

public class Main {

	public interface Containers {
        public Iterator getIterator();
    }

    public class NameRepository implements Containers {
        String[] names = { "John", "May", "Ryan" };

        public Iterator getIterator() {
            return new Iterator() {
                int index = 0;

                public boolean hasNext() {
                    return index < names.length;
                }

                public Object next() {
                    if (this.hasNext()) {
                        return names[index++];
                    }
                    return null;
                }
            };
        }
    }

    public static void main(String[] args) {
        Main main = new Main(); // สร้างอ็อบเจ็กต์ของ Main
        NameRepository namesRepository = main.new NameRepository(); // สร้างอ็อบเจ็กต์ของ NameRepository
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
