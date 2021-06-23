package gov.fema.geo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Hidden
@Entity
@Getter @Setter @NoArgsConstructor
public class Layer {
    @Id
    @GeneratedValue
    private Long id;
    private String shortName;
    private String longName;
    private String description;
    private String steward;
    private String sourceLayer;
    private String sourceLocation;
    private String cloudvaultLocation;
    private String maclocation;
    private String oracletable;
    private String fileName;
    private String fileSize;
    private String docreqs;
    private String goal;
    private Long numberofrecords = 9877l;
    private Long numberofcolumns = 23l;
    private Long dataelements = 34l;
    private String approvalPtapia;
    private String approvalIsso;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
