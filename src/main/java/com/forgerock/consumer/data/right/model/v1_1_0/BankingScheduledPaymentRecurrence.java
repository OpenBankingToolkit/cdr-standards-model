/**
 * Copyright 2019 ForgeRock AS.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.forgerock.consumer.data.right.model.v1_1_0;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Object containing the detail of the schedule for the payment
 */
@ApiModel(description = "Object containing the detail of the schedule for the payment")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-05T15:13:05.282441Z[Europe/London]")
public class BankingScheduledPaymentRecurrence {
    @JsonProperty("nextPaymentDate")
    private String nextPaymentDate = null;

    /**
     * The type of recurrence used to define the schedule
     */
    public enum RecurrenceUTypeEnum {
        ONCEOFF("onceOff"),

        INTERVALSCHEDULE("intervalSchedule"),

        LASTWEEKDAY("lastWeekDay"),

        EVENTBASED("eventBased");

        private String value;

        RecurrenceUTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RecurrenceUTypeEnum fromValue(String text) {
            for (RecurrenceUTypeEnum b : RecurrenceUTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("recurrenceUType")
    private RecurrenceUTypeEnum recurrenceUType = null;

    @JsonProperty("onceOff")
    private BankingScheduledPaymentRecurrenceOnceOff onceOff = null;

    @JsonProperty("intervalSchedule")
    private BankingScheduledPaymentRecurrenceIntervalSchedule intervalSchedule = null;

    @JsonProperty("lastWeekDay")
    private BankingScheduledPaymentRecurrenceLastWeekday lastWeekDay = null;

    @JsonProperty("eventBased")
    private BankingScheduledPaymentRecurrenceEventBased eventBased = null;

    public BankingScheduledPaymentRecurrence nextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
        return this;
    }

    /**
     * The date of the next payment under the recurrence schedule
     * @return nextPaymentDate
     **/
    @ApiModelProperty(value = "The date of the next payment under the recurrence schedule")

    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public BankingScheduledPaymentRecurrence recurrenceUType(RecurrenceUTypeEnum recurrenceUType) {
        this.recurrenceUType = recurrenceUType;
        return this;
    }

    /**
     * The type of recurrence used to define the schedule
     * @return recurrenceUType
     **/
    @ApiModelProperty(required = true, value = "The type of recurrence used to define the schedule")
    @NotNull

    public RecurrenceUTypeEnum getRecurrenceUType() {
        return recurrenceUType;
    }

    public void setRecurrenceUType(RecurrenceUTypeEnum recurrenceUType) {
        this.recurrenceUType = recurrenceUType;
    }

    public BankingScheduledPaymentRecurrence onceOff(BankingScheduledPaymentRecurrenceOnceOff onceOff) {
        this.onceOff = onceOff;
        return this;
    }

    /**
     * Get onceOff
     * @return onceOff
     **/
    @ApiModelProperty(value = "")

    @Valid
    public BankingScheduledPaymentRecurrenceOnceOff getOnceOff() {
        return onceOff;
    }

    public void setOnceOff(BankingScheduledPaymentRecurrenceOnceOff onceOff) {
        this.onceOff = onceOff;
    }

    public BankingScheduledPaymentRecurrence intervalSchedule(BankingScheduledPaymentRecurrenceIntervalSchedule intervalSchedule) {
        this.intervalSchedule = intervalSchedule;
        return this;
    }

    /**
     * Get intervalSchedule
     * @return intervalSchedule
     **/
    @ApiModelProperty(value = "")

    @Valid
    public BankingScheduledPaymentRecurrenceIntervalSchedule getIntervalSchedule() {
        return intervalSchedule;
    }

    public void setIntervalSchedule(BankingScheduledPaymentRecurrenceIntervalSchedule intervalSchedule) {
        this.intervalSchedule = intervalSchedule;
    }

    public BankingScheduledPaymentRecurrence lastWeekDay(BankingScheduledPaymentRecurrenceLastWeekday lastWeekDay) {
        this.lastWeekDay = lastWeekDay;
        return this;
    }

    /**
     * Get lastWeekDay
     * @return lastWeekDay
     **/
    @ApiModelProperty(value = "")

    @Valid
    public BankingScheduledPaymentRecurrenceLastWeekday getLastWeekDay() {
        return lastWeekDay;
    }

    public void setLastWeekDay(BankingScheduledPaymentRecurrenceLastWeekday lastWeekDay) {
        this.lastWeekDay = lastWeekDay;
    }

    public BankingScheduledPaymentRecurrence eventBased(BankingScheduledPaymentRecurrenceEventBased eventBased) {
        this.eventBased = eventBased;
        return this;
    }

    /**
     * Get eventBased
     * @return eventBased
     **/
    @ApiModelProperty(value = "")

    @Valid
    public BankingScheduledPaymentRecurrenceEventBased getEventBased() {
        return eventBased;
    }

    public void setEventBased(BankingScheduledPaymentRecurrenceEventBased eventBased) {
        this.eventBased = eventBased;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentRecurrence bankingScheduledPaymentRecurrence = (BankingScheduledPaymentRecurrence) o;
        return Objects.equals(this.nextPaymentDate, bankingScheduledPaymentRecurrence.nextPaymentDate) &&
                Objects.equals(this.recurrenceUType, bankingScheduledPaymentRecurrence.recurrenceUType) &&
                Objects.equals(this.onceOff, bankingScheduledPaymentRecurrence.onceOff) &&
                Objects.equals(this.intervalSchedule, bankingScheduledPaymentRecurrence.intervalSchedule) &&
                Objects.equals(this.lastWeekDay, bankingScheduledPaymentRecurrence.lastWeekDay) &&
                Objects.equals(this.eventBased, bankingScheduledPaymentRecurrence.eventBased);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextPaymentDate, recurrenceUType, onceOff, intervalSchedule, lastWeekDay, eventBased);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BankingScheduledPaymentRecurrence {\n");

        sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
        sb.append("    recurrenceUType: ").append(toIndentedString(recurrenceUType)).append("\n");
        sb.append("    onceOff: ").append(toIndentedString(onceOff)).append("\n");
        sb.append("    intervalSchedule: ").append(toIndentedString(intervalSchedule)).append("\n");
        sb.append("    lastWeekDay: ").append(toIndentedString(lastWeekDay)).append("\n");
        sb.append("    eventBased: ").append(toIndentedString(eventBased)).append("\n");
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
