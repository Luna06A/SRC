package model;

public class Event {
    private int eventId;
    private String eventName;
    private String date;

    public Event() {}

    public Event(int eventId, String eventName, String date) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
    }

    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }

    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}