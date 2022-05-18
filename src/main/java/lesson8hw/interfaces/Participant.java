package lesson8hw.interfaces;

public interface Participant extends Run, Jump {
    String getName();
    int getDistance();
    int getHeight();
}
