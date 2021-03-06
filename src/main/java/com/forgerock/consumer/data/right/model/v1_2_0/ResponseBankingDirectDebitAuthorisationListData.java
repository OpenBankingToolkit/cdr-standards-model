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
package com.forgerock.consumer.data.right.model.v1_2_0;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResponseBankingDirectDebitAuthorisationListData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-05T15:02:30.647705Z[Europe/London]")
public class ResponseBankingDirectDebitAuthorisationListData {
    @JsonProperty("directDebitAuthorisations")
    @Valid
    private List<BankingDirectDebit> directDebitAuthorisations = new ArrayList<BankingDirectDebit>();

    public ResponseBankingDirectDebitAuthorisationListData directDebitAuthorisations(List<BankingDirectDebit> directDebitAuthorisations) {
        this.directDebitAuthorisations = directDebitAuthorisations;
        return this;
    }

    public ResponseBankingDirectDebitAuthorisationListData addDirectDebitAuthorisationsItem(BankingDirectDebit directDebitAuthorisationsItem) {
        this.directDebitAuthorisations.add(directDebitAuthorisationsItem);
        return this;
    }

    /**
     * The list of authorisations returned
     * @return directDebitAuthorisations
     **/
    @ApiModelProperty(required = true, value = "The list of authorisations returned")
    @NotNull
    @Valid
    public List<BankingDirectDebit> getDirectDebitAuthorisations() {
        return directDebitAuthorisations;
    }

    public void setDirectDebitAuthorisations(List<BankingDirectDebit> directDebitAuthorisations) {
        this.directDebitAuthorisations = directDebitAuthorisations;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingDirectDebitAuthorisationListData responseBankingDirectDebitAuthorisationListData = (ResponseBankingDirectDebitAuthorisationListData) o;
        return Objects.equals(this.directDebitAuthorisations, responseBankingDirectDebitAuthorisationListData.directDebitAuthorisations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directDebitAuthorisations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseBankingDirectDebitAuthorisationListData {\n");

        sb.append("    directDebitAuthorisations: ").append(toIndentedString(directDebitAuthorisations)).append("\n");
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
