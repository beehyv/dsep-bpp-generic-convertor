package com.beehyv.dsep.model;

import java.net.URI;
import java.util.Objects;
import com.beehyv.dsep.model.Schedule;
import com.beehyv.dsep.model.TimeRange;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes time in its various forms. It can be a single point in time; duration; or a structured timetable of operations
 */

@Schema(name = "Time", description = "Describes time in its various forms. It can be a single point in time; duration; or a structured timetable of operations")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T15:22:03.145011300+05:30[Asia/Calcutta]")
public class Time {

  @JsonProperty("label")
  private String label;

  @JsonProperty("timestamp")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  @JsonProperty("duration")
  private String duration;

  @JsonProperty("range")
  private TimeRange range;

  @JsonProperty("days")
  private String days;

  @JsonProperty("schedule")
  private Schedule schedule;

  public Time label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", required = false)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Time timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", required = false)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Time duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Describes duration as per ISO8601 format
   * @return duration
  */
  
  @Schema(name = "duration", description = "Describes duration as per ISO8601 format", required = false)
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Time range(TimeRange range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   * @return range
  */
  @Valid 
  @Schema(name = "range", required = false)
  public TimeRange getRange() {
    return range;
  }

  public void setRange(TimeRange range) {
    this.range = range;
  }

  public Time days(String days) {
    this.days = days;
    return this;
  }

  /**
   * comma separated values representing days of the week
   * @return days
  */
  
  @Schema(name = "days", description = "comma separated values representing days of the week", required = false)
  public String getDays() {
    return days;
  }

  public void setDays(String days) {
    this.days = days;
  }

  public Time schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @Valid 
  @Schema(name = "schedule", required = false)
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Time time = (Time) o;
    return Objects.equals(this.label, time.label) &&
        Objects.equals(this.timestamp, time.timestamp) &&
        Objects.equals(this.duration, time.duration) &&
        Objects.equals(this.range, time.range) &&
        Objects.equals(this.days, time.days) &&
        Objects.equals(this.schedule, time.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, timestamp, duration, range, days, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Time {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

