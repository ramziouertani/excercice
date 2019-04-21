package org.my.ex;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeRange {

@JsonProperty("beg_time")
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "mm:ss.SS")
private OffsetDateTime begTime = null;

@JsonProperty("end_time")
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "mm:ss.SS")
private OffsetDateTime endTime = null;

}
