package com.kostya_ubutnu.notes.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;

import java.io.Serializable;

@Entity(tableName = "NoteTable")
public class Note implements Serializable {

    private @PrimaryKey(autoGenerate = true) int id;
    private String date;
    private String title;
    private String text;

    private String hour;
    private String minute;
    private Long selectedTime;
    public Note() {
    }


    public Note(String date, String title, String text, String hour, String minute, Long selectedTime) {
        this.date = date;
        this.title = title;
        this.text = text;
        this.hour = hour;
        this.minute = minute;
        this.selectedTime = selectedTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public Long getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(Long selectedTime) {
        this.selectedTime = selectedTime;
    }
}
